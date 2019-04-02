package dev.bobscott.sfgjokesapp.components;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisQuoteGenerator implements RandomQuoteGenerator {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteGenerator() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
