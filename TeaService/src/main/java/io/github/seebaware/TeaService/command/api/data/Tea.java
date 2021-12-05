package io.github.seebaware.TeaService.command.api.data;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@Entity
public class Tea {

    @Id
    private String teaId;
    private String name;
    private BigDecimal price;
    private Integer quantity;
}
