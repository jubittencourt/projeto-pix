package projetofaculdade.com.pix.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetofaculdade.com.pix.model.Transacao;
import projetofaculdade.com.pix.repository.TransacaoRepository;

import java.util.List;

@Service
public class TransacaoServico {

    @Autowired
    private TransacaoRepository transacaoRepository;

    public Transacao criarTransacao(Transacao transacao) {
        return transacaoRepository.save(transacao); // agora salva!
    }

    public List<Transacao> listarTransacoes() {
        return transacaoRepository.findAll();
    }

    public Transacao buscarPorId(Long id) {
        return transacaoRepository.findById(id).orElse(null);
    }
}