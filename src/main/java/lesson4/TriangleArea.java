package lesson4;

public class TriangleArea {
    public static void main(String[] args) throws TriangleException {

        System.out.printf("Площадь %.2f", geroneSquare(3, 4, 5));
    }


    public static double geroneSquare(double a, double b, double c) throws TriangleException {
        if (a < 0 || b < 0 || c < 0) throw new TriangleException("Недопустимое значение");
        double p = (a + b + c) / 2;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }
}
