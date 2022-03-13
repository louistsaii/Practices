public class Practice_1024 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(3, -4);
        Complex c3 = new Complex(5, 6);

        Complex x = c1.add(c2).add(c3);
        c2.abs();
        System.out.println(x);
        System.out.println(c2);
        System.out.println(c3);


    }
}

class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex a) {
        this.real = a.real + this.real;
        this.imaginary = a.imaginary + this.imaginary;
        return this;
    }

    public double abs() {
        int x = real;
        int y = imaginary;
        double z = Math.sqrt(x * x + y * y);
        return z;
    }

    public String toString() {
        String x = ("Real: " + real + " Imaginary: " + imaginary);
        String y = (" Distance: " + abs());
        return x + y;
    }
}
