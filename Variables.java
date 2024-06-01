
public class Variables {

    int a = 10;  // instance variable
    static double b = 20.5; //static variable

    public static void main(String[] args) {

        boolean c = true; //local variable
        Variables s = new Variables();
        System.out.println(s.a);
        System.out.println(b);
        System.out.println(c);

    }
}
