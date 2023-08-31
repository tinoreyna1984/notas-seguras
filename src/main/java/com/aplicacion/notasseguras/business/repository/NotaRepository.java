package com.aplicacion.notasseguras.business.repository;

import com.aplicacion.notasseguras.business.entity.Nota;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotaRepository extends JpaRepository<Nota, Long> {
}
