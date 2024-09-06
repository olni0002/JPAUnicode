package com.example.JPAUnicode.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.JPAUnicode.model.Unicode;
import com.example.JPAUnicode.repository.UnicodeRepository;



@Component
public class InitData implements CommandLineRunner {

    @Autowired
    UnicodeRepository unicodeRepository;

    @Override
    public void run(String... args) throws Exception {
        Unicode unicode = new Unicode();
        unicode.setBogstav('a');
        unicode.setUnicode(97);
        unicode.setDescription("Lowercase a ");
        unicode.setName("Lowercase a");          
        unicodeRepository.save(unicode);
    }

}
