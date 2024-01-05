package donny.application.repositories;

import donny.application.models.Books;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, Integer> {
}
