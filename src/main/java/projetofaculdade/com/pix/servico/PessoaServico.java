package projetofaculdade.com.pix.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import projetofaculdade.com.pix.model.Pessoa;
import projetofaculdade.com.pix.model.Transacao;
import projetofaculdade.com.pix.repository.PessoaRepository;
import projetofaculdade.com.pix.repository.TransacaoRepository;

import java.util.List;

@Service
public class PessoaServico {

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa criarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa); // agora salva!
    }

    public List<Pessoa> listarPessoa() {
        return pessoaRepository.findAll();
    }

    public Pessoa buscarPorId(Long id) {
        return pessoaRepository.findById(id).orElse(null);
    }
}