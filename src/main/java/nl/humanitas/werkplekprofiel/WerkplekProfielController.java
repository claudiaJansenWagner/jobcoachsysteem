package nl.humanitas.werkplekprofiel;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WerkplekProfielController {

	@GetMapping("/werkplekprofiel")
	public String returnWerkplekprofiel() {
		return "werkplekprofiel";
	}

	@GetMapping("/werkplekprofielen")
	public ArrayList<String> returnWerkplekprofielOverzicht() {
		ArrayList<String> werkplekprofielOverzicht = new ArrayList<String>();
		werkplekprofielOverzicht.add("Koen");
		werkplekprofielOverzicht.add("Nina");
		werkplekprofielOverzicht.add("Tim");
		return werkplekprofielOverzicht;
	}
}
