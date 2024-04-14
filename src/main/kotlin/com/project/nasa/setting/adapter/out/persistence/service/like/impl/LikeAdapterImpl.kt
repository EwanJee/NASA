package com.project.nasa.setting.adapter.out.persistence.service.like.impl

import com.project.nasa.common.exception.ErrorCode
import com.project.nasa.common.exception.apod.ApodException
import com.project.nasa.common.exception.member.MemberException
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
    override fun pressLike(requestLike: RequestLike): Int {
        val apod: ApodEntity = apodEntityRepository.findById(requestLike.apodId)
            .orElseThrow { ApodException(ErrorCode.APOD_NOT_FOUND) }
        val member: MemberEntity = memberEntityJpaRepository.findById(requestLike.memberId)
            .orElseThrow { MemberException(ErrorCode.MEMBER_NOT_FOUND) }
        if (!likeEntityRepository.existsByMemberIdAndApodId(requestLike.memberId, requestLike.apodId)) { // 좋아요 1추가
            val likeEntity: LikeEntity = likeEntityRepository.save(
                LikeEntity(
                    id = null,
                    apod = apod,
                    member = member
                )
            )
            apod.likes.add(likeEntity)
            member.likes.add(likeEntity)
        }
        else{ // 좋아요 1감소
            val like : LikeEntity =
                likeEntityRepository.findByMemberIdAndApodId(requestLike.memberId, requestLike.apodId)
            likeEntityRepository.delete(like)
        }
        return apod.likes.size
    }
}