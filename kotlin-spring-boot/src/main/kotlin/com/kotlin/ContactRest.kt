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

/**
 * Created by Admin on 1/15/2017.
 */
@RestController
@RequestMapping("/api/persons")
@Produces(MediaType.APPLICATION_JSON_VALUE + ";charset=utf-8")
class ContactRest {

    // access http://localhost:8080/api/persons/username/JohnSmith
    @CrossOrigin
    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/username/{username}")
    fun get(@PathVariable(value = "username") username: String): Response {

        return Response.ok("Found Person " + username).type(javax.ws.rs.core.MediaType.APPLICATION_JSON).build()
    }

    @CrossOrigin
    @RequestMapping(method = arrayOf(RequestMethod.POST), value = "/save")
    fun save(@RequestParam(value = "firstname") firstname: String, @RequestParam(value = "lastname") lastname: String): Response {

        return Response.ok(Status.OK).type(javax.ws.rs.core.MediaType.APPLICATION_JSON).build()
    }
}
