package nl.humanitas.repository;

import nl.humanitas.model.Psychosomatisch;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PsychosomatischRepository extends CrudRepository<Psychosomatisch, String> {

	List<Psychosomatisch> findAllByDeelnemerId(String deelnemerId);

}
