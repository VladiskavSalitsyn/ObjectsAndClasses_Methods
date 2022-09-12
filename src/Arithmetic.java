public class Arithmetic {
    int a = 0;
    int b = 0;

    public static void main(String[] args) {
        summ(5,4);
        piece(5,4);
        max(4,5);
        min(15,12);
    }
    public Arithmetic (int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int returningA () {
        return a;
    }
    public int returningB () {
        return  b;
    }
    public static void summ (int a, int b) {
        int summ = a + b;
        System.out.println("summ a+b= " + summ);
    }
    public static void piece (int a, int b) {
        int piece = a * b;
        System.out.println("piece a*b= " + piece);
    }
    public static void max (int a, int b) {
        boolean value = false;
        if (a > b) {
            value = true;
            System.out.println("max: " + a);
        } else {
            System.out.println("max: " + b);
        }
    }
    public static void min (int a, int b) {
        boolean value = false;
        if (a < b) {
            value = true;
            System.out.println("min: " + a);
        } else {
            System.out.println("min: " + b);
        }
    }
}
