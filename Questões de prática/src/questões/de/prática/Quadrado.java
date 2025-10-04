package questões.de.prática;

public class Quadrado implements Forma{
    
    private int lado;

    public Quadrado(int lados) {
        this.lado = lados;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }
    
    
   
    public double calcularArea(){
        return lado * lado;
    }
}
