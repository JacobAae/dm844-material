package dk.dm844.groovyintro;

/**
 * Created by jacob on 1/26/15.
 */
public class TooGroovy {


    public int[] getSmallPrimes() {

        // tag::small-primes[]
        int[] smallPrimes = { 2, 3, 5, 7, 11, 13, 17, 19 };
        // end::small-primes[]

        return smallPrimes;
    }

    public String getIllegalKeywords() {
        // tag::keywords[]
        String def = "Illegal ";
        String in = "Groovy variables";

        System.out.println( def + in);
        // end::keywords[]
        return def + in;
    }

}
