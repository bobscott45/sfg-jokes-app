package dev.bobscott.sfgjokesapp.controllers;

import dev.bobscott.sfgjokesapp.services.QuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JokesController {


    private QuoteService quoteService;

    public JokesController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @RequestMapping("/")
    public String getJoke(Model model) {
        model.addAttribute("joke", quoteService.getQuote());
        return "chucknorris";
    }
}
