package constructor;

public class Car {
    private String rang="Qora";
    private String model="Mercedes";
    private int narxi=1000000000;
    private String tizimi="Aftomat";

    public void Rangi(){
        System.out.println(rang);
    }

    public void Model(){
        System.out.println(model);
    }

    public void narxi (){
        System.out.println(narxi);
    }

    public void Tizimi(){
        System.out.println(tizimi);
    }

}
class Car2{

    public static void main(String[] args) {
        Car car =new Car();
        car.Rangi();
        car.Model();
        car.narxi();
        car.Tizimi();
    }
}
