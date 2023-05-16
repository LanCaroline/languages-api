package com.dls.api.langaguesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LangagueController {

    @GetMapping(value = "/favourite-langague")
    public String processLangague(){
        return "Hello Jesus!";
    }

}
