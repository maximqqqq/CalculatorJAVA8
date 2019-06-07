package DTO;

import java.util.HashSet;
import java.util.Set;

public class Source {
    private double a;
    private double b;

    public Source() {

    }

    public Source(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}
