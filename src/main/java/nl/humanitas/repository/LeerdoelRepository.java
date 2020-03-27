package nl.humanitas.repository;

import nl.humanitas.model.Leerdoel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LeerdoelRepository extends CrudRepository<Leerdoel, String> {

	List<Leerdoel> findAllByDeelnemerId(String deelnemerId);

}
