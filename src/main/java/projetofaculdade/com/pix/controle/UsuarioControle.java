package projetofaculdade.com.pix.controle;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projetofaculdade.com.pix.model.Transacao;
import projetofaculdade.com.pix.model.Usuario;
import projetofaculdade.com.pix.servico.UsuarioServico;

@RestController
@RequestMapping(value = "/usuario")
@AllArgsConstructor
public class UsuarioControle {
    // TODO AQUI VAI SER ONDE IREI CONFIGURAR CHAMADAS HTTP
    // HTTP: GET(Recebe) Post(Insere) Put(Altera) Delete(Deleta)
    // localhost:8080/usuario
    private final UsuarioServico usuarioServico;

    // CRUD
    @GetMapping()
    public ResponseEntity<?> getById(@RequestParam(name = "id", required = false) Long id) {
        Usuario usuario = new Usuario();
        usuario = usuarioServico.buscaUsuario(id);
        System.out.println(usuario);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

    //    TODO FAZER O RESTO DO CRUD
    @PostMapping()
    public String salvar(@RequestBody Usuario usuario) {
        usuarioServico.salvarUsuario(usuario);
        return usuario.toString();
    }

    @PutMapping()
    public String alterar(@RequestBody Usuario usuario) {
        usuarioServico.atualizarUsuario(usuario);
        return usuario.toString();
    }

    @DeleteMapping()
    public String deletar(@RequestBody Usuario usuario) {
        usuarioServico.deletarUsuario(usuario);
        return "Usuário deletado com sucesso!";
    }

    @GetMapping("/login")
    public ResponseEntity<?> validarLogin(@RequestParam(name = "login") String login, @RequestParam(name = "senha") String senha) {
        Usuario usuario = usuarioServico.validarLogin(login, senha);
        return new ResponseEntity<>(usuario, HttpStatus.OK);
    }

//    @GetMapping()
//    public ResponseEntity<?> getById(@RequestParam(name = "id", required = false) Long id) {
//        Usuario usuario = new Usuario();
//        usuario = usuarioServico.buscaUsuario(id);
//        System.out.println(usuario);
//        return new ResponseEntity<>(usuario, HttpStatus.OK);
//    }
}