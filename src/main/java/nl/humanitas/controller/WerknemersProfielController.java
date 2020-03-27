package nl.humanitas.controller;

import nl.humanitas.model.Deelnemer;
import nl.humanitas.model.werknemersprofiel.WerknemersProfiel;
import nl.humanitas.service.WerknemersProfielService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("deelnemers/{deelnemerId}")
public class WerknemersProfielController {

	@Autowired
	WerknemersProfielService werknemersProfielService;

	@GetMapping("/werknemersprofielen/{nummer}")
	public Optional<WerknemersProfiel> getWerknemersProfiel(@PathVariable String nummer) {
		return werknemersProfielService.getWerknemersprofiel(nummer);
	}

	@GetMapping("/werknemersprofielen")
	public List<WerknemersProfiel> getWerknemersProfielOverzicht(@PathVariable String deelnemerId) {
		return werknemersProfielService.getAllWerknemersProfielen(deelnemerId);
	}

	@PostMapping("/werknemersprofielen")
	public void addWerknemersProfiel(@RequestBody WerknemersProfiel werknemersProfiel,
									 @PathVariable String deelnemerId) {
		werknemersProfiel.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		werknemersProfielService.addWerknemersProfiel(werknemersProfiel);
	}

	@PutMapping("/werknemersprofielen/{nummer}")
	public void updateWerknemersProfiel(@RequestBody WerknemersProfiel werknemersProfiel, @PathVariable String nummer,
										@PathVariable String deelnemerId) {
		werknemersProfiel.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		werknemersProfielService.updateWerknemersProfiel(werknemersProfiel);
	}

	@DeleteMapping("/werknemersprofielen/{nummer}")
	public void deleteWerknemersProfiel(@RequestBody WerknemersProfiel werknemersProfiel,
										@PathVariable String nummer) {
		werknemersProfielService.deleteWerknemersProfiel(nummer);
	}
}
