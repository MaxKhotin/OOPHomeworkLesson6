package Task2;

import java.util.Scanner;

//Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте
//        статический класс Converter с методами, которые будут конвертировать расстояние в разные единицы
//        измерения (к примеру, из метров в километры, из километров в мили, и так далее)
public class Distance {
    double distance;
    void print(){
        System.out.println("Distance in meters: "+distance);
    };
    Distance(double distance){
        this.distance=distance;
    }

    static class Converter {

        static double toKm(double meters){
        return meters/1000;
        }
        static double toMiles(double meters){
        return meters*0.00062;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in meters:");
        double dist = sc.nextDouble();
        Distance meters = new Distance(dist);
        meters.print();
        System.out.println("Distance in km: "+Converter.toKm(dist));
        System.out.println("Distance in miles: "+Converter.toMiles(dist));
    }
}
