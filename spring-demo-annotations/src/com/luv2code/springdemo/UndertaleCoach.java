package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class UndertaleCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Play Megalovania!";
    }
    
}
