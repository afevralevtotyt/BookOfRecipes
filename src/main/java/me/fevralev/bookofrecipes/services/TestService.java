package me.fevralev.bookofrecipes.services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
@Service
public class TestService {
    @Value("${valueFromConfigurationFile}")
    private String str;
    @PostConstruct
    public void init(){
        System.out.println(str);
    }
}
