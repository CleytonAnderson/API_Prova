package br.com.cleyton.projeto_spi_prova.service;

import br.com.cleyton.projeto_spi_prova.domain.Project;
import br.com.cleyton.projeto_spi_prova.repository.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ProjectService {
        @Autowired
        private ProjectRepository projectRepository;

        public Project save(Project project){
            return projectRepository.save(project);
        }

        public Project findById(Long id){
            return projectRepository
                    .findById(id)
                    .orElseThrow(NoSuchElementException::new);
        }

        public List<Project> findAll(){
            return projectRepository.findAll();
        }


        public void deleteById(Long id) {
            projectRepository.deleteById(id);
        }
    }

