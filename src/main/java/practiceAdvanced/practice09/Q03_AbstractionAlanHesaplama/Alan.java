package practiceAdvanced.practice09.Q03_AbstractionAlanHesaplama;

public abstract class Alan {
    abstract double alanHesapla(double x, double y);   // abstract method

    public double carpma(int a, int b){     // concrete method'da bulunabilir abstract class'ta
        return a*b;
    }
}
