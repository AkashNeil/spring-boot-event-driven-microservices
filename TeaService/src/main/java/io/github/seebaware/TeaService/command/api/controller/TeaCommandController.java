package io.github.seebaware.TeaService.command.api.controller;

import io.github.seebaware.TeaService.command.api.commands.CreateTeaCommand;
import io.github.seebaware.TeaService.command.api.model.TeaRestModel;
import org.axonframework.commandhandling.gateway.CommandGateway;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/teas")
public class TeaCommandController {

    private CommandGateway commandGateway;

    public TeaCommandController(CommandGateway commandGateway) {
        this.commandGateway = commandGateway;
    }

    @PostMapping
    public String addTea(@RequestBody TeaRestModel teaRestModel) {

        CreateTeaCommand createTeaCommand = CreateTeaCommand.builder()
                .teaId(UUID.randomUUID().toString())
                .name(teaRestModel.getName())
                .price(teaRestModel.getPrice())
                .quantity(teaRestModel.getQuantity())
                .build();

        return commandGateway.sendAndWait(createTeaCommand);

    }

}
