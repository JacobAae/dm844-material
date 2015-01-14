import spock.lang.Specification

class ScriptsSpec extends Specification {

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
        shell.evaluate(new File("src/main/groovy/HelloWorld.groovy"))

        then:
        out.toString() == 'Hello World!\n'
    }

    /*
    @Test
    void testScriptWithAssert() {
        shell.evaluate(new File("src/mjg/scripts/script_with_assert.groovy"))
    }

    @Test
    void testScriptWithTrueVariable() {
        binding.ok = true
        shell.evaluate(new File("src/mjg/scripts/script_with_variable.groovy"))
        assertTrue shell.ok
    }

    @Test
    void testScriptWithFalseVariable() {
        binding.ok = false
        shell.evaluate(new File("src/mjg/scripts/script_with_variable.groovy"))
        assertFalse shell.ok
    }

    @Test
    void testHelloWorld() {
        shell.evaluate(new File("src/mjg/scripts/hello_world.groovy"))
        assertEquals "Hello, World!", out.toString().trim()
    }
 */

}