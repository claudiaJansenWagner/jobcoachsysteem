package nl.humanitas.werknemersprofiel;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WerknemersProfielController {

	@GetMapping("/werknemersprofiel")
	public String returnWerknemersprofiel() {
		return "werknemersprofiel";
	}

	@GetMapping("/werknemersprofielen")
	public ArrayList<String> returnWerknemersprofielOverzicht() {
		ArrayList<String> werknemersprofielOverzicht = new ArrayList<String>();
		werknemersprofielOverzicht.add("Koen");
		werknemersprofielOverzicht.add("Ole");
		werknemersprofielOverzicht.add("Peter");
		return werknemersprofielOverzicht;
	}

}
