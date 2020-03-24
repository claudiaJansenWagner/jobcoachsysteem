package nl.humanitas.psychosomatisch;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsychosomatischRepository extends CrudRepository<Psychosomatisch, String> {
	
	public List<Psychosomatisch> findAllByDeelnemerId(String deelnemerId);

}
