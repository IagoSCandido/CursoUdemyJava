public class ex2a28 {
    public static void main(String[] args) {
        double x1, x2, delta, b, a, c;
        b = 3.0;
        a = 2.0;
        c = 1.0;
        delta = Math.pow(b, 2.0) - 4 * a * c;
        System.out.println(delta);
        x1 = (- b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (- b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(x1);
        System.out.println(x2);
    }
}

