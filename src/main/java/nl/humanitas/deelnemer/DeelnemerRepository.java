package nl.humanitas.deelnemer;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeelnemerRepository extends CrudRepository<Deelnemer, String> {

}
