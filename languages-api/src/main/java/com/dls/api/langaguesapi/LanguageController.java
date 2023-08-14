package com.dls.api.langaguesapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

@RestController
public class LanguageController {

    @Autowired
    private LanguageRepository repository;
    @GetMapping("/ranking")
    public List<Language> getLanguages(){
        List<Language> languages = repository.findAll();
        return languages;}


//    private List<Language> languages = List.of(
//            new Language(
//            "Java",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/java/java_256x256.png",
//            1),
//
//            new Language(
//            "PHP",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/php/php_256x256.png",
//            2),
//
//            new Language(
//            "C",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/c/c_256x256.png",
//            3),
//
//            new Language(
//            "CSharp",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/csharp/csharp_256x256.png",
//            2),
//
//            new Language(
//            "GO",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/go/go_256x256.png",
//            2),
//
//            new Language(
//            "Haskell",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/haskell/haskell_256x256.png",
//            2),
//
//            new Language(
//            "JavaScript",
//           "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/javascript/javascript_256x256.png",
//          2),
//
//            new Language(
//            "Kotlin",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/kotlin/kotlin_256x256.png",
//            2),
//
//            new Language(
//            "Lua",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/lua/lua_256x256.png",
//            2),
//
//            new Language(
//            "Python",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/python/python_256x256.png",
//            2),
//
//            new Language(
//            "R",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/r/r_256x256.png",
//            2),
//
//            new Language(
//            "Ruby",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/ruby/ruby_256x256.png",
//            2),
//
//            new Language(
//            "Swift",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/swift/swift_256x256.png",
//            2),
//
//            new Language(
//            "TypeScript",
//            "https://raw.githubusercontent.com/abrahamcalf/programming-languages-logos/master/src/typescript/typescript_256x256.png",
//            2));

}
