package nl.humanitas.service;

import nl.humanitas.model.werknemersprofiel.WerknemersProfiel;
import nl.humanitas.repository.WerknemersProfielRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class WerknemersProfielService {
    @Autowired
    WerknemersProfielRepository werknemersProfielRepository;

    public List<WerknemersProfiel> getAllWerknemersProfielen(String deelnemerId) {
        List<WerknemersProfiel> werknemersProfielen = new ArrayList<>();
        werknemersProfielRepository.findAllByDeelnemerId(deelnemerId).addAll(werknemersProfielen);
        return werknemersProfielen;
    }

    public Optional<WerknemersProfiel> getWerknemersprofiel(String id) {
        return werknemersProfielRepository.findById(id);
    }

    public void addWerknemersProfiel(WerknemersProfiel werknemersProfiel) {
        werknemersProfielRepository.save(werknemersProfiel);
    }

    public void updateWerknemersProfiel(WerknemersProfiel werknemersProfiel) {
        werknemersProfielRepository.save(werknemersProfiel);
    }

    public void deleteWerknemersProfiel(String id) {
        werknemersProfielRepository.deleteById(id);
    }
}
