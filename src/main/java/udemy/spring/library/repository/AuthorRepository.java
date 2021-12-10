package udemy.spring.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.spring.library.domain.Author;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {
}
