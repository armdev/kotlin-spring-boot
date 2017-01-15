package com.kotlin.feign


import feign.Param
import feign.RequestLine

interface GitHubServiceKotlin {
    @RequestLine("GET /users/{user}/repos")
    fun findGitHubRepositories(@Param("user") user: String): List<Repositories>
}