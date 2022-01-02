package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.security.ApplicationUserRole.*;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class ApplicationSecurityConfig extends WebSecurityConfigurerAdapter {

    private final PasswordEncoder passwordEncoder;

    @Autowired
    public  ApplicationSecurityConfig(PasswordEncoder passwordEncoder){
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
                .antMatchers("/api/**").hasRole(ADMIN.name())
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails johnFieworUser = User.builder()
                .username("John Fiewor")
                .password(passwordEncoder.encode("password"))
                .roles(ADMIN.name()) // ROLE_ADMIN
                .authorities(ADMIN.getGrantedAuthority())
                .build();

        UserDetails ezehCamson = User.builder()
                .username("Ezeh Camson")
                .password(passwordEncoder.encode("password123"))
                .roles(CUSTOMER.name()) // ROLE_CUSTOMER
                .authorities(CUSTOMER.getGrantedAuthority())
                .build();

        UserDetails adesanyaDavid = User.builder()
                .username("Adesanya David")
                .password(passwordEncoder.encode("password321"))
                .roles(SUPER_ADMIN.name())
                .authorities(SUPER_ADMIN.getGrantedAuthority())
                .build();

        return new InMemoryUserDetailsManager(
                johnFieworUser,
                adesanyaDavid,
                ezehCamson
        );
    }
}
