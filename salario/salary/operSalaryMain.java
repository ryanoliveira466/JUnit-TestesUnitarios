package salary;

public class operSalaryMain {

    public double operSalary(employee worker) {
        double newSalary = 0;

        developerDiscountMain op1 = new developerDiscountMain();
        testerDbaDiscountMain op2 = new testerDbaDiscountMain();

        newSalary = op1.developerDiscont(worker);
        if (newSalary != 0) {
            newSalary = newSalary;
        } else {
            newSalary = op2.testerDbaDiscount(worker);
        }

        System.out.println("Final Salary: " + newSalary);
        System.out.println("Worker Position: " + worker.getCargo());
        return newSalary;

    }

}
