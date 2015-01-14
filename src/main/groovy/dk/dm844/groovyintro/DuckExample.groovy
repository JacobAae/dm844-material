package groovy.dk.dm844.groovyintro
// tag::duck[]
class Duck {
    String name
    void quack() {
        println 'Quack quack!'
    }
}

def duck = new Duck()
def method = 'quack'
duck.name = 'Donald'

duck."$method"()
println duck."name"
// end::duck[]
