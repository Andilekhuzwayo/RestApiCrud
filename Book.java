package com.javatechie.crud.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "prescribed_books")
public class Book{
    @Id private int moduleCode;
    private String title;
    private String author;
    private String yearPublished;
    private String edition;
    private String publisher;
    private String prescribedYear;
}
