import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Polynomial {
    public Polynomial(float[] cfs) {
        this.cfs = cfs;
    }
    float[] cfs;

       /* for (float i = 0; i < cfs.length/2; i++) {
            float j = cfs.length-i-1;
            float a = cfs[(int) i];
            float b = cfs[(int) j];
            cfs[(int) i] = b;
            cfs[(int) j] = a;
        }

            if(cfs[i] < 1){
                cfs[i] = Float.parseFloat(cfs[i]+"x");
            } else if (cfs[i] == 0) {
                continue;
            } else if (cfs[i] > 1) {
                cfs[i] = Float.parseFloat(coef[i] + "^" + grau);
            }
            System.out.println(Arrays.toString(cfs));*/

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
        // diu si dos polinomis son iguals
        return this.toString().equals(o.toString());
    }

    @Override
    public String toString() {
        // coeficients a string
        float[] coef = cfs;
        String resultat = "";
        int grau = cfs.length-1;
        for (int i = 0; i < cfs.length-1; i++, grau--) {
            int num = (int)cfs[i];
            float terme = cfs[i];
            if (grau == 0) {
                // escrivim num
                resultat += num;
            } else if (terme == 1) {
                // no hem d'escriure 1
                resultat += "x";
            } else {
                resultat += num + "x";
                if (grau > 1) {
                    resultat += "^"+grau;
                }
            }
        }
        return resultat;
    }
}
