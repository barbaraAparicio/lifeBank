package com.lifeBank;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
public class LifeBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(LifeBankApplication.class, args);
	}
	
	
	@EnableWebSecurity
	@Configuration
	class WebSecurityConfig extends WebSecurityConfigurerAdapter {

		@Override
		protected void configure(HttpSecurity http) throws Exception {
			http.csrf().disable()
				.authorizeRequests()                
				.antMatchers(HttpMethod.POST, "/login").permitAll()
				.anyRequest().authenticated();
			
			
			/*http
        	.csrf().disable()
                .authorizeRequests()
            	.antMatchers("/","/index","/webpublico").permitAll()
            	.antMatchers("/webprivado").authenticated()
            	.antMatchers("/webadmin").hasRole("ADMIN").and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .and()
                .logout() // Metodo get pues he desabilitado CSRF
                .permitAll();
                @EnableReactiveMethodSecurity*/
			
		}
	}

}
