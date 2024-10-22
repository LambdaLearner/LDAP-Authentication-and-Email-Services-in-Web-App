package com.example.thymeleaf.config;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


import org.springframework.security.config.annotation.web.builders.HttpSecurity;


@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.ldapAuthentication()
                .userDnPatterns("uid={0},ou=admin")
                .groupSearchBase("ou=groups")
                .contextSource()
                   .url("ldap://localhost:8389/dc=test_user,dc=io")
                .and()
                .passwordCompare()
                   .passwordEncoder(new BCryptPasswordEncoder())
                   .passwordAttribute("userPassword");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .anyRequest().fullyAuthenticated()
                .and().formLogin().and().logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/login")
                .invalidateHttpSession(true)
                .deleteCookies("JSESSIONID")
                .clearAuthentication(true);
    }  
}

