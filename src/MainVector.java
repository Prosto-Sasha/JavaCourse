import java.util.Scanner;
class Vector
{
    private double x, y, z;
    Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Длина вектора. Корень из суммы квадратов
    double length(){
        return Math.sqrt(this.x * this.x + this.y * this.y + this.z * this.z);
    }

    // метод, вычисляющий скалярное произведение
    double scalarProduct(Vector vector){
        return this.x * vector.x + this.y * vector.y + this.z * vector.z;
    }

    // метод, вычисляющий векторное произведение
    Vector crossProduct(Vector vector){
        double x1 = this.y * vector.z - this.z * vector.y;
        double y1 = this.z * vector.x - this.x * vector.z;
        double z1 = this.x * vector.y - this.y * vector.x;
        return new Vector(x1, y1, z1);
    }

    // Косинус между двумя векторами
    double cos(Vector vector){
        return this.scalarProduct(vector) / (this.length() * vector.length());
    }

    // Сумма двух векторов
    Vector add(Vector vector){
        return new Vector(this.x + vector.x, this.y + vector.y, this.z + vector.z);
    }

    // Разность двух веторов
    Vector subtract(Vector vector){
        return new Vector(this.x - vector.x, this.y - vector.y, this.z - vector.z);
    }
}

public class MainVector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты первого вектора");
        double x1 = sc.nextInt();
        double y1 = sc.nextInt();
        double z1 = sc.nextInt();
        Vector v1 = new Vector(x1, y1, z1);

        System.out.println("Введите координаты второго вектора");
        double x2 = sc.nextInt();
        double y2 = sc.nextInt();
        double z2 = sc.nextInt();
        Vector v2 = new Vector(x2, y2, z2);

        System.out.println(v1.length());
        System.out.println(v2.length());
        System.out.println(v1.scalarProduct(v2));
        System.out.println(v1.crossProduct(v2));
        System.out.println(v1.cos(v2));
        System.out.println(v1.add(v2));
        System.out.println(v1.subtract(v2));
        sc.close();
    }
}
