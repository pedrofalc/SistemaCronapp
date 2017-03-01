package app.entity;
import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Classe que representa a tabela ABASTECIMENTO
 * @generated
 */
@Entity
@Table(name = "\"ABASTECIMENTO\""
)
@XmlRootElement
public class Abastecimento implements Serializable {

  /**
   * UID da classe, necessário na serialização 
   * @generated
   */
  private static final long serialVersionUID = 36299697l;
  
  /**
   * @generated
   */
  @Id
    
  @Column(name = "id", insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();
  /**
   * @generated
   */
  @Temporal(TemporalType.DATE)
  @Column(name = "data", nullable = false, unique = false, insertable=true, updatable=true)
  private java.util.Date data;
  /**
   * @generated
   */
  @Column(name = "quilometragemRodada", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double quilometragemRodada;
  /**
   * @generated
   */
  @Column(name = "litros", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double litros;
  /**
   * @generated
   */
  @Column(name = "combustivel", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.String combustivel;
  /**
   * @generated
   */
  @Column(name = "precoLitro", nullable = false, unique = false, insertable=true, updatable=true)
  private java.lang.Double precoLitro;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_usuario", referencedColumnName = "id", insertable=true, updatable=true)
  private Usuario usuario;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_carro", referencedColumnName = "id", insertable=true, updatable=true)
  private Carro carro;
  /**
   * @generated
   */
  @ManyToOne
  @JoinColumn(name="fk_posto", referencedColumnName = "id", insertable=true, updatable=true)
  private Posto posto;
  
  /**
   * Construtor
   * @generated
   */
  public Abastecimento(){
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
  public Abastecimento setId(java.lang.String id){
    this.id = id;
    return this;
  }
  
  /**
   * Obtém data
   * @param data data
   * return data
   * @generated
   */
  public java.util.Date getData(){
    return this.data;
  }
  
  /**
   * Define data
   * @param data data
   * @generated
   */
  public Abastecimento setData(java.util.Date data){
    this.data = data;
    return this;
  }
  
  /**
   * Obtém quilometragemRodada
   * @param quilometragemRodada quilometragemRodada
   * return quilometragemRodada
   * @generated
   */
  public java.lang.Double getQuilometragemRodada(){
    return this.quilometragemRodada;
  }
  
  /**
   * Define quilometragemRodada
   * @param quilometragemRodada quilometragemRodada
   * @generated
   */
  public Abastecimento setQuilometragemRodada(java.lang.Double quilometragemRodada){
    this.quilometragemRodada = quilometragemRodada;
    return this;
  }
  
  /**
   * Obtém litros
   * @param litros litros
   * return litros
   * @generated
   */
  public java.lang.Double getLitros(){
    return this.litros;
  }
  
  /**
   * Define litros
   * @param litros litros
   * @generated
   */
  public Abastecimento setLitros(java.lang.Double litros){
    this.litros = litros;
    return this;
  }
  
  /**
   * Obtém combustivel
   * @param combustivel combustivel
   * return combustivel
   * @generated
   */
  public java.lang.String getCombustivel(){
    return this.combustivel;
  }
  
  /**
   * Define combustivel
   * @param combustivel combustivel
   * @generated
   */
  public Abastecimento setCombustivel(java.lang.String combustivel){
    this.combustivel = combustivel;
    return this;
  }
  
  /**
   * Obtém precoLitro
   * @param precoLitro precoLitro
   * return precoLitro
   * @generated
   */
  public java.lang.Double getPrecoLitro(){
    return this.precoLitro;
  }
  
  /**
   * Define precoLitro
   * @param precoLitro precoLitro
   * @generated
   */
  public Abastecimento setPrecoLitro(java.lang.Double precoLitro){
    this.precoLitro = precoLitro;
    return this;
  }
  
  /**
   * Obtém usuario
   * @param usuario usuario
   * return usuario
   * @generated
   */
  public Usuario getUsuario(){
    return this.usuario;
  }
  
  /**
   * Define usuario
   * @param usuario usuario
   * @generated
   */
  public Abastecimento setUsuario(Usuario usuario){
    this.usuario = usuario;
    return this;
  }
  
  /**
   * Obtém carro
   * @param carro carro
   * return carro
   * @generated
   */
  public Carro getCarro(){
    return this.carro;
  }
  
  /**
   * Define carro
   * @param carro carro
   * @generated
   */
  public Abastecimento setCarro(Carro carro){
    this.carro = carro;
    return this;
  }
  
  /**
   * Obtém posto
   * @param posto posto
   * return posto
   * @generated
   */
  public Posto getPosto(){
    return this.posto;
  }
  
  /**
   * Define posto
   * @param posto posto
   * @generated
   */
  public Abastecimento setPosto(Posto posto){
    this.posto = posto;
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
      
      if(!(obj instanceof Abastecimento))
        return false;
      
      Abastecimento other = (Abastecimento)obj;
      
    if(this.id == null && other.id != null)
        return false;
      else if(!this.id.equals(other.id))
        return false;
  

      return true;
      
  }
}