package io.github.seebaware.TeaService.command.api.aggregate;

import io.github.seebaware.TeaService.command.api.commands.CreateTeaCommand;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.spring.stereotype.Aggregate;

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

    }

}
