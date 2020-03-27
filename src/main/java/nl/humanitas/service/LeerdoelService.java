package nl.humanitas.service;

import nl.humanitas.model.Leerdoel;
import nl.humanitas.repository.LeerdoelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LeerdoelService {

	@Autowired
	LeerdoelRepository leerdoelRepository;
	
	public List<Leerdoel> getAllLeerdoelen(String deelnemerId) {
		List<Leerdoel> leerdoelen = new ArrayList<>();
		leerdoelRepository.findAllByDeelnemerId(deelnemerId).addAll(leerdoelen);
		return leerdoelen;
	}
	
	public Optional<Leerdoel> getLeerdoel(String nummer) {
		return leerdoelRepository.findById(nummer);
	}
	
	public void addLeerdoel(Leerdoel leerdoel) {
		leerdoelRepository.save(leerdoel);
	}
	
	public void updateLeerdoel(Leerdoel leerdoel) {
		leerdoelRepository.save(leerdoel);
	}
	
	public void deleteLeerdoel(String leerdoelId) {
		leerdoelRepository.deleteById(leerdoelId);
	}
 
}
