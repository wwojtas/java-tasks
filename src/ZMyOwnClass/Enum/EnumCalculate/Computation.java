package ZMyOwnClass.Enum.EnumCalculate;

import ZMyOwnClass.ReferenceConversion.Publikacja;

public enum Computation {

    MULTIPY {
        public double perform(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        public double perform(double x, double y) {
            double wynik = 0;
            if(y == 0) {
                throw new ArithmeticException("Nie wolno dzielić przez zero");
            } else {
                wynik = x / y;
            }
            return wynik;
        }
    },
    ADD {
        public double perform(double x, double y) {
            return x + y;
        }
    },
    SUBTRACT {
        public double perform(double x, double y) {
            return x - y;
        }
    };

    public abstract double perform(double x, double y);
}
