package com.kdyzm.spring.springstudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("xiaozhang").password("abcd").roles("USER").and().withUser("xiaoming")
				.password("abcd").roles("USER", "ADMIN");
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		super.configure(web);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		/*http
		.formLogin()
		.and()
		.authorizeRequests()
		.antMatchers("/login").permitAll()
		.antMatchers("/spitter/me").hasRole("SPITTER")
		.antMatchers(HttpMethod.POST, "/spitters").hasRole("SPITTER")
		.anyRequest()
		.permitAll()
		.and()
		.requiresChannel()
		.antMatchers("/spitter/form")
		.requiresSecure();*/
		
		super.configure(http);
	}

}
