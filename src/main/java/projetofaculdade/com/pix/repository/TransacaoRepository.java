package projetofaculdade.com.pix.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import projetofaculdade.com.pix.model.Transacao;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
}