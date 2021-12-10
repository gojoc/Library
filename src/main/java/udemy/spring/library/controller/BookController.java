package udemy.spring.library.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import udemy.spring.library.repository.BookRepository;

@Controller
@AllArgsConstructor
public class BookController {
    private final BookRepository bookRepository;

    @GetMapping(value = "/books")
    public String getBooks(Model model) {
        model.addAttribute("books", bookRepository.findAll());
        return "books/list";
    }
}
