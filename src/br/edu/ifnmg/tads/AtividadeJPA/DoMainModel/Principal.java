/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.tads.AtividadeJPA.DoMainModel;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Mauro
 */
public class Principal {
    
    public static void main(String[] args){
        
        EntityManager manager;
        EntityManagerFactory factory;
        factory = Persistence.createEntityManagerFactory("AtividadeJPAPU");
        manager =  factory.createEntityManager();
    }
    
}
