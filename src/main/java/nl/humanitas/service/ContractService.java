package nl.humanitas.service;

import nl.humanitas.model.Contract;
import nl.humanitas.repository.ContractRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ContractService {

	@Autowired
	ContractRepository contractRepository;
	
	public List<Contract> getAllContracten(String deelnemerId) {
		List<Contract> contracten = new ArrayList<>();
		contractRepository.findAllByDeelnemerId(deelnemerId).addAll(contracten);
		return contracten;
	}
	
	public Optional<Contract> getContract(String nummer) {
		return contractRepository.findById(nummer);
	}
	
	public void addContract(Contract contract) {
		contractRepository.save(contract);
	}
	
	public void updateContract(Contract contract) {
		contractRepository.save(contract);
	}
	
	public void deleteContract(String nummer) {
		contractRepository.deleteById(nummer);
	}
	
}
