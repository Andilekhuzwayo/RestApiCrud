package com.javatechie.crud.example.repository;

import com.javatechie.crud.example.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

    public Book findByModuleCode(int moduleCode);

    public void deleteByModuleCode(int moduleCode);
}

