package dev.bobscott.sfgjokesapp.services;

import dev.bobscott.sfgjokesapp.components.RandomQuote;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteService implements QuoteService {

    private RandomQuote randomQuote;

    public RandomQuoteService(RandomQuote randomQuote) {
        this.randomQuote = randomQuote;
    }

    @Override
    public String getQuote() {
        return randomQuote.getRandomQuote();
    }
}
