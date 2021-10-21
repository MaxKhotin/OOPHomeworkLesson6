package Task1;
//Создать класс Vehicle с методом print. В классе Vehicle, создайте внутренний класс Wheel и Door,
//        которые также должны содержать метод print. Создайте экземпляры классов Wheel и Door.
public class Vehicle {
    void print(){
        System.out.println("Машина");
    }
    private class Wheel {
        Wheel(){}
        void print(){
            System.out.println("Колесо");
        }
    }
    private class Door {
        Door(){}
        void print(){
            System.out.println("Дверь");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Wheel wheel = new Vehicle().new Wheel();
        Vehicle.Door door = new Vehicle().new Door();
        vehicle.print();
        wheel.print();
        door.print();
    }
}


