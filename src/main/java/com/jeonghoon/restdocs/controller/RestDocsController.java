package com.jeonghoon.restdocs.controller;

import com.jeonghoon.restdocs.response.RestDocsResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class RestDocsController {

    @GetMapping("rest-docs")
    public RestDocsResponse restDocsResponse() {
        return RestDocsResponse.builder()
                .name("jeonghoon")
                .build();
    }
}
