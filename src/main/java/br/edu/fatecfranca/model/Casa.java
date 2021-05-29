package br.edu.fatecfranca.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(name="casa")
public class Casa implements Serializable {


  private static final long serialVersionUID = 849856927351487833L;
  @Id
  @GeneratedValue(strategy= GenerationType.IDENTITY) // valor gerado automaticamente e incremental
  private Long id;

  private String endereco;
  private int nro;
  private float tamanho;
  private boolean churrasqueira;

  public Casa(Long id, String endereco, int nro, float tamanho, boolean churrasqueira) {
    super();
    this.id = id;
    this.endereco = endereco;
    this.nro = nro;
    this.tamanho = tamanho;
    this.churrasqueira = churrasqueira;
  }

  public Casa() {
    super();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public int getNro() {
    return nro;
  }

  public void setNro(int nro) {
    this.nro = nro;
  }

  public float getTamanho() {
    return tamanho;
  }

  public void setTamanho(float tamanho) {
    this.tamanho = tamanho;
  }

  public boolean isChurrasqueira() {
    return churrasqueira;
  }

  public void setChurrasqueira(boolean churrasqueira) {
    this.churrasqueira = churrasqueira;
  }

}
