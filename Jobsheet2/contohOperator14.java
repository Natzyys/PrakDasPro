public class contohOperator14 {

    public static void main(String[] args) {
        int a = 60;
        int b = 20;
        int c = 10;

        System.out.println("\n===" + "Aritmatika Operator" + "===");
        System.out.println("Bilangan a : " + a );
        System.out.println("Bilangan b : " + b );
        System.out.println("Bilangan c : " + c );

        System.out.println("\na + b + c = " + (a+b+c));
        System.out.println("a - b - c = " + (a-b-c));
        System.out.println("a * c = " + (a * c));
        System.out.println("a / c = " + (a / c));
        System.out.println("a % c = " + (a % c));
        
        System.out.println("\na + b * c = " + (a + b * c));
        System.out.println("a  c = " + (a % c));
        System.out.println("(a + b) * c = " + ((a + b) * c));

    }
}
