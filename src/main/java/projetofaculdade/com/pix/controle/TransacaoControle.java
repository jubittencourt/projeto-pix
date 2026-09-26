package projetofaculdade.com.pix.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetofaculdade.com.pix.model.Transacao;
import projetofaculdade.com.pix.servico.TransacaoServico;

import java.util.List;

@RestController
@RequestMapping("/transacao") // <- Agora o endpoint será /transacao
public class TransacaoControle {

    @Autowired
    private TransacaoServico transacaoServico;

    @PostMapping
    public Transacao criarTransacao(@RequestBody Transacao transacao) {
        return transacaoServico.criarTransacao(transacao);
    }

    @GetMapping
    public List<Transacao> listarTransacoes() {
        return transacaoServico.listarTransacoes();
    }

    
    @GetMapping("/{id}")
    public Transacao buscarTransacaoPorId(@PathVariable Long id) {
        return transacaoServico.buscarPorId(id);
    }
}