package br.edu.fatecfranca.controller;


import br.edu.fatecfranca.model.Casa;
import br.edu.fatecfranca.repositories.CasaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CasaController {

  // criar injecao de dependencias
  // usar métodos sem instanciar uma classe
  @Autowired
  CasaRepository injecao;

  @GetMapping("/casa")
  public List<Casa> get() {
    return injecao.findAll();
  }

  @PostMapping("/casa")
  public String add(@RequestBody Casa casa) {
    injecao.save(casa);
    return "Casa registrada com sucesso!";
  }

  @DeleteMapping("/casa/{id}")
  public String remove(@PathVariable Long id) {
    injecao.deleteById(id);
    return "Casa removida com sucesso!";
  }

  @PutMapping("/casa")
  public String update(@RequestBody Casa casa) {
    injecao.save(casa);
    return "Casa atualizada com sucesso!";
  }

}


