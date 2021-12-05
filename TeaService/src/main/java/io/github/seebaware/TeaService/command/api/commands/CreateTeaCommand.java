package io.github.seebaware.TeaService.command.api.commands;

import lombok.Builder;
import lombok.Data;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.math.BigDecimal;

@Data
@Builder
public class CreateTeaCommand {

    @TargetAggregateIdentifier
    private String teaId;
    private String name;
    private BigDecimal price;
    private Integer quantity;

}

