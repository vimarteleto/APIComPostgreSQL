package br.edu.fatecfranca.repositories;

import br.edu.fatecfranca.model.Casa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CasaRepository extends JpaRepository<Casa, Long> {

  // esta classe interface terá a disposição os métodos de BD para a classe Casa:
  // save
  // findAll
  // findById
  // delete
}
