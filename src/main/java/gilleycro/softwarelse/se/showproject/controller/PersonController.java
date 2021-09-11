package gilleycro.softwarelse.se.showproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("")
@RequestMapping(value = "/api")
public class PersonController {

    @GetMapping("/helloworld")
    public String HelloWorld(){
        return "Hello world";
    }

}
