package nl.humanitas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class WerkplekProfielController {

	@GetMapping("/werkplekprofiel")
	public String returnWerkplekprofiel() {
		return "werkplekprofiel";
	}

	@GetMapping("/werkplekprofielen")
	public ArrayList<String> returnWerkplekprofielOverzicht() {
		ArrayList<String> werkplekprofielOverzicht = new ArrayList<>();
		werkplekprofielOverzicht.add("Koen");
		werkplekprofielOverzicht.add("Nina");
		werkplekprofielOverzicht.add("Tim");
		return werkplekprofielOverzicht;
	}
}
