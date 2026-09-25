package ficha0;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tomas
 */
public class Complexo {
    private double r;
    private double i;

    public Complexo(){
        this(0, 0);
    }
    public Complexo(double a, double b) {
        this.r = a;
        this.i = b;
    }
    public void setParteReal(double c) {
        this.r = c;
    }
    public void setParteImaginaria(double d) {
        this.i = d;
    }
    public double getParteReal() {
        return r;
    }
    public double getParteImaginaria() {
        return i;
    }
    public static Complexo somar(Complexo c1, Complexo c2) {
        double r = c1.r + c2.r;
        double i = c1.i + c2.i;
        return new Complexo(r,i);
        // devolve um número complexo com a soma de c1 e c2
    }
    public static Complexo subtrair(Complexo c1, Complexo c2) {
        double r = c1.r - c2.r;
        double i = c1.i - c2.i;
        return new Complexo(r, i);
        // devolve um número complexo com a subtracção de c1 e c2
    }
    public static Complexo multiplicar(Complexo c1, Complexo c2) {
        double r = c1.r * c2.r - c1.i * c2.i;
        double i = c1.r * c2.i - c1.i * c2.r;
        return new Complexo(r, i);
        // devolve um número complexo com a multiplicação de c1 e c2
    }
    public static Complexo dividir(Complexo c1, Complexo c2) {
        Complexo num = multiplicar(c1, conjugado(c1));
        Complexo den = multiplicar(c2, conjugado(c2));
        return new Complexo(num.r/den.r, num.i/den.i);
        // devolve um número complexo com a divisão de c1 e c2
    }
    public static Complexo conjugado(Complexo c) {
        return new Complexo(c.r , -1*c.i);
        // devolve um número complexo com o conjugado de c
    }
    @Override
    public String toString() {
        String str = String.valueOf(r);
        if (i>=0)
                str += "+";
        str += String.valueOf(i);
        str += "i";
        return str;
        // devolve uma string no formato a+bi ou a-bi ou -a+bi ou -a-bi
        // consoante os termos reais e imaginários sejam positivos ou
        // negativos
    }
    @Override
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o == null) {
            return false;
        }
        if (getClass() != o.getClass()) {
            return false;
        }
        final Complexo other = (Complexo) o;
        if(Double.doubleToLongBits(this.r ) != Double.doubleToLongBits(other.r)) {
            return false;
        }
        return Double.doubleToLongBits(this.i) == Double.doubleToLongBits(other.i);
        
        // devolve true ou false consoante o complexo seja igual ou
        // diferente a o
    }
    @Override
    public Object clone() {
        return new Complexo(r, i);
        // devolve um novo número complexo com o mesmo valor
    }
}