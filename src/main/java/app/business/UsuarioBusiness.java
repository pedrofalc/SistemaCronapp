package app.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
/**
 * Classe que representa a camada de negócios de UsuarioBusiness
 * 
 * @generated
 **/
@Service("UsuarioBusiness")
public class UsuarioBusiness {

    /**
     * Variável privada para verificação da criptofrafia
     * 
     * @generated
     */
     private String ENCRYPT = "$2a$10$";

    /**
     * Instância da classe UsuarioDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("UsuarioDAO")
    protected UsuarioDAO repository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Usuario post(final Usuario entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        // isEncryption() Senha
        String formSenha = entity.getSenha();
        String encryptionSenha = new BCryptPasswordEncoder()
            .encode(formSenha);
        entity.setSenha(encryptionSenha);      
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public Usuario get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Usuario result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Usuario put(final Usuario entity) throws Exception {
      // begin-user-code  
      // end-user-code
        // isEncryption() Senha
        String formSenha = entity.getSenha();
        String encryptionSenha = formSenha.startsWith(ENCRYPT) ? formSenha 
            : new BCryptPasswordEncoder().encode(formSenha);
        entity.setSenha(encryptionSenha);      
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Usuario> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Usuario> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Abastecimento> findAbastecimento(java.lang.String id,  Pageable pageable) {
      // begin-user-code
      // end-user-code  
      Page<Abastecimento> result = repository.findAbastecimento(id,  pageable );
      // begin-user-code  
      // end-user-code        
      return result;    
  }



}