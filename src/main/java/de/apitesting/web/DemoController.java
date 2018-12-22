package de.apitesting.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @RequestMapping("/pact")
        public String welcome() {
            return "{\"name\": \"Michael\"}";
        }

}
