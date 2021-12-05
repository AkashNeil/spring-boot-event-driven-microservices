package io.github.seebaware.TeaService.command.api.events;

import io.github.seebaware.TeaService.command.api.data.entity.Tea;
import io.github.seebaware.TeaService.command.api.data.repo.TeaRepository;
import org.axonframework.eventhandling.EventHandler;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class TeaEventsHandler {

    private TeaRepository teaRepository;

    public TeaEventsHandler(TeaRepository teaRepository) {
        this.teaRepository = teaRepository;
    }

    @EventHandler
    public void on (TeaCreatedEvent teaCreatedEvent) {
        Tea tea = new Tea();
        BeanUtils.copyProperties(teaCreatedEvent, tea);
        teaRepository.save(tea);
    }

}
