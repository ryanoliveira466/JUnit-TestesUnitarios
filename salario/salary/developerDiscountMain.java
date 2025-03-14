 
package salary;

 
public class developerDiscountMain {
    
    public double developerDiscont(employee worker){
        
        double discont = 0;
        double newSalary = 0;
        double salaryWorker = worker.getSalario();
        enumPosition positionWorker = worker.getCargo();
        enumPosition position = enumPosition.DESENVOLVEDOR;
        
        if(positionWorker == position && salaryWorker > 3000){
            discont = salaryWorker * 20/100;
            newSalary = salaryWorker - discont;
        }
        
        else if(positionWorker == position && salaryWorker <= 3000){
            discont = salaryWorker * 10/100;
            newSalary = salaryWorker - discont;
        }
        
        else{
            System.out.println("Not a Developer");
            newSalary = 0;
        }
        
    
        System.out.println(newSalary);
        return newSalary;
           
    }
    
}
