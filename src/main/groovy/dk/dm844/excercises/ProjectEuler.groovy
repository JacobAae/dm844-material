package groovy.dk.dm844.excercises

/**
 * Created by jacob on 1/17/15.
 */
class ProjectEuler {


    def problemOne( int upTo = 1000 ) {
        (1..upTo-1).findAll { it % 3 == 0 || it % 5 == 0 }.sum()
    }

    def problemTwo() {
        def a = 1
        def b = 2
        def sum = 2
        while( b <4000000 ) {
            int next = a + b
            a = b
            b = next
            sum += next % 2 == 0 ? next : 0
        }
        return sum
    }

    def problemTree() {

    }

    List primeFactors(BigInteger number) {
        if( number.isProbablePrime(2000)) {
            return [number]
        }

    }

    List primesUpTo(def max) {
        List primes = [2]
        
        List isPrime = 2..max



    }

}
