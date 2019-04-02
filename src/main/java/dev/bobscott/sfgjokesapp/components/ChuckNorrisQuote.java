package dev.bobscott.sfgjokesapp.components;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisQuote implements RandomQuote{

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuote() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getRandomQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
