package constructor;

public class Peremetr {
    private int a=5;
    private int b=7;
    private int c=10;

    public void P(){
        int p=a+b+c;
        System.out.println(p);
    }

    public void A(){
        double A=a+b+c;
        System.out.println(A);
    }

    public void B(){
        float B=a+b+c;
        System.out.println(B);
    }

    public void C(){
        long C=a+b+c;
        System.out.println(C);
    }
}

class D{

    public static void main(String[] args) {
        Peremetr perimetr=new Peremetr();
        perimetr.P();
        perimetr.A();
        perimetr.B();
        perimetr.C();
    }
}