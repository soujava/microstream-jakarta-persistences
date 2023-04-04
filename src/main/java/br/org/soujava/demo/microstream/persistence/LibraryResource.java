package br.org.soujava.demo.microstream.persistence;

import jakarta.inject.Singleton;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

/**
 *
 */
@Path("/hello")
@Singleton
public class LibraryResource {

    @GET
    public String sayHello() {
        return "Hello World";
    }
}
