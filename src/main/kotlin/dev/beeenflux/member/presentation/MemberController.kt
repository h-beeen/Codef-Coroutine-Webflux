package dev.beeenflux.member.presentation

import dev.beeenflux.member.application.MemberService
import dev.beeenflux.member.entity.Member
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/v1/members")
class MemberController(
    private val memberService: MemberService
) {
    @GetMapping("/{id}")
    suspend fun getById(@PathVariable id: Long): Member? =
        memberService.findById(id)
}
