package io.github.seebaware.TeaService.command.api.aggregate;

import io.github.seebaware.TeaService.command.api.commands.CreateTeaCommand;
import io.github.seebaware.TeaService.command.api.events.TeaCreatedEvent;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.spring.stereotype.Aggregate;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;

@Aggregate
public class TeaAggregate {

    @AggregateIdentifier
    private String teaId;
    private String name;
    private BigDecimal price;
    private Integer quantity;

    public TeaAggregate() {
    }

    public TeaAggregate(CreateTeaCommand createTeaCommand) {
        TeaCreatedEvent teaCreatedEvent = new TeaCreatedEvent();
        BeanUtils.copyProperties(createTeaCommand, teaCreatedEvent);
        AggregateLifecycle.apply(teaCreatedEvent);
    }

}
