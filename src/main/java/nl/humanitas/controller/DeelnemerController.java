package nl.humanitas.controller;

import nl.humanitas.model.Deelnemer;
import nl.humanitas.service.DeelnemerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
public class DeelnemerController {

	@Autowired
	private DeelnemerService deelnemerService;

	@GetMapping("/deelnemers/{id}")
	public Optional<Deelnemer> getDeelnemer(@PathVariable String id) {
		return deelnemerService.getDeelnemer(id);
	}

	@GetMapping("/deelnemers")
	public List<Deelnemer> getDeelnemerOverzicht() {

		return deelnemerService.getAllDeelnemers();
	}
	
	@PostMapping("/deelnemers")
	public void addDeelnemer(@RequestBody Deelnemer deelnemer) {
		deelnemerService.addDeelnemer(deelnemer);
	}
	
	@PutMapping("deelnemers/{id}")
	public void updateDeelnemer(@RequestBody Deelnemer deelnemer, @PathVariable String id) {
		deelnemerService.updateDeelnemer(id, deelnemer);
	}
	
	@DeleteMapping("deelnemers/{id}")
	public void deleteDeelnemer(@RequestBody Deelnemer deelnemer, @PathVariable String id) {
		deelnemerService.deleteDeelnemer(id, deelnemer);
	}

}
