/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author angeko
 */
@Entity
@Table(name="employees")
@Data
public class Employee {
    
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   
   private Long id;
   
   @Column(name="first_name")
   private String firstName; 
   
   @Column(name="last_name")
   private String lastName; 
   
  
   private String mail; 
   
   private String password; 
}
