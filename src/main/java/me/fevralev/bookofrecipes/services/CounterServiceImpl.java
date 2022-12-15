package me.fevralev.bookofrecipes.services;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService{
    private int counter;

    @Override
    public int getRequestCount() {
        return ++counter;
    }
}
