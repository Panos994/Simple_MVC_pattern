/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mvc;

/**
 *
 * @author pfoteinopoulos
 */
public class Mvc {

    public static void main(String[] args) {
        view theview = new view();
        model themodel = new model();
        Controller thecontroller = new Controller(theview,themodel);
        
        theview.setViseible(true);
    }
}
