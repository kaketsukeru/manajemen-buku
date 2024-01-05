package donny.application.controllers;

import donny.application.models.dtos.BookDto;
import donny.application.models.dtos.Response;
import donny.application.models.forms.AddBookForm;
import donny.application.models.forms.EditBookForm;
import donny.application.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/books")
public class LibraryApi {

    @Autowired
    BookService bookService;

    @GetMapping
    public Response findAll(){
        try {
            List<BookDto> result = bookService.findAll();
            return new Response().setMessage("Success").setData(result);
        }catch (Exception e){
            return new Response().setMessage(e.getMessage());
        }
    }

    @GetMapping("/{id}")
    public Response findOne(@PathVariable Integer id){
        try {
            BookDto result = bookService.findOne(id);
            return new Response().setMessage("Success").setData(Collections.singletonList(result));
        }catch (Exception e){
            return new Response().setMessage(e.getMessage());
        }
    }

    @PostMapping
    public Response add(AddBookForm form){
        BookDto result = bookService.add(form);
        return new Response().setMessage("Data buku berhasil ditambahkan").setData(Collections.singletonList(result));
    }

    @PutMapping
    public Response edit(EditBookForm form){
        try {
            BookDto result = bookService.edit(form);
            return new Response().setMessage("Data buku berhasil diubah").setData(Collections.singletonList(result));
        }catch (Exception e){
            return new Response().setMessage(e.getMessage());
        }
    }

    @DeleteMapping("/{id}")
    public Response delete(@PathVariable Integer id){
        try {
            BookDto result = bookService.delete(id);
            return new Response().setMessage("Data buku berhasil dihapus").setData(Collections.singletonList(result));
        }catch (Exception e){
            return new Response().setMessage(e.getMessage());
        }
    }
}
