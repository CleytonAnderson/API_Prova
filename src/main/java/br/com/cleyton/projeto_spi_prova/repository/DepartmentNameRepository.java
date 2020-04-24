package br.com.cleyton.projeto_spi_prova.repository;

import br.com.cleyton.projeto_spi_prova.domain.DepartmentName;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentNameRepository extends JpaRepository<DepartmentName, Long> {

}
