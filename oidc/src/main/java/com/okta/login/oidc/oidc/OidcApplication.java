package com.okta.login.oidc.oidc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;

@SpringBootApplication
public class OidcApplication  {

	public static void main(String[] args) {
		SpringApplication.run(OidcApplication.class, args);
	}

}
