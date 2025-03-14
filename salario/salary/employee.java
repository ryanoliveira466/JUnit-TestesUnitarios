package salary;

public class employee {

    private String nome;
    private double salario;
    private enumPosition cargo;

    public employee() {
    }

     public employee(String nome, double salario, enumPosition cargo){
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public enumPosition getCargo() {
        return cargo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setCargo(enumPosition cargo) {
        this.cargo = cargo;
    }
     
     
    
   

}
