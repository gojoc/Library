package udemy.spring.library.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import udemy.spring.library.repository.AuthorRepository;

@Controller
@AllArgsConstructor
public class AuthorController {
    private final AuthorRepository authorRepository;

    @GetMapping(value = "/authors")
    public String getAuthors(Model model) {
        model.addAttribute("authors", authorRepository.findAll());
        return "authors/list";
    }
}
