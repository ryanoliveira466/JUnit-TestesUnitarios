 
package salary;

 
public class testerDbaDiscountMain {
    
    public double testerDbaDiscount(employee worker) {
        
        double discont = 0;
        double newSalary = 0;
        double salaryWorker = worker.getSalario();
        enumPosition positionWorker = worker.getCargo();
        enumPosition positionDBA = enumPosition.DBA;
        enumPosition positionTester = enumPosition.TESTADOR;
        
        if((positionWorker == positionDBA || positionWorker == positionTester) && salaryWorker > 2500){
            discont = salaryWorker * 25/100;
            newSalary = salaryWorker - discont;
        }
        
        else if((positionWorker == positionDBA || positionWorker == positionTester) && salaryWorker <= 2500){
            discont = salaryWorker * 15/100;
            newSalary = salaryWorker - discont;
        }
        
        else{
            System.out.println("Not a DBA, Tester");
            newSalary = 0;
        }
        
    
        System.out.println(newSalary);
        return newSalary;
        
    }
    
}
