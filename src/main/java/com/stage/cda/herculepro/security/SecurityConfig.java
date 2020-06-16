//package com.stage.cda.herculepro.security;
//
//import java.io.IOException;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.Authentication;
//
//import com.stage.cda.herculepro.service.UserManager;
//
//@Configuration
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	UserManager userManager;
//	
//	@Autowired
//	DataSource dataSource;
//	
//	@Autowired
//    private AccessDeniedHandler accessDeniedHandler;
//
//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception {
//    	auth.userDetailsService(userManager);
//    }
//    
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//
//        http.csrf()
//                .disable()
//                .exceptionHandling()
//                .authenticationEntryPoint(new Http403ForbiddenEntryPoint() {
//                })
//                .and()
//                .authenticationProvider(getProvider())
//                .formLogin()
//                .loginProcessingUrl("/login")
//                .successHandler(new AuthentificationLoginSuccessHandler())
//                .failureHandler(new SimpleUrlAuthenticationFailureHandler())
//                .and()
//                .logout()
//                .logoutUrl("/logout")
//                .logoutSuccessHandler(new AuthentificationLogoutSuccessHandler())
//                .invalidateHttpSession(true)
//                .and()
//                .authorizeRequests()
//                .antMatchers("/login").permitAll()
//                .antMatchers("/logout").permitAll()
//                .antMatchers("/user").authenticated()
//                .anyRequest().permitAll();
//    }
//
//    private class AuthentificationLoginSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
//
//        @Override
//        public void onAuthenticationSuccess(HttpServletRequest request,
//                                            HttpServletResponse response, Authentication authentication)
//                throws IOException, ServletException {
//            response.setStatus(HttpServletResponse.SC_OK);
//        }
//    }
//
//    private class AuthentificationLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {
//
//        @Override
//        public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
//                                    Authentication authentication) throws IOException, ServletException {
//            response.setStatus(HttpServletResponse.SC_OK);
//        }
//    }
//
//    @Bean
//    public AuthenticationProvider getProvider() {
//
//        AppAuthProvider provider = new AppAuthProvider();
//        provider.setUserDetailsService(userDetailsService);
//        return provider;
//
//    }
//}
