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
    public int CompareTo(Circulo cirPorComparar) {
        double areaPorComparar = cirPorComparar.calcularArea();
        double miArea = this.calcularArea();
        if(miArea==areaPorComparar){
            return 0;
        }else if (miArea > areaPorComparar){
            return 1;
        }else{
            return -1;
        }
    }

    @Override
    public int lados() {
        return 0;
    }
}
