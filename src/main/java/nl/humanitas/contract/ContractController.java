package nl.humanitas.contract;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import nl.humanitas.deelnemer.Deelnemer;

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
