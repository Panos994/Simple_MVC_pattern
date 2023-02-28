/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mvc;

/**
 *
 * @author pfoteinopoulos
 */
public class Controller {
    private view theview;
    private model themodel;
    
    
    public Controller(view theview, model themodel){
        this.theview = theview;
        this.themodel = themodel;
        
        this.theview.addCalculationListener(new CalculationListener());
        
    }  
    
    class CalculateListener implements ActionListener{
        public void actionPerformed(ActionEvent arg0){
            int firstNubmer, secondNumber = 0;
            
            try{
                firstNumber = theview.getFirstNumber();
                secondNumber = theview.getSecondNumber();
                themodel.addTwoNumbers(firstNumber,secondNumber);
                
                theview.setCalcSolution(themodel.getCalculationValue())
                
            }catch(NumberFormatException ex){
                theview.displayErrorMessage("You need to enter 2 integers");
            }
        }
        
        
        
    }
    
    
}
