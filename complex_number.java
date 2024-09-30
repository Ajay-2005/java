class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void showC() {
        System.out.print(this.real + " + " + this.imaginary + "i");
    }

    public static ComplexNumber add(ComplexNumber c1, ComplexNumber c2) {
        double newReal = c1.real + c2.real;
        double newImaginary = c1.imaginary + c2.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
}

public class Main {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(4, 5);
        ComplexNumber c2 = new ComplexNumber(10, 5);
        
        System.out.print("First Complex number: ");
        c1.showC();
        
        System.out.print("\nSecond Complex number: ");
        c2.showC();
        
        ComplexNumber res = ComplexNumber.add(c1, c2);
        
        System.out.println("\nAddition is :");
        res.showC();
    }
}