package projetofaculdade.com.pix.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "transacao")
public class Transacao {


     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     @Column(name = "id")
     private Long id;

     @Column(name = "valor") //e-mail
     private Double valor;

     @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
     @JoinColumn(name = "destinatario", referencedColumnName = "id", nullable = false)
     private Usuario destinatario;

     @OneToOne(fetch = FetchType.LAZY, orphanRemoval = true)
     @JoinColumn(name = "remetente", referencedColumnName = "id", nullable = false)
     private Usuario remetente;

     @Column(name = "data")
     private LocalDateTime data;

     @Column(name = "status")
     private String status;
}