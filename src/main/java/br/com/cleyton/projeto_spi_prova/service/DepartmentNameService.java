package br.com.cleyton.projeto_spi_prova.service;

import br.com.cleyton.projeto_spi_prova.domain.DepartmentName;
import br.com.cleyton.projeto_spi_prova.repository.DepartmentNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DepartmentNameService {
    @Autowired
    private DepartmentNameRepository departmentNameRepository;

    public DepartmentName save(DepartmentName departmentName){
        return departmentNameRepository.save(departmentName);
    }

    public DepartmentName findById(Long id){
        return departmentNameRepository
                .findById(id)
                .orElseThrow(NoSuchElementException::new);
    }

    public List<DepartmentName> findAll(){
        return departmentNameRepository.findAll();
    }


    public void deleteById(Long id) {
        departmentNameRepository.deleteById(id);
    }
}

