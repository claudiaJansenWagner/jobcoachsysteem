package nl.humanitas.contract;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends CrudRepository<Contract, String> {
	
	public List<Contract> findAllByDeelnemerId(String deelnemerId);

}
