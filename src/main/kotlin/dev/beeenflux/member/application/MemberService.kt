package dev.beeenflux.member.application

import dev.beeenflux.member.entity.Member
import dev.beeenflux.member.persistence.MemberRepository
import kotlinx.coroutines.flow.Flow
import org.springframework.stereotype.Service

@Service
class MemberService(
    private val memberRepository: MemberRepository
) {
    suspend fun findAll(): Flow<Member> = memberRepository.findAll()

    suspend fun save(member: Member): Member = memberRepository.save(member)

    suspend fun findById(id: Long): Member? = memberRepository.findById(id)
}
