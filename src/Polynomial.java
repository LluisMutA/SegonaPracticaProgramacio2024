import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class Polynomial {
    public Polynomial(float[] cfs) {
        this.cfs = eliminarZeros(cfs);

    }
    float[] cfs;

    // s s.replaceAll(regex "\\s", replacement "");
    // String[] ar = s.split(regex: "(?=[-+])"); --> Constructe 2

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

        float[] p1 = invertir(this.cfs);
        float[] p2 = invertir(p.cfs);

        if (p1.length > p2.length){
            for (int i = 0; i < p2.length; i++) {
                p1[i] += p2 [i];
            }invertir(p1);
            return new Polynomial(p1);
        }else {
            for (int i = 0; i < p1.length; i++) {
                p2[i] += p1[i];
            }invertir(p2);
            return new Polynomial(p2);
        }
    }


    public Polynomial mult(Polynomial p2) {
        float[] resultCoefs = new float[this.cfs.length + p2.cfs.length -1];

        for (int i = 0; i < this.cfs.length; i++) {
            for (int j = 0; j < p2.cfs.length; j++) {
                resultCoefs[i + j] += this.cfs[i] * p2.cfs[j];
            }
        }
        return new Polynomial(eliminarZeros(resultCoefs));
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
        if (cfs == null){
            return "0";
        }
        String resultat = "";
        int grau = cfs.length-1; // Grau te el valor màxim per defecte si te 4 de llarg, te valor 4
        int elevat = grau - (grau-1); // Elevat te valor 1 i es pot usar per aumentar el graus elevat++

        for (int i = 0; i <= cfs.length-1; i++, grau--) {
            float terme = cfs[i];
            if (cfs.length == 0 && grau == 0){
                return "0";
            }

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

            if (grau == 0){
                resultat += (int) terme;
            }else if(terme == 1 && grau == 1){
                resultat += "x";
            }else if(terme == 1 && grau > 1){
                resultat += "x^" + grau;
            }else if(terme > 1 && grau ==1){
                resultat += (int) terme + "x";
            }else resultat += (int) terme + "x^" + grau;

        }return resultat;
    }
    private static float[] eliminarZeros(float[] coefs) {
        int primerNoCero = 0;
        // Encontrar el índice del primer elemento no cero
        while (primerNoCero < coefs.length && coefs[primerNoCero] == 0) {
            primerNoCero++;
        }
        boolean todosCeros = true;
        for (float coef : coefs) {
            if (coef != 0) {
                todosCeros = false;
                break;
            }
        }
        if (todosCeros) {
            return new float[]{0};
        } else {
            // Crea un array eliminant els zeros inicials
            float[] res = Arrays.copyOfRange(coefs, primerNoCero, coefs.length);
            return res;
        }
    }

    public static float[] invertir(float[] cfs) { // inverteix l'array
        for (int i = 0; i < cfs.length/2; i++) {
            int j = cfs.length-i-1;
            int a = (int) cfs[i];
            int b = (int) cfs[j];
            cfs[i] = b;
            cfs[j] = a;
        }
        return cfs;
    }
}


//Suma: ar1 = this.coef    Invertim ar1 i ar 2, sumar el petit al gros i girar el resultat i generar polinomi
//      ar2 = p.coef
//      ar3 <-- Suma
// return Polynomi (ar3)