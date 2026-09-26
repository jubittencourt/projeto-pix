package projetofaculdade.com.pix.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios") //o nome da Tabela do Banco de Dados que essa Classe é referente
public class Usuario extends Pessoa {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "login") //e-mail
    private String login;

    @Column(name = "senha")
    private String senha;


}