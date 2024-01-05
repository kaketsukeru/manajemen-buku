package donny.application.services;

import donny.application.models.Books;
import donny.application.models.dtos.BookDto;
import donny.application.models.forms.AddBookForm;
import donny.application.models.forms.EditBookForm;
import donny.application.models.mappers.BookMapper;
import donny.application.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
@Transactional
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public List<BookDto> findAll() throws Exception {
        Iterable<Books> books = bookRepository.findAll();
        if (books == null){
            throw new Exception("Data buku kosong");
        }
        return StreamSupport
                .stream(books.spliterator(), false)
                .map(BookMapper::toBaseDto)
                .collect(Collectors.toList());
    }

    @Override
    public BookDto findOne(Integer id) throws Exception {
        Books book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throw new Exception("Data tidak ditemukan");
        }
        return BookMapper.toDetailDto(book);
    }

    @Override
    public BookDto add(AddBookForm form) {
        Books book = new Books()
                .setTitle(form.getTitle())
                .setAuthor(form.getAuthor())
                .setYear(form.getYear())
                .setIsbn(form.getIsbn())
                .setPages(form.getPages())
                .setCountry(form.getCountry())
                .setGenre(form.getGenre())
                .setLanguage(form.getLanguage());
        bookRepository.save(book);
        return BookMapper.toDetailDto(book);
    }

    @Override
    public BookDto edit(EditBookForm form) throws Exception {
        Books book = bookRepository.findById(form.getId()).orElse(null);
        if (book == null){
            throw new Exception("Data tidak ditemukan");
        }
        book.setTitle(form.getTitle())
                .setAuthor(form.getAuthor())
                .setYear(form.getYear())
                .setIsbn(form.getIsbn())
                .setPages(form.getPages())
                .setCountry(form.getCountry())
                .setGenre(form.getGenre())
                .setLanguage(form.getLanguage());
        bookRepository.save(book);
        return BookMapper.toDetailDto(book);
    }

    @Override
    public BookDto delete(Integer id) throws Exception {
        Books book = bookRepository.findById(id).orElse(null);
        if (book == null){
            throw new Exception("Data tidak ditemukan");
        }
        bookRepository.deleteById(id);
        return BookMapper.toDetailDto(book);
    }
}
