package nl.humanitas.repository;

import nl.humanitas.model.contract.Contract;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ContractRepository extends CrudRepository<Contract, String> {

	List<Contract> findAllByDeelnemerId(String deelnemerId);

}
