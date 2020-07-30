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

    val nombre = "Alberto"
    val apellido: String = "Del Viejo"

    val nombreapellido = "Alberto\nDel Viejo"
    println("Tu nombre es: $nombreapellido")

    println("Tu nombre es: $nombre")

    //Raw String
    val parrafo = """Lorem Ipsum is simply dummy text of the printing and 
                    typsetting industry.Loren""".trimIndent()

    println(parrafo)

    val onetoHundred: IntRange = 1..5
    for (i in onetoHundred){
        println(i)
    }

    for (letra in 'A'..'C'){
        print(letra)
    }

    //Sentencia if --> Operadores lógicos booleano
    val numero = 2
    if(numero.equals(2)){//false
    println("Si, el numero es igual a 2")
    }else{
        println("No, el numero no es igual a 2")
    }
     
    //Sentencia when (similar a switch)
    when (numero){
        in 1..5 -> println("Está entre 1 y 5")
        in 1..3 -> println("Está entre 1 y 3")
        !in 5..10 -> println("No esta entre 5 y 10")
        else -> println("No esta en ninguno de los anteriores")
    }

    var i = 1
    //while para manejar contadores
    while (i<=10){
        println("mensaje: $i")
        i++
    }

    //do while 
    i = 1
    do{
        println("mensaje: $i")
        i++
    }while(i<=10)

}