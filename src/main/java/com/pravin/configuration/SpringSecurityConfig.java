package com.pravin.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity 
public class SpringSecurityConfig {
	
	
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/mail","/alljob","/alldonation","/allfeedback").hasRole("Gues")
             .requestMatchers("/allalumni").hasRole("User")
                .requestMatchers("/welcome").permitAll()
                .anyRequest().permitAll()
            )
            .formLogin()
           . and()
            .logout(logout -> logout
                .logoutUrl("/logout")
                .logoutSuccessUrl("/") // Redirect to login after logout
                .permitAll()
            )
            .csrf(csrf -> csrf.disable()); // Disable CSRF for simplicity (optional)

        return http.build();
    }
	
	
	
	
	
	@Bean
    public UserDetailsService userDetailsService() {
        // Define a single in-memory user
		
        UserDetails user = User.withDefaultPasswordEncoder()
                .username("admin")  // Username for authentication
                .password("password") // Password for authentication
               .roles("Gues")
                .build(); 
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("admin1")  // Username for authentication
                .password("password1") // Password for authentication
               .roles("User")
                .build();
        return new InMemoryUserDetailsManager(user,user1);
    }
	
}
