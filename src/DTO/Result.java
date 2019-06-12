package DTO;

public class Result {

    private double rez;

    public Result(double rez) {
        this.rez = rez;
    }

    public double getRez() {
        return rez;
    }

    @Override
    public String toString() {
        return "" + rez;
    }
}
