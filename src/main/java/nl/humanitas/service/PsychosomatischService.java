package nl.humanitas.service;

import nl.humanitas.model.psychosomatisch.Psychosomatisch;
import nl.humanitas.repository.PsychosomatischRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PsychosomatischService {

	@Autowired
	private PsychosomatischRepository psychosomatischRepository;

	public List<Psychosomatisch> getAllPsychosomatisch() {
		List<Psychosomatisch> deelnemers = new ArrayList<>();
		psychosomatischRepository.findAll().forEach(deelnemers::add);
		return deelnemers;
	}

	public Optional<Psychosomatisch> getPsychosomatisch(String id) {
		return psychosomatischRepository.findById(id);
	}

	public void addPsychosomatisch(Psychosomatisch deelnemer) {
		psychosomatischRepository.save(deelnemer);
	}

	public void updatePsychosomatisch(String id, Psychosomatisch psychosomatisch) {
		psychosomatischRepository.save(psychosomatisch);
	}

	public void deletePsychosomatisch(String id, Psychosomatisch psychosomatisch) {
		psychosomatischRepository.delete(psychosomatisch);
	}

}
