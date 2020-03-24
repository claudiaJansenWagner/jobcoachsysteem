package nl.humanitas.gesprek;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface GesprekRepository extends CrudRepository<Gesprek, String> {
	
	public List<Gesprek> findAllByDeelnemerId(String deelnemerId);

}
