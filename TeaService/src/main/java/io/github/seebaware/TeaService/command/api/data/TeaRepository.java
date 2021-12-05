package io.github.seebaware.TeaService.command.api.data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TeaRepository extends JpaRepository<Tea, String> {

}
