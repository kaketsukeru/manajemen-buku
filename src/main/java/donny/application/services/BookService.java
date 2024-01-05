package donny.application.services;

import donny.application.models.dtos.BookDto;
import donny.application.models.forms.AddBookForm;
import donny.application.models.forms.EditBookForm;

import java.util.List;

public interface BookService {
    List<BookDto> findAll() throws Exception;
    BookDto findOne(Integer id) throws Exception;
    BookDto add(AddBookForm form);
    BookDto edit(EditBookForm form) throws Exception;
    BookDto delete(Integer id) throws Exception;
}
