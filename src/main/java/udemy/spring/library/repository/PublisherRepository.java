package udemy.spring.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import udemy.spring.library.domain.Publisher;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<Publisher, UUID> {
}
