package nl.humanitas.deelnemer;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeelnemerService {

	@Autowired
	private DeelnemerRepository deelnemerRepository;

	public List<Deelnemer> getAllDeelnemers() {
		List<Deelnemer> deelnemers = new ArrayList<>();
		deelnemerRepository.findAll().forEach(deelnemers::add);
		return deelnemers;
	}

	public Optional<Deelnemer> getDeelnemer(String id) {
		return deelnemerRepository.findById(id);
	}

	public void addDeelnemer(Deelnemer deelnemer) {
		deelnemerRepository.save(deelnemer);
	}

	public void updateDeelnemer(String id, Deelnemer deelnemer) {
		deelnemerRepository.save(deelnemer);
	}

	public void deleteDeelnemer(String id, Deelnemer deelnemer) {
		deelnemerRepository.delete(deelnemer);
	}

}
