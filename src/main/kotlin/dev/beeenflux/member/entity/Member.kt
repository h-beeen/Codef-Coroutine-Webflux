package dev.beeenflux.member.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table
import java.time.LocalDate

@Table("TB_MEMBER")
data class Member(
    @Id
    val id: Long? = null,
    val name: String,
    val birthdate: LocalDate,
    val contact: String?
)
