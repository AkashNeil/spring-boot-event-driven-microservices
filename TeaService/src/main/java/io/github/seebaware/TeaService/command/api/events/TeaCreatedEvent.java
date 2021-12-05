package io.github.seebaware.TeaService.command.api.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TeaCreatedEvent {

    private String teaId;
    private String name;
    private BigDecimal price;
    private Integer quantity;

}
