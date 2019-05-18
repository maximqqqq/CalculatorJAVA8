package DTO;

import java.util.Set;

public class Result  {

    private double rez;

    public Result(double rez) {
        this.rez = rez;
    }

    public double getRez() {
        return rez;
    }

    @Override
    public String toString() {
        return "Result{" +
                "rez=" + rez +
                '}';
    }
}
