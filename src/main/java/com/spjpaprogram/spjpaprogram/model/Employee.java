package com.spjpaprogram.spjpaprogram.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

// 4 types of relations: a) OneToOne, b) OneToMany, c) ManyToOne, d) ManyToMany

@Entity
@Getter
@Setter
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String city;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "dept_id")
    private Department department;
}
//   {
//     "name":"Abc",
//     "city":"Xyz",
//     "department":{
//          "id":1
//    }
//}