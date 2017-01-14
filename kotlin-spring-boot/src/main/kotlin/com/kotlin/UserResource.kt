
package com.kotlin

import javax.ws.rs.Path
import javax.ws.rs.GET
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod;
import javax.ws.rs.Produces
import org.springframework.http.MediaType;


/*

  @author Admin
  Created on Jan 15, 2017
*/

@RestController
@RequestMapping("/api/kotlin")
class UserResource {

    //http://localhost:8080/api/kotlin/time
    @RequestMapping(method = arrayOf(RequestMethod.GET), value = "/time")
    public fun get(): String {
        return "Kotlin time " + java.util.Date()
    }

}