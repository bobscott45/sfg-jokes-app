package dev.bobscott.sfgjokesapp.services;

import dev.bobscott.sfgjokesapp.components.RandomQuoteGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RandomQuoteService implements QuoteService {

    private RandomQuoteGenerator randomQuoteGenerator;

    @Autowired
    public RandomQuoteService(RandomQuoteGenerator randomQuoteGenerator) {
        this.randomQuoteGenerator = randomQuoteGenerator;
    }

    @Override
    public String getQuote() {
        return randomQuoteGenerator.getRandomQuote();
    }
}
