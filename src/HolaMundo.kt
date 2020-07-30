//La variable global tiene que ser unchangeable para no contaminar las funciones puras (De otro modo se podría modificar y alterar todo)

const val N = "NAME" // const siempre sera para variables globales
//var n = 3 --> Mala práctica por que la variable global puede ser cambiada al ser changeable

//Funciones puras 

fun main(args: Array<String>){
    println("Hola mundo")
    println(1+1)
    println(3-1)
    println(2*2)
    println(4/2)
    println(7%2)

    val a = 4   //val se utiliza para variables locales 
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println(a.times(b))
    println(a.div(b))

    println(N)
}