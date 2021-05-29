package br.edu.fatecfranca.controller;


import br.edu.fatecfranca.model.Imobiliaria;
import br.edu.fatecfranca.repositories.ImobiliariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImobiliariaController {

  @Autowired
  ImobiliariaRepository injecao;

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @GetMapping("/imobiliaria")
  public List<Imobiliaria> get() {
    return injecao.findAll();
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @PostMapping("/imobiliaria")
  public String add(@RequestBody Imobiliaria imobiliaria) {
    injecao.save(imobiliaria);
    return "Casa registrada com sucesso!";
  }

  @CrossOrigin(origins = "http://127.0.0.1:5500")
  @DeleteMapping("/imobiliaria/{id}")
  public String remove(@PathVariable Long id) {
    injecao.deleteById(id);
    return "Casa removida com sucesso!";
  }

  @PutMapping("/imobiliaria")
  public String update(@RequestBody Imobiliaria imobiliaria) {
    injecao.save(imobiliaria);
    return "Casa atualizada com sucesso!";
  }


}
