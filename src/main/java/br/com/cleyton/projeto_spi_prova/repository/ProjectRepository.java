package br.com.cleyton.projeto_spi_prova.repository;

import br.com.cleyton.projeto_spi_prova.domain.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
