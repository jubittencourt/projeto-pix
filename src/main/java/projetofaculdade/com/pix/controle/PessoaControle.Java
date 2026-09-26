package projetofaculdade.com.pix.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import projetofaculdade.com.pix.model.Pessoa;
import projetofaculdade.com.pix.model.Transacao;
import projetofaculdade.com.pix.servico.PessoaServico;


import java.util.List;

@RestController
@RequestMapping("/pessoa") // <- Agora o endpoint será /transacao
public class PessoaControle {

    @Autowired
    private PessoaServico pessoaServico;

    @PostMapping
    public Pessoa criarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaServico.criarPessoa(pessoa);
    }

    @PutMapping
    public Pessoa atualizarPessoa(@RequestBody Pessoa pessoa) {
        return pessoaServico.criarPessoa(pessoa);
    }


    @GetMapping
    public List<Pessoa> listarPessoa() {
        return pessoaServico.listarPessoa();
    }

    
    @GetMapping("/{id}")
    public Pessoa buscarPessoaPorId(@PathVariable Long id) {
        return pessoaServico.buscarPorId(id);
    }
}