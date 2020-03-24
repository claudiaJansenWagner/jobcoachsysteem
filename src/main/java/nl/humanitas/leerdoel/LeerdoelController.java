package nl.humanitas.leerdoel;

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
public class LeerdoelController {

	@Autowired
	LeerdoelService leerdoelService;

	@GetMapping("deelnemers/{deelnemerId}/leerdoelen/{leerdoelId}")
	public Optional<Leerdoel> getLeerdoel(@PathVariable String nummer) {
		return leerdoelService.getLeerdoel(nummer);
	}

	@GetMapping("deelnemers/{deelnemerId}/leerdoelen")
	public List<Leerdoel> getLeerdoelOverzicht(@PathVariable String deelnemerId) {
		return leerdoelService.getAllLeerdoelen(deelnemerId);
	}

	@PostMapping("/deelnemers/{deelnemerId}/leerdoelen")
	public void addLeerdoel(@RequestBody Leerdoel leerdoel, @PathVariable String deelnemerId) {
		leerdoel.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		leerdoelService.addLeerdoel(leerdoel);
	}

	@PutMapping("deelnemers/{deelnemerId}/leerdoelen/{leerdoelId}")
	public void updateLeerdoel(@RequestBody Leerdoel leerdoel, @PathVariable String nummer,
			@PathVariable String deelnemerId) {
		leerdoel.setDeelnemer(new Deelnemer(deelnemerId, "", "", "", "", ""));
		leerdoelService.updateLeerdoel(leerdoel);
	}

	@DeleteMapping("deelnemers/{deelnemerId}/leerdoelen/{leerdoelId}")
	public void deleteLeerdoel(@RequestBody Leerdoel leerdoel, @PathVariable String nummer) {
		leerdoelService.deleteLeerdoel(nummer);
	}

}
