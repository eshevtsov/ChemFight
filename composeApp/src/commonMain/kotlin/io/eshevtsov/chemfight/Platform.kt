package io.eshevtsov.chemfight

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform