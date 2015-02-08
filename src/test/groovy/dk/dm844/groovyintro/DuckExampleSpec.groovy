package dk.dm844.groovyintro

import spock.lang.Specification


class DuckExampleSpec extends Specification {

    GroovyShell shell
    Binding binding
    PrintStream orig
    ByteArrayOutputStream out

    void setup() {
        orig = System.out
        out = new ByteArrayOutputStream()
        System.setOut(new PrintStream(out))
        binding = new Binding()
        shell = new GroovyShell(binding)
    }

    void cleanup() {
        System.setOut(orig)
    }

    void "Test Hello World output"() {
        when:
        shell.evaluate(new File("src/main/groovy/dk/dm844/groovyintro/DuckExample.groovy"))

        then:
        out.toString() == 'Quack quack!\nDonald\n'
    }


}