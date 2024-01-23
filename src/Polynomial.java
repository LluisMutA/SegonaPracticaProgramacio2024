import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Polynomial {
    public Polynomial(float[] cfs) {


       /* for (float i = 0; i < coef.length/2; i++) {
            float j = coef.length-i-1;
            float a = coef[(int) i];
            float b = coef[(int) j];
            coef[(int) i] = b;
            coef[(int) j] = a;
        }*/
        float[] coef = cfs;
        float grau = cfs.length-1;
        for (int i = 0; i < cfs.length-1; i++) {
            if(cfs[i] < 1){
                cfs[i] = Float.parseFloat("x");
            } else if (cfs[i] == 0) {
                continue;
            } else if (cfs[i] > 1) {
                cfs[i] = Float.parseFloat(coef[i] + "^" + grau);
            }
            System.out.println(Arrays.toString(cfs));
        }
    }
    // variable per guardar el polinomi
    // guardar el valor dels nombres: 3x^3-4x^2-X-3 -->> 3 - 4 - 2 - 1 - 3
    //  Array de floats
    //  cercar numeros per char, sin son numeros, Integer.parseFloat.
    // Guardarlos en un array gran

    // Feim 2 pasades llegins els exponents, l'exponent mes gran+1 sera el tamany de l'array

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
