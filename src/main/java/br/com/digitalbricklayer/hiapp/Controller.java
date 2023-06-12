package br.com.digitalbricklayer.hiapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/v1")
public class Controller {
 
    @GetMapping("/hi")
    String dizOi(){
        return "Oi, hora atual:  " + LocalDateTime.now();
    }

}
