public class Circulo extends Figura implements Comparable<Circulo>{
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
    
    @Override
    public int compareTo(Circulo PorComparar) {
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
        return 0;
    }
}
