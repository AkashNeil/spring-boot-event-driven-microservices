package io.github.seebaware.TeaService.command.api.data.repo;

import io.github.seebaware.TeaService.command.api.data.entity.Tea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaRepository extends JpaRepository<Tea, String> {

}
