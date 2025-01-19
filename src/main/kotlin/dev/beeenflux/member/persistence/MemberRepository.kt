package dev.beeenflux.member.persistence

import dev.beeenflux.member.entity.Member
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import org.springframework.stereotype.Repository

@Repository
interface MemberRepository : CoroutineCrudRepository<Member, Long>
