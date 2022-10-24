package mariaoliveira.repositories;

import org.springframework.data.repository.CrudRepository;

import mariaoliveira.models.Professor;

public interface ProfessoresRepository extends CrudRepository<Professor, Integer> {
    
}