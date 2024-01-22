import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Polynomial {
    public Polynomial(float[] cfs) {
        float[] coef = cfs;
       /* for (float i = 0; i < coef.length/2; i++) {
            float j = coef.length-i-1;
            float a = coef[(int) i];
            float b = coef[(int) j];
            coef[(int) i] = b;
            coef[(int) j] = a;
        }*/
        int elevat = coef.length;
        for (int i = 0; i < coef.length-1; i++) {
            System.out.println(Arrays.toString(coef));
        }

       // System.out.println(Arrays.toString(coef));
    }

    public Polynomial() {

    }

    public Polynomial(String s) {

    }

    public float[] roots() {
        return null;
    }

    public Polynomial add(Polynomial p) {
       return null;
    }


    public Polynomial mult(Polynomial p2) {
        return null;
    }

    public Polynomial[] div(Polynomial p2) {
        return null;
    }
    
    @Override
    public boolean equals(Object o) {
        return false;
    }

    @Override
    public String toString() {
        return "";
    }
}
