 
package number;

 
public class operNumMain {
    
    public double operNum(double number){
        double userNumberOficial = number;
        double userNumberChange = number;
        
        greaterThirtyMain op1 = new greaterThirtyMain();
        userNumberChange = op1.greaterThirty(userNumberChange);
        
        lesserThirtyMain op2 = new lesserThirtyMain();
        userNumberChange = op2.lesserThirty(userNumberChange);
        
        if(userNumberChange == userNumberOficial){
            userNumberChange = userNumberChange * 2; 
        }
        
        else{
            userNumberChange = userNumberChange;
        }
        
        System.out.println("Final result: " + userNumberChange);
        return userNumberChange;
        
        
    }
    
}
