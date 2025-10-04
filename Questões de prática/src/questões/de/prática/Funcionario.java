package questões.de.prática;

public class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if(salarioBase >= 0){
            this.salarioBase = salarioBase;
        } else{
            System.out.println("O valor não pode ser negativo!");
        }
    }

    public double calcularSalario(){
        return salarioBase;
    }
}
