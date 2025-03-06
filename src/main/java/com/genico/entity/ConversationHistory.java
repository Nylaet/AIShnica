package com.genico.entity;
import lombok.Data;
import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
public class ConversationHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime generationDateTime;

    @OneToOne(cascade = CascadeType.ALL)
    private List <AiRequestResponce> requestResponce;
}
