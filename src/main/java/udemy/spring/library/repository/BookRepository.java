package udemy.spring.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.spring.library.domain.Book;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Book, UUID> {
}
