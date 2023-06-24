package com.obc.spring_deploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloController {
    @GetMapping("/hola")
    public String saludo() {
        return "Hola Nuevo Mundo desde pring_deploy";
    }
}
