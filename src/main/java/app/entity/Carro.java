package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela CARRO
 * @generated
 */
@Entity
@Table(name = "\"CARRO\""
)
@XmlRootElement
public class Carro implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 64880924l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "placa", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String placa;
  /**
   * @generated
   */
  @Column(name = "modelo", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String modelo;
  /**
   * @generated
   */
  @Column(name = "marca", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String marca;
  /**
   * @generated
   */
  @Column(name = "ano", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Integer ano;
  
  /**
   * Construtor
   * @generated
   */
  public Carro(){
  }

  
  /**
   * Obtém id
   * @param id id
   * return id
   * @generated
   */
  public java.lang.String getId(){
    return this.id;
  }
  
  /**
   * Define id
   * @param id id
   * @generated
   */
  public Carro setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém placa
   * @param placa placa
   * return placa
   * @generated
   */
  public java.lang.String getPlaca(){
    return this.placa;
  }
  
  /**
   * Define placa
   * @param placa placa
   * @generated
   */
  public Carro setPlaca(java.lang.String placa){
    this.placa = placa;
    return this;
  }
  
  /**
   * Obtém modelo
   * @param modelo modelo
   * return modelo
   * @generated
   */
  public java.lang.String getModelo(){
    return this.modelo;
  }
  
  /**
   * Define modelo
   * @param modelo modelo
   * @generated
   */
  public Carro setModelo(java.lang.String modelo){
    this.modelo = modelo;
    return this;
  }
  
  /**
   * Obtém marca
   * @param marca marca
   * return marca
   * @generated
   */
  public java.lang.String getMarca(){
    return this.marca;
  }
  
  /**
   * Define marca
   * @param marca marca
   * @generated
   */
  public Carro setMarca(java.lang.String marca){
    this.marca = marca;
    return this;
  }
  
  /**
   * Obtém ano
   * @param ano ano
   * return ano
   * @generated
   */
  public java.lang.Integer getAno(){
    return this.ano;
  }
  
  /**
   * Define ano
   * @param ano ano
   * @generated
   */
  public Carro setAno(java.lang.Integer ano){
    this.ano = ano;
    return this;
  }
  
  /**
   * @generated
   */
  @Override
  public int hashCode() {
        final int prime = 31;
        int result = 1;

        result = prime * result + ((id == null) ? 0 : id.hashCode());

        return result;
    }
  
  /**
   * @generated
   */ 
  @Override
    public boolean equals(Object obj) {
    
      if(this == obj)
        return true;
      
      if(obj == null)
        return false;
      
      if(!(obj instanceof Carro))
        return false;
      
      Carro other = (Carro)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}