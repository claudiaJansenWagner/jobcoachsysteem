package nl.humanitas.deelnemer;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
