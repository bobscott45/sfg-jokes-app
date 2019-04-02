package dev.bobscott.sfgjokesapp.components;

import org.springframework.stereotype.Component;

@Component
public interface RandomQuote {
    String getRandomQuote();
}
