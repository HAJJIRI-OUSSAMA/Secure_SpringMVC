package org.example.springmvc;

import org.example.springmvc.entities.*;
import org.example.springmvc.repository.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.*;
import org.springframework.security.crypto.bcrypt.*;
import org.springframework.security.crypto.password.*;

import java.util.*;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
    @Autowired
    private PatientRepository patientRepository ;

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }
 @Override
    public void run(String... args) throws Exception{
/*        patientRepository.save(new Patient(null,"oussama", new Date(),false,200));
     patientRepository.save(new Patient(null,"hakim", new Date(),false,100));
     patientRepository.save(new Patient(null,"othman", new Date(),true,150));
     patientRepository.save(new Patient(null,"hicham", new Date(),false,222));
 */}

@Bean
    PasswordEncoder passwordEncoder (){
        return new BCryptPasswordEncoder();
    }
}
