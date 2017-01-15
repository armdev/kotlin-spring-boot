package com.kotlin

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.CrossOrigin
import javax.ws.rs.Produces
import javax.ws.rs.core.Response
import javax.ws.rs.core.Response.Status
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import feign.Feign
import feign.gson.GsonDecoder
import com.kotlin.feign.GitHubServiceKotlin

/**
 * Created by Admin on 1/15/2017.
 */
@RestController
@RequestMapping("/api/github")
@Produces(MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
class GitHubResource {

    // access http://localhost:8080/api/github/username/armdev
    @CrossOrigin
    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/username/{username}")
    fun get(@PathVariable(value = "username") username: String): Response {
        val github = Feign.builder()
                .decoder(GsonDecoder())
                .target(GitHubServiceKotlin::class.java, "https://api.github.com")
        val repos = github.findGitHubRepositories(username)
        for (repo in repos) {
            //  println(repo)
        }

        return Response.ok(repos.toString()).type(javax.ws.rs.core.MediaType.APPLICATION_JSON).build()
    }

}
