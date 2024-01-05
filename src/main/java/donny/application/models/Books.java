package donny.application.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
@Entity
@Table(name = "books")
public class Books {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;
    private String title;
    private String author;
    private String year;
    private String isbn;
    private String pages;
    private String country;
    private String genre;
    private String language;
}
