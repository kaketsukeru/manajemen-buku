package donny.application.models.dtos;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class BookDto {
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
