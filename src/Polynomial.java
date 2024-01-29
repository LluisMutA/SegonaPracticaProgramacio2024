import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Polynomial {
    public Polynomial(float[] cfs) {
        // TODO: Abans d'emmagatzemar els coeficients, eliminar els zeros de l'esquerra:
        // EX; [0,0,5,6,0] --> [5,6,0]

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
        int grau = cfs.length-1; // Grau te el valor màxim per defecte si te 4 de llarg, te valor 4
        int elevat = grau - (grau-1); // Elevat te valor 1 i es pot usar per aumentar el graus elevat++
        for (int i = 0; i <= cfs.length-1; i++, grau--) {
            float terme = cfs[i];
            if (i != 0) {
                // No és la primera posició
                if (i == 0 && terme == 0) {

                } else if (terme == 0)
                    continue;
                if (terme < 0) {
                    resultat += " - ";
                    terme *= -1;
                } else {
                    resultat += " + ";
                }
            }
            if (i == 0 && terme < 0) {
                // Si és la primera posició i num es negatiu
                resultat += "-";
                terme *= -1;
            }

           /* if (terme == 0 && grau > 1) {
                resultat += (int) terme + "x^" + grau;
            } else if (terme == 1 && grau > 1) {
                resultat += "x^" + grau;
            } else if (terme == 0) {
                continue;
            } else {
                resultat += (int) terme + "x^" + grau;
            }*/

            if (grau == 0) {
                // escrivim num
                resultat += (int) terme;
            } else if (terme == 1 && grau != 1) {
                // no hem d'escriure 1
                resultat += "x" + "^" + grau;
            } else if (terme == 0 && grau == 1) {
                continue;
            } else if (terme == 0 && grau > 1) {
                continue;
            } else {
                resultat += "x";
                if (grau > 1 && terme != 0) {
                    resultat += ((int) terme) + "x" + "^" + grau;
                } else if (terme == 0) {
                    continue;
                }
            }
        }return resultat;
    }
}