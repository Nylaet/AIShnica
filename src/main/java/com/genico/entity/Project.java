package com.genico.entity;

import lombok.Data;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String description;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private String filePath;
    private String gitUrl;

    @Enumerated(EnumType.STRING)
    private DevStatus developStatus;

    @OneToMany(cascade = CascadeType.ALL)
    private List<CodeFile> codeFiles;

    @OneToMany(cascade = CascadeType.ALL)
    private List<ConversationHistory> conversationHistory;

    @OneToMany(cascade = CascadeType.ALL)
    private List<AI> connectedAI;
}