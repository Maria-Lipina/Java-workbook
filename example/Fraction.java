package example;

public class Fraction {
    int numerator;

    int denominator;

    public Fraction(String fraction) {
        String[] f = fraction.split("/");
        numerator = Integer.parseInt(f[0]);
        denominator = Integer.parseInt(f[1]);
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    private Fraction () {
        this.numerator = 1;
        this.denominator = 1;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }

    public static Fraction sum(Fraction a, Fraction b) {
        Fraction result = new Fraction();
        if (a.denominator != b.denominator) {
            int lcm = LCM.find(a.denominator, b.denominator);
            int amult = lcm / a.denominator;
            int bmult = lcm / b.denominator;

            a.numerator *= amult;
            b.numerator *= bmult;
            a.denominator *= amult;
            b.denominator *= amult;
        }
        result.numerator = a.numerator + b.numerator;
        result.denominator = a.denominator;
        while(GCD.findbyEuclid(result.numerator, result.denominator) > 1) {
            result.numerator = result.numerator
                    / GCD.findbyEuclid(result.numerator, result.denominator);
            result.denominator = result.denominator
                    / GCD.findbyEuclid(result.numerator, result.denominator);
        }
        return result;
    }
}
