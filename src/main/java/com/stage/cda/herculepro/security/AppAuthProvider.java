//package com.stage.cda.herculepro.security;
//
//import javax.security.sasl.AuthenticationException;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.BadCredentialsException;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//
//import com.stage.cda.herculepro.service.UserManager;
//
//public class AppAuthProvider extends DaoAuthenticationProvider {
//
//	@Autowired
//    UserManager userManager;
//
//    @Override
//    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
//
//        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;
//
//        String name = auth.getName();
//        String password = auth.getCredentials().toString();
//
//
//        UserDetails user = userManager.loadUserByUsername(name);
//
//        if (user == null) {
//            throw new BadCredentialsException("Les identifiants ne correspondent pas à l'authentification  " + auth.getPrincipal());
//        }
//
//        return new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());
//
//    }
//
//    @Override
//    public boolean supports(Class<?> authentication) {
//        return true;
//
//    }
//}
