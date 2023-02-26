package ru.netology.demo1.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "files")
public class StorageFile {

    @Id
    @Column(nullable = false, unique = true)
    private String filename;

    @Column(nullable = false)
    private LocalDateTime date;

    @Column(nullable = false)
    private Long size;

    @Lob
    @Column(nullable = false)
    private byte[] fileContent;

    @ManyToOne
    private User user;
}
