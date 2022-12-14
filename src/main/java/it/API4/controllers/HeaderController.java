package it.API4.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class HeaderController {

    @GetMapping(value = "/host-info")
    public String infoHost(@RequestHeader HttpHeaders info){
        return info.getHost().toString() ;
    }
}
