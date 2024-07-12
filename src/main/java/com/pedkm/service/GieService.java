package com.pedkm.service;

import com.pedkm.entities.Gie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;


@Service
public class GieService {

    private final GieRepository gieRepository;



    public interface GieRepository extends JpaRepository<Gie, Long> {
        Optional<Gie> findByCode(String code);
    }
    @Autowired
    public GieService(GieRepository gieRepository) {
        this.gieRepository = gieRepository;
    }

    public Optional<Gie> getAllplateformeById(Long id) {

        return gieRepository.findById(id);
    }

    public Gie savePlateforme(Gie plateforme) {
        return gieRepository.save(plateforme);
    }

    public void deletePlateforme(Long id) {
        gieRepository.deleteById(id);
    }

    public List<Gie> getAllPlateforme() {
        return gieRepository.findAll();
    }

    public  Optional<Gie> getPlateformeById(Long id) {
        return gieRepository.findById(id);
    }
}
