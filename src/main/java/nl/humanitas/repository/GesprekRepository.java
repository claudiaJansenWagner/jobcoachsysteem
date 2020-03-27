package nl.humanitas.repository;

import nl.humanitas.model.gesprek.Gesprek;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface GesprekRepository extends CrudRepository<Gesprek, String> {

	List<Gesprek> findAllByDeelnemerId(String deelnemerId);

}
