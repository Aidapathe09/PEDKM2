package com.pedkm.repository;

import com.pedkm.entities.Gie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GieRepository
extends JpaRepository<Gie, Long> {
    
}
