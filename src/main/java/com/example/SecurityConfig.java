package com.example;

import java.beans.Customizer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableMethodSecurity
public class SecurityConfig
{}/*
private final UserDetailsService userDetailsService;
    private final PasswordEncoder passwordEncoder;

  /*
	@Bean
    public AuthenticationManager authenticationManager(HttpSecurity http) throws Exception {
        //return (http.build();
            //.getSharedObject(AuthenticationManagerBuilder.class)
            //.userDetailsService(userDetailsService)
            //.passwordEncoder(passwordEncoder))
            
    }
*/
/*
    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.build();
	}
       // return http.build();
*/
