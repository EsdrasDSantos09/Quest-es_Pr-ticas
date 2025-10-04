package questões.de.prática;

import java.util.ArrayList;
import java.util.List;

public class QuestõesDePrática {

    public static void main(String[] args) {
        
        Animal a1 = new Cachorro("Duque");
        Animal a2 = new Gato("Bolinha");
        
        a1.emitirSom();
        a2.emitirSom();
        
        System.out.println();
        
        List<Forma> formas = new ArrayList<>();
        
        formas.add(new Quadrado(5));
        formas.add(new Triangulo(8, 2));
        
        for(Forma forma: formas){
            System.out.println(forma.calcularArea());
            System.out.println("------------------");
        }
        
        System.out.println();
        
        Funcionario g1 = new Gerente("Reinaldo", 15000);
        Funcionario f1 = new Estagiario("Suguro", 1500);
        
        System.out.println("O Gerente " + g1.getNome() + " - recebe: R$ " + g1.calcularSalario());
        
        System.out.println("O Estagiário " + f1.getNome() + " - recebe: R$ " + f1.calcularSalario());
    }
    
}
