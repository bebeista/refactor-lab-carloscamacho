package figuras;

public class Paralelogramo {
    private double base;
    private double altura;
    private String rectángulo;
    private String tipo;

    public Paralelogramo(double a, double b) {
        base = a;
        altura = b;
    }

    public void mostrar() {
        tipo = rectángulo;
        System.out.println("Tipo: " + tipo);
        System.out.println("Ancho: " + base);
        System.out.println("Alto: " + altura);

        double per = calcularPerimetro();
        System.out.println("Perímetro: " + per);

        double area = calcularArea();
        System.out.println("Área: " + area);
    }

    private double calcularArea() {
        double area = base * altura;
        return area;
    }

    private double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }

    public boolean compararTamanyo(boolean exactitud, Paralelogramo paral) {
        if (exactitud) {
            return this.base == paral.base && this.altura == paral.altura;
        } else {
            return Math.abs(this.base - paral.base) < 1 &&
                    Math.abs(this.altura - paral.altura) < 1;
        }
    }
}