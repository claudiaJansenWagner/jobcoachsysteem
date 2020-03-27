package nl.humanitas.controller;

import nl.humanitas.model.Deelnemer;
import nl.humanitas.model.psychosomatisch.Psychosomatisch;
import nl.humanitas.service.PsychosomatischService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PsychosomatischController {

	@Autowired
	private PsychosomatischService psychosomatischService;

	@GetMapping("/deelnemers/{deelnemerId}/psychosomatisch/{id}")
	public Optional<Psychosomatisch> getPsychosomatisch(@PathVariable String id) {
		return psychosomatischService.getPsychosomatisch(id);
	}

	@GetMapping("/deelnemers/{deelnemerId}/psychosomatisch")
	public List<Psychosomatisch> getPsychosomatischOverzicht() {

		return psychosomatischService.getAllPsychosomatisch();
	}
	
	@PostMapping("/deelnemers/{deelnemerId}/psychosomatisch")
	public void addPsychosomatisch(@RequestBody Psychosomatisch psychosomatisch, @PathVariable String deelnemerId) {
		psychosomatisch.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		psychosomatischService.addPsychosomatisch(psychosomatisch);
	}
	
	@PutMapping("deelnemers/{deelnemerId}/psychosomatisch/{id}")
	public void updatePsychosomatisch(@RequestBody Psychosomatisch psychosomatisch, @PathVariable String id, @PathVariable String deelnemerId) {
		psychosomatisch.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		psychosomatischService.updatePsychosomatisch(id, psychosomatisch);
	}
	
	@DeleteMapping("deelnemers/{deelnemerId}/psychosomatisch/{id}")
	public void deletePsychosomatisch(@RequestBody Psychosomatisch psychosomatisch, @PathVariable String id) {
		psychosomatischService.deletePsychosomatisch(id, psychosomatisch);
	}

}
