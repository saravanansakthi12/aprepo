package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class LoginSecurityConfig extends WebSecurityConfigurerAdapter {
	

	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception
	{
           auth.inMemoryAuthentication().withUser("logesh").password("12345").roles("admin");
	}
	@Override
	public void configure(HttpSecurity hs) throws Exception
	{
		hs.authorizeRequests().antMatchers("/success").access("hasRole('admin')").and().formLogin().loginPage("/loginPage").defaultSuccessUrl("/success").failureUrl("/loginPage?error").and().logout().logoutSuccessUrl("/loginPage?logout");
	}
	
}
