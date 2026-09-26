package projetofaculdade.com.pix.servico;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import projetofaculdade.com.pix.model.Usuario;
import projetofaculdade.com.pix.repository.UsuarioRepository;

@Service
@AllArgsConstructor
public class UsuarioServico {
    // TODO AQUI VOCE IRA COLOCAR A LÓGICA ENVOLVENDO O  USUÁRIO
    // CRUD é o acrónimo para Create (Criar), Read (Ler), Update (Atualizar) e Delete (Apagar)

    private final UsuarioRepository usuarioRepository;

    public Usuario buscaUsuario(Long id) {
        Usuario usuario = usuarioRepository.getById(id);
        return usuario;
    }

    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario atualizarUsuario(Usuario usuario) {
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return usuarioSalvo;
    }

    public void deletarUsuario(Usuario usuario) {
        usuarioRepository.delete(usuario);
    }
    public Usuario validarLogin(String login, String senha) {
        Usuario usuario = usuarioRepository.findByLogin(login);
        if (usuario == null) {
            throw new RuntimeException("Usuário não encontrado");
        }
        if (!usuario.getSenha().equals(senha)) {
            throw new RuntimeException("Senha incorreta");
        }
        return usuario;
    }
}