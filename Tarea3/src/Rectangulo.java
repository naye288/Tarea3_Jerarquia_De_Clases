public class Rectangulo extends Figura implements Comparable<Rectangulo>{
    private double base;
    private double altura;

    
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public int compareTo(Rectangulo PorComparar) {
        double areaPorComparar = PorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            if (this.lados() == PorComparar.lados()){
                return 0;  // areas y lados de ambas figuras iguales
            }
            return -2; // solo areas iguales
        }else if (miArea > areaPorComparar){
            return 1;
        }else{
            return -1; // areas de porComparar es mas pequeña
        }
    }

    @Override
    public int lados() {
        return 4;
    }

    
}
