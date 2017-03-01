package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela USUARIO
 * @generated
 */
@Entity
@Table(name = "\"USUARIO\""
)
@XmlRootElement
public class Usuario implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 1531810550l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Column(name = "email", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String email;
  /**
   * @generated
   */
  @Column(name = "senha", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String senha;
  
  /**
   * Construtor
   * @generated
   */
  public Usuario(){
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
  public Usuario setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém email
   * @param email email
   * return email
   * @generated
   */
  public java.lang.String getEmail(){
    return this.email;
  }
  
  /**
   * Define email
   * @param email email
   * @generated
   */
  public Usuario setEmail(java.lang.String email){
    this.email = email;
    return this;
  }
  
  /**
   * Obtém senha
   * @param senha senha
   * return senha
   * @generated
   */
  public java.lang.String getSenha(){
    return this.senha;
  }
  
  /**
   * Define senha
   * @param senha senha
   * @generated
   */
  public Usuario setSenha(java.lang.String senha){
    this.senha = senha;
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
      
      if(!(obj instanceof Usuario))
        return false;
      
      Usuario other = (Usuario)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}