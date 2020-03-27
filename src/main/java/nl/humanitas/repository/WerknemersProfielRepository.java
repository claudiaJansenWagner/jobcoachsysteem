package nl.humanitas.repository;

import nl.humanitas.model.werknemersprofiel.WerknemersProfiel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WerknemersProfielRepository extends CrudRepository<WerknemersProfiel, String> {

    List<WerknemersProfiel> findAllByDeelnemerId(String deelnemerId);
}
