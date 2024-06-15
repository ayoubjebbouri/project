package com.exemple.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true)
public class SecurityConfig {
    // @Autowired
    // private PasswordEncoder passwordEncoder;


    @Bean
    public JdbcUserDetailsManager jdbcUserDetailsManager(DataSource dataSource) {

        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain SecurityFilterChain(HttpSecurity httpSecurity) throws Exception{
        httpSecurity.formLogin().loginPage("/index").permitAll();
        /*


        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/loginadmin").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/logadmin").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/logcondidature").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/logincondidature").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/logsociete").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Logins/loginsociete").permitAll();




        httpSecurity.authorizeHttpRequests().requestMatchers("/resources/templates/Candidature").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Admin").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Societe").permitAll();






        httpSecurity.authorizeHttpRequests().requestMatchers("/webjars/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/liste").permitAll();

        httpSecurity.authorizeHttpRequests().requestMatchers("/deploma").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/logadmin").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/dmin/deletedeplom").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/addeplom").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/condida").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/addeplom").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/offers").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/pageaddeploms").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/adddeplom").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/pageaddeplom").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/admin/editdeplom1").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/css/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/listedeploms").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/format").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/Admin/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/saveuser").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/loginsociete").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/savesociete").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/signupSociete").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/About").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/contact").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/img/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/loginadmin").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/logincondida").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/accessible/**").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/signupcon").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/resources/**","/templates").permitAll();
        httpSecurity.rememberMe();
        //httpSecurity.authorizeHttpRequests().requestMatchers("/user/**").hasRole("USER");
        //httpSecurity.authorizeHttpRequests().requestMatchers("/admin/**").hasRole("ADMIN");
        httpSecurity.exceptionHandling().accessDeniedPage("/notAuthorized");
        httpSecurity.authorizeHttpRequests().anyRequest().authenticated();
        */
        httpSecurity.authorizeHttpRequests().requestMatchers("/templates/Condidature/ss").permitAll();
        httpSecurity.authorizeHttpRequests().requestMatchers("/resources/**","/templates/**").permitAll();
        httpSecurity.authorizeHttpRequests(auth -> auth.anyRequest().permitAll());
        return httpSecurity.build();
    }
}
