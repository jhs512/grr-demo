package com.back.domain.home.home.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@RestController
class Ap1V1HomeController {

    @GetMapping("/")
    fun main(): Map<String, String> {
        val inetAddress = InetAddress.getLocalHost()  // 로컬 호스트 정보 가져오기

        return mapOf(
            "appNo" to "5",
            "hostname" to inetAddress.hostName,       // 호스트 이름
            "hostAddress" to inetAddress.hostAddress  // IP 주소
        )
    }
}