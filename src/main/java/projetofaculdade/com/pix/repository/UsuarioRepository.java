package projetofaculdade.com.pix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetofaculdade.com.pix.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    // O repository do JPA, ele tem por padrão, getById (getBy valor da coluna), save
    Usuario findByLogin(String login);
}