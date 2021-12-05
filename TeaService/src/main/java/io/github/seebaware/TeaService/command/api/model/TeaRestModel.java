package io.github.seebaware.TeaService.command.api.model;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class TeaRestModel {

    private String name;
    private BigDecimal price;
    public Integer quantity;

}
