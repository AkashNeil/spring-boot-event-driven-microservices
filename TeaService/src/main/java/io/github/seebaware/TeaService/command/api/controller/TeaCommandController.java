package io.github.seebaware.TeaService.command.api.controller;

import io.github.seebaware.TeaService.command.api.model.TeaRestModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/teas")
public class TeaCommandController {



    @PostMapping
    public String addTea(@RequestBody TeaRestModel teaRestModel) {
        return "Tea added";
    }

}
