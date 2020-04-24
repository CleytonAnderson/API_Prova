package br.com.cleyton.projeto_spi_prova.repository;

import br.com.cleyton.projeto_spi_prova.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
