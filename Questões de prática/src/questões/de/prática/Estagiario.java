package questões.de.prática;

public class Estagiario extends Funcionario{

    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }
    
    public double calcularSalario(){
        return getSalarioBase() * 0.5;
    }
}
