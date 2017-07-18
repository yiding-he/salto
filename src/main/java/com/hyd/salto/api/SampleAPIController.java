package com.hyd.salto.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api/sample")
public class SampleAPIController {

    @GetMapping("/get-time")
    public Response getTime() {
        return Response.success().setAttribute("time", new Date());
    }
}
