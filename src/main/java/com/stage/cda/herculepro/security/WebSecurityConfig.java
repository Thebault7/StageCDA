//package com.stage.cda.herculepro.security;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import com.stage.cda.herculepro.utils.PasswordEncoderGenerator;
//import com.stage.cda.herculepro.utils.RoleEnum;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private final String adminRole = RoleEnum.ADMINISTRATOR.name();
//
//    private final UserDetailsService userDetailsService;
//
//    @Autowired
//    public WebSecurityConfig(UserDetailsService userDetailsService) {
//        this.userDetailsService = userDetailsService;
//    }
//
//    @Bean(name = "passwordEncoder")
//    public PasswordEncoderGenerator passwordEncoder() {
//        return new PasswordEncoderGenerator();
//    }
//
//    @Autowired
//    public void configAuthentication(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.authorizeRequests()
//                .antMatchers("/auth**").authenticated()
//                .antMatchers("/auth/admin**").hasAuthority(adminRole)
//                .anyRequest().permitAll()
//            .and()
//                .formLogin().loginPage("/login").defaultSuccessUrl("/auth").failureUrl("/login")
//                .usernameParameter("username").passwordParameter("password")
//            .and()
//                .logout().invalidateHttpSession(true)
//                .logoutUrl("/logout")
//                .logoutSuccessUrl("/login")
//            .and()
//                .csrf()
//            .and()
//                .sessionManagement().maximumSessions(1).expiredUrl("/login");
//    }
//}