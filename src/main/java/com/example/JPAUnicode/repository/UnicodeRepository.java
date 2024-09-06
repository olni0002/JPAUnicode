package com.example.JPAUnicode.repository;

import com.example.JPAUnicode.model.Unicode;
import org.springframework.data.jpa.repository.JpaRepository;
        
public interface UnicodeRepository extends JpaRepository<Unicode, Integer> {

}

