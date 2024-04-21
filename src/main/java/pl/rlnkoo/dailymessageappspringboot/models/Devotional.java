package pl.rlnkoo.dailymessageappspringboot.models;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devotional implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

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