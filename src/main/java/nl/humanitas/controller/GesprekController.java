package nl.humanitas.controller;

import nl.humanitas.model.Deelnemer;
import nl.humanitas.model.gesprek.Gesprek;
import nl.humanitas.service.GesprekService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class GesprekController {

	@Autowired
	GesprekService gesprekService;

	@GetMapping("deelnemers/{deelnemerId}/gesprekken/{gesprekId}")
	public Optional<Gesprek> getGesprek(@PathVariable String gesprekId) {
		return gesprekService.getGesprek(gesprekId);
	}

	@GetMapping("deelnemers/{deelnemerId}/gesprekken")
	public List<Gesprek> getGesprekOverzicht(@PathVariable String deelnemerId) {
		return gesprekService.getAllGesprekken(deelnemerId);
	}

	@PostMapping("/deelnemers/{deelnemerId}/gesprekken")
	public void addContract(@RequestBody Gesprek gesprek, @PathVariable String deelnemerId) {
		gesprek.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		gesprekService.addGesprek(gesprek);
	}

	@PutMapping("deelnemers/{deelnemerId}/gesprekken/{gesprekId}")
	public void updateContract(@RequestBody Gesprek gesprek, @PathVariable String gesprekId,
			@PathVariable String deelnemerId) {
		gesprek.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		gesprekService.updateGesprek(gesprek);
	}

	@DeleteMapping("deelnemers/{deelnemerId}/gesprekken/{gesprekId}")
	public void deleteGesprek(@RequestBody Gesprek gesprek, @PathVariable String gesprekId) {
		gesprekService.deleteGesprek(gesprekId);
	}

}
