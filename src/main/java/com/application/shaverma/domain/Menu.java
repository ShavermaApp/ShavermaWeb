package com.application.shaverma.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Menu {
    // need some annotations to add, for db connection
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
   // @GenericGenerator(name="system-uuid", strategy = "uuid") ?????????????

    private int id;
    private String name;
    private String discription;


    // При аннотации @Entity необходимо создать пустой конструктор, иначе будут проблему с созданием Bean данного класса

    public Menu() {
    }

    public Menu(String name, String discription) {
        this.name = name;
        this.discription = discription;
    }

}
