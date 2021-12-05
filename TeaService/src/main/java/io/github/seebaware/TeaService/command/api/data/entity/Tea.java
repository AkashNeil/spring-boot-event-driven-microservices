package io.github.seebaware.TeaService.command.api.data.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
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
