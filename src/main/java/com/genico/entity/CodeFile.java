package com.genico.entity;
import com.genico.enums.DevStatus;
import jakarta.persistence.*;
import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class CodeFiles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String filePatch;

    @Enumerated(EnumType.STRING)
    private DevStatus developStatus;

    @Column(columnDefinition = "TEXT") // Для хранения больших объемов текста
    private String code;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ConversationHistory> conversationHistory;
}
