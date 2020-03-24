package nl.humanitas.gesprek;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GesprekService {
	
	@Autowired
	GesprekRepository gesprekRepository;
	
	public List<Gesprek> getAllGesprekken(String deelnemerId) {
		List<Gesprek> gesprekken = new ArrayList<>();
		gesprekRepository.findAllByDeelnemerId(deelnemerId)
		.forEach(gesprekken::add);
		return gesprekken;
	}
	
	public Optional<Gesprek> getGesprek(String gesprekId) {
		return gesprekRepository.findById(gesprekId);
	}
	
	public void addGesprek(Gesprek gesprek) {
		gesprekRepository.save(gesprek);
	}
	
	public void updateGesprek(Gesprek gesprek) {
		gesprekRepository.save(gesprek);
	}
	
	public void deleteGesprek(String gesprekId) {
		gesprekRepository.deleteById(gesprekId);
	}

}
