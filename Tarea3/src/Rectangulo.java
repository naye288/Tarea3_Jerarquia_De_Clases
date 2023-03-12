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
    public int CompareTo(Rectangulo rectPorComparar) {
        double areaPorComparar = rectPorComparar.calcularArea();
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
        return 4;
    }

    
}
