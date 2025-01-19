package dev.beeenflux.global.error

interface ErrorEntity {
    val code: String
    val httpStatus: Int
    val message: String?
}
