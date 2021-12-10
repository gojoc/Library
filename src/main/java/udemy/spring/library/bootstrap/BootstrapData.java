package udemy.spring.library.bootstrap;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import udemy.spring.library.domain.Author;
import udemy.spring.library.domain.Book;
import udemy.spring.library.domain.Publisher;
import udemy.spring.library.repository.AuthorRepository;
import udemy.spring.library.repository.BookRepository;
import udemy.spring.library.repository.PublisherRepository;

@Slf4j
@Component
@AllArgsConstructor
public class BootstrapData implements CommandLineRunner {
    private final PublisherRepository publisherRepository;
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... arguments) {
        Author author = new Author("Amanda", "Brown");
        Book book = new Book("Domain Driven Design", "978-3-16-148410-0");
        Publisher publisher = new Publisher("Macmillan Publishers", "Forest Ave 5", "New York",
                "United States", "10015");

        author.getBooks().add(book);
        book.getAuthors().add(author);
        publisher.getBooks().add(book);

        authorRepository.save(author);
        bookRepository.save(book);
        publisherRepository.save(publisher);

        Author anotherAuthor = new Author("James", "Thompson");
        Book anotherBook = new Book("The Old Man and the Sea", "978-3-20-148415-0");
        Publisher anotherPublisher = new Publisher("Hachette Livre", "Henderson Ave 10",
                "Los Angeles", "United States", "20155");

        anotherAuthor.getBooks().add(anotherBook);
        anotherBook.getAuthors().add(anotherAuthor);
        anotherPublisher.getBooks().add(anotherBook);

        authorRepository.save(anotherAuthor);
        bookRepository.save(anotherBook);
        publisherRepository.save(anotherPublisher);

        log.info("[BootstrapData] added {} authors", authorRepository.count());
        log.info("[BootstrapData] added {} books", bookRepository.count());
        log.info("[BootstrapData] added {} publishers", publisherRepository.count());
    }
}
