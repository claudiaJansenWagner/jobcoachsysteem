package nl.humanitas.leerdoel;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LeerdoelRepository extends CrudRepository<Leerdoel, String> {
	
	public List<Leerdoel> findAllByDeelnemerId(String deelnemerId);

}
