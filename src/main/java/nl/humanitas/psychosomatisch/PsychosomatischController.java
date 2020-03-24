package nl.humanitas.psychosomatisch;

import java.util.List;
import java.util.Optional;

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
		psychosomatisch.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));;
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
