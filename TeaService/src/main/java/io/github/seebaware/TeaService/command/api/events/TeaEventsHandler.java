package io.github.seebaware.TeaService.command.api.events;

import io.github.seebaware.TeaService.command.api.data.Tea;
import io.github.seebaware.TeaService.command.api.data.TeaRepository;
import org.axonframework.config.ProcessingGroup;
import org.axonframework.eventhandling.EventHandler;
import org.axonframework.messaging.interceptors.ExceptionHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@ProcessingGroup("tea")
public class TeaEventsHandler {

    private TeaRepository teaRepository;

    public TeaEventsHandler(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @EventHandler
    public void on (TeaCreatedEvent teaCreatedEvent) throws Exception {
        Tea tea = new Tea();
        BeanUtils.copyProperties(teaCreatedEvent, tea);
        teaRepository.save(tea);
        throw new Exception("Exception in TeaEventsHandler!");
    }

    @ExceptionHandler
    public void handle(Exception exception) throws Exception {
        throw exception;
    }

}
