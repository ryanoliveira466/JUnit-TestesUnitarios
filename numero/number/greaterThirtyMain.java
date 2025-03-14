/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package number;

/**
 *
 * @author Aluno
 */
public class greaterThirtyMain {
    
    public double greaterThirty(double number){
        
        double userNumber;
        
        if(number > 30){
            userNumber = number * 4;
            System.out.println(userNumber);
        }
        
        else{
            userNumber = number;
            System.out.println(userNumber);
        }
        
        return userNumber;
    }
    
}
