package com.dls.api.langaguesapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@RestController
public class LanguageController {

    private List<Language> languages = List.of(
            new Language(
            "Java",
            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
            1),

            new Language(
            "PHP",
            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
            2));

    @GetMapping(value = "/favourite-language")
    public String processLanguage(){
        return "Come Ranking!";
    }

    @GetMapping(value = "/ranking")
    public List<Language> getLanguages(){return languages;}

}
