package io.github.seebaware.TeaService.command.api.aggregate;

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

}
