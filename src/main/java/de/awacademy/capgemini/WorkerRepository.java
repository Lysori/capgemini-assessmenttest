package de.awacademy.capgemini;



import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import de.awacademy.capgemini.Worker;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface WorkerRepository extends CrudRepository<Worker, Integer> {

}
