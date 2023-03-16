public class Triangulo extends Figura implements Comparable<Triangulo>{
    private double base;
    private double altura;

    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public int CompareTo(Triangulo triPorComparar) {
        double areaPorComparar = triPorComparar.calcularArea();
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
    public double calcularArea() {
        return (base * altura) / 2;
    }
    @Override
    public int lados() {
        return 3;
    }


}
