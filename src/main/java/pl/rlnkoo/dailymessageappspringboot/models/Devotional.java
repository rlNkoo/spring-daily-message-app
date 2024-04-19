package pl.rlnkoo.dailymessageappspringboot.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devotional {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String quote;

    String author;

    String imagePath;

    @Column(columnDefinition = "TEXT")
    String content;

    LocalDateTime createdAt;

    LocalDateTime updatedAt;

    LocalDate publishedAt;

    @Override
    public String toString() {
        return String.format("Devotional{id=%d, imagePath='%s', quote='%s', author='%s', content='%s', createdAt='%s', updatedAt='%s', publishedAt='%s'}",
        id, imagePath, quote, author, content, createdAt, updatedAt, publishedAt);
    }
}


















