package com.coretronic.hpbu;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 * Created by Morris on 2016/12/19.
 */

@Path("/hello")
public class HelloWorld {

    @GET
    @Path("/say")
    public String sayHello(){
        return "Hello World!! m4";
    }

}
