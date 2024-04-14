package com.project.nasa.setting.adapter.out.persistence.service.like.impl

import com.project.nasa.setting.adapter.`in`.web.apod.dto.RequestLike
import com.project.nasa.setting.adapter.out.persistence.entity.MemberEntity
import com.project.nasa.setting.adapter.out.persistence.entity.apod.ApodEntity
import com.project.nasa.setting.adapter.out.persistence.entity.like.LikeEntity
import com.project.nasa.setting.adapter.out.persistence.repository.apod.ApodEntityRepository
import com.project.nasa.setting.adapter.out.persistence.repository.like.LikeEntityRepository
import com.project.nasa.setting.adapter.out.persistence.repository.member.MemberEntityJpaRepository
import com.project.nasa.setting.adapter.out.persistence.service.like.LikeAdapter
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Transactional(readOnly = true)
@Service
class LikeAdapterImpl(
    val memberEntityJpaRepository: MemberEntityJpaRepository,
    val apodEntityRepository: ApodEntityRepository,
    val likeEntityRepository: LikeEntityRepository
) : LikeAdapter {
    @Transactional
    override fun incrementLike(requestLike: RequestLike): Int {
        if (likeEntityRepository.existsByMemberIdAndApodId(requestLike.memberId, requestLike.apodId)) {
            throw IllegalArgumentException("이미 좋아요를 눌렀습니다")
        }
        val apod: ApodEntity = apodEntityRepository.findById(requestLike.apodId)
            .orElseThrow { IllegalArgumentException("") }
        val member: MemberEntity = memberEntityJpaRepository.findById(requestLike.memberId)
            .orElseThrow { IllegalArgumentException("") }
        val likeEntity: LikeEntity = likeEntityRepository.save(
            LikeEntity(
                id = null,
                apod = apod,
                member = member
            )
        )
        apod.likes.add(likeEntity)
        member.likes.add(likeEntity)
        return apod.likes.size
    }
}