package nl.humanitas.repository;

import nl.humanitas.model.Deelnemer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeelnemerRepository extends CrudRepository<Deelnemer, String> {

}
