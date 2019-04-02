package dev.bobscott.sfgjokesapp.services;

import dev.bobscott.sfgjokesapp.SfgJokesAppConfig;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class ChuckNorrisQuoteService implements QuoteService {


    private ChuckNorrisQuotes chuckNorrisQuotes;

    public ChuckNorrisQuoteService() {
        ApplicationContext ctx= new AnnotationConfigApplicationContext(SfgJokesAppConfig.class);
        chuckNorrisQuotes = ctx.getBean(ChuckNorrisQuotes.class);
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
