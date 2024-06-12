package com.nasa.todaynasa.configuration.redis

import org.springframework.boot.autoconfigure.data.redis.RedisProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.redis.connection.RedisConnectionFactory
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory
import org.springframework.data.redis.core.RedisTemplate
import org.springframework.data.redis.core.SetOperations
import org.springframework.data.redis.repository.configuration.EnableRedisRepositories
import org.springframework.data.redis.serializer.StringRedisSerializer

@EnableRedisRepositories
@Configuration
class RedisConfig {
    val redisProperties: RedisProperties? = null

    @Bean
    fun redisConnectionFactory(): RedisConnectionFactory = LettuceConnectionFactory(redisProperties!!.host, redisProperties!!.port)

    @Bean
    fun redisTemplate(): RedisTemplate<*, *> =
        RedisTemplate<Any, Any>().apply {
            this.connectionFactory = redisConnectionFactory()

            // // "\xac\xed\x00" 같은 불필요한 해시값을 보지 않기 위해 serializer 설정
            this.keySerializer = StringRedisSerializer()
            this.hashKeySerializer = StringRedisSerializer()
            this.valueSerializer = StringRedisSerializer()
        }

    @Bean
    fun likeOps(redisTemplate: RedisTemplate<String, String>): SetOperations<String, String> = redisTemplate.opsForSet()
}
