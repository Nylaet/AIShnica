package com.genico.entity;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
@Data
public class AISetting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name cannot be blank")
    @Size(max = 255, message = "Name cannot exceed 255 characters")
    private String name;

    @NotBlank(message = "Value cannot be blank")
    @Size(max = 1000, message = "Value cannot exceed 1000 characters")
    private String value;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    // Конструктор по умолчанию (необходим для JPA)
    public AISetting() {
    }

    // Конструктор с параметрами
    public AISetting(String name, String value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }
}
