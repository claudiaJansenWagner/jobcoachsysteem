package nl.humanitas.controller;

import nl.humanitas.model.Contract;
import nl.humanitas.model.Deelnemer;
import nl.humanitas.service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ContractController {

	@Autowired
	ContractService contractService;

	@GetMapping("deelnemers/{deelnemerId}/contracten/{nummer}")
	public Optional<Contract> getContract(@PathVariable String nummer) {
		return contractService.getContract(nummer);
	}

	@GetMapping("deelnemers/{deelnemerId}/contracten")
	public List<Contract> getContractOverzicht(@PathVariable String deelnemerId) {
		return contractService.getAllContracten(deelnemerId);
	}
	
	@PostMapping("/deelnemers/{deelnemerId}/contracten")
	public void addContract(@RequestBody Contract contract, @PathVariable String deelnemerId) {
		contract.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		contractService.addContract(contract);
	}
	
	@PutMapping("deelnemers/{deelnemerId}/contracten/{nummer}")
	public void updateContract(@RequestBody Contract contract, @PathVariable String nummer, @PathVariable String deelnemerId) {
		contract.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		contractService.updateContract(contract);
	}
	
	@DeleteMapping("deelnemers/{deelnemerId}/contracten/{nummer}")
	public void deleteContract(@RequestBody Contract contract, @PathVariable String nummer) {
		contractService.deleteContract(nummer);
	}
}
