package donny.application.models.mappers;

import donny.application.models.Books;
import donny.application.models.dtos.BookDto;

public class BookMapper {

    public static BookDto toBaseDto(Books model){
        BookDto dto = new BookDto()
                .setId(model.getId())
                .setTitle(model.getTitle())
                .setAuthor(model.getAuthor());
        return dto;
    }

    public static BookDto toDetailDto(Books model){
        BookDto dto = toBaseDto(model);
        dto.setYear(model.getYear())
                .setIsbn(model.getIsbn())
                .setPages(model.getPages())
                .setCountry(model.getCountry())
                .setGenre(model.getGenre())
                .setLanguage(model.getLanguage());
        return dto;
    }

}