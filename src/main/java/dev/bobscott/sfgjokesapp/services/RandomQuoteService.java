package dev.bobscott.sfgjokesapp.services;

import dev.bobscott.sfgjokesapp.components.RandomQuoteGenerator;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteService implements QuoteService {

    private RandomQuoteGenerator randomQuoteGenerator;

    public RandomQuoteService(RandomQuoteGenerator randomQuoteGenerator) {
        this.randomQuoteGenerator = randomQuoteGenerator;
    }

    @Override
    public String getQuote() {
        return randomQuoteGenerator.getRandomQuote();
    }
}
