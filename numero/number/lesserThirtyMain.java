 
package number;

 
public class lesserThirtyMain {
    
    public double lesserThirty(double number){
        double userNumber;
        
        if(number <= 30 && number > 10){
            userNumber = number * 3;
            System.out.println(userNumber);
        }
        
        else{
            userNumber = number;
            System.out.println(userNumber);
        }
        
        return userNumber;
    }
    
}
