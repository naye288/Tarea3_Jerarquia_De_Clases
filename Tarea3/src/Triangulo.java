public class Triangulo extends Figura implements Comparable<Figura>{
    private double base;
    private double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public int CompareTo(Figura PorComparar) {
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
            return -1; // areas diferentes
        }
    }
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public int lados() {
        return 3;
    }


}
