package donny.application.models.forms;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AddBookForm {
    @NotBlank(message = "Judul tidak boleh kosong")
    private String title;
    @NotBlank(message = "Author tidak boleh kosong")
    private String author;
    private String year;
    private String isbn;
    private String pages;
    private String country;
    private String genre;
    private String language;
}
