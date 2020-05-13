import org.testng.annotations.Test;

public class FirstClass {
    @Test
    public void test001() {
        System.out.println("Hello World");
    }

    @Test
    public void test002() {
            byte zero = 0;
            String output = "W" + zero + "w";
            System.out.println(output);
        }

    @Test
    public void test003( ) {
        String a = "Wow";
        String b = a;
        String c = b + "!";
        String d = c;

        boolean b1 = a == b;// This is false, since a and b are not the same object
        boolean b2 = d.equals(b + "!");
        boolean b3 = !c.equals(a);

        if (b1 && b2 && b3) {
            System.out.println("Success!");
        }
    }

    @Test
    public void test004() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }
}




