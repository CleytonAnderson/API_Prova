package br.com.cleyton.projeto_spi_prova.repository;

import br.com.cleyton.projeto_spi_prova.domain.ProjectHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectHistoryRepository extends JpaRepository<ProjectHistory, Long> {

}
