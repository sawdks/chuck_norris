package com.sawdks.jokes_app.chuck_norris.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {
    private final ChuckNorrisQuotes quotes;

    public JokeServiceImpl() {
        quotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return quotes.getRandomQuote();
    }
}
