package com.genico.entity;

import lombok.Data;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import org.hibernate.validator.constraints.URL;

@Entity
@Data
public class AIURL {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "URL cannot be blank")
    @URL(message = "Invalid URL format")
    @Size(max = 1000, message = "URL cannot exceed 1000 characters")
    private String url;

    @Size(max = 1000, message = "Description cannot exceed 1000 characters")
    private String description;

    // Конструктор по умолчанию (необходим для JPA)
    public AIURL() {
    }

    // Конструктор с параметрами
    public AIURL(String url, String description) {
        this.url = url;
        this.description = description;
    }
}
