package questões.de.prática;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O Cachorro faz: Au au!");
    }
}
