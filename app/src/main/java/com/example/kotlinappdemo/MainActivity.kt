package com.example.kotlinappdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /** codigo()
        tipodatos()
        operadores()
        promedio()
        operadoresUnarios()
        operadoresRelaciones()
        operadoresRelaciones()
        operadoresLogicos()
        rangoDeInstancias()
        estructurasDeControl()
        EstructurasIterativas()
        cicloFor()
        listas()
        diccionarioMapas()*/
        funciones()
    }


    fun codigo() {

        var nombre = "David"
        var a = 2
        var b = 2
        var c = 5

        var suma = a + b + c

        println("$nombre El resultado de la suma es: $suma")
    }

    fun tipodatos() {
        //var: variables mutables
        //val: variables inmutables

        var numeroA: Byte = 12
        var numeroc: Short = 8
        var numeroB: Int = 24
        var numeroD: Long = 12584

        var numeroE: Float = 2.5f
        var numeroF: Double = 2.5

        var caracter: Char = 'a'
        var nombre: String = "David"
        var logico: Boolean = true

        var edad: Int = numeroA.toInt()
        var codigo = "CDHH"

        println("Hola su nombre es $nombre su edad es $edad sumatoria ${numeroA + numeroB}")
    }

    /**
     * Operadores Aritmeticos
     */

    fun operadores() {
        println("Operadores Aritmeticos")
        var num1: Double = 8.0
        var num2 = 2
        var res: Double

        res = num1 + num2
        println("El resultado de la suma de $num1 + $num2 = $res")


    }

    fun promedio() {
        var num1: Double = 8.0
        var num2: Double = 2.0
        var num3 = 3.0

        var prom = (num1 + num2 + num3) / 3

        println("El promedio del \nnum1=$num1 \nnum2=$num2 \nnum3=$num3 \nes $prom")
    }

    fun operadoresUnarios() {
        println("Operadores Unarios")
        //++ --
        var num1: Int = 3
        println("num1 por defecto $num1")
        println("num1 con PreFijo ${num1++}")
        //println("num1 con PostFijo ${++num1}")
        println("null despues del incremento $num1")
    }

    fun operadoresRelaciones() {
        //operadores Relacionales
        //permite deifnir la relacion entre 2 o mas expresiones
        //< menor que 			- 2 < 5
        //> mayor que 			- 6 > 3
        //<= menor o igual que 	- 2<=3
        //>= mayor o igual que 	- 2>=3
        //!= diferente de 		- 2!=8
        //== igual que 			- 2==2

        var num1 = 3
        var num2 = 5

        var res = num1 < num2
        println("Respuesta $num1<$num2=$res")
    }


    fun operadoresLogicos() {
        var num1 = 2
        var num2 = 4

        var res = !(num1 == num2) && (num1 < 5)
        println("($num1 == $num2)&&($num1<5)=$res")

    }

    fun rangoDeInstancias() {
        //Rango de instancias
        //a..b ..define el intervalo entre los valores a y b 1..8
        //x in a..b valida si x se encuentra dentro del intervalo
        //x !in a..b valida si x NO se encuentra dentro del intervalo

        var res = 2 in 1..5
        println("2 esta en el intervalo 1..5? = $res")

        res = 12 in 1..5
        println("12 esta en el intervalo 1..5? = $res")

        res = 12 !in 1..5
        println("12 NO esta en el intervalo 1..5? = $res")
    }

    fun estructurasDeControl() {
        //Seleccion multiple when reemplazo del switch case

        var estacion = 3

        when (estacion) {
            1 -> println("Invierno")
            2 -> println("Primavera")
            3 -> println("Verano")
            4 -> println("Otoño")
            else -> println("No corresponde a ninguna estacion")
        }

        var mes = 12

        when (mes) {
            1 -> println("enero")
            2 -> println("febrero")
            3 -> println("marzo")
            4 -> println("abril")
            5 -> println("mayo")
            6 -> println("junio")
            7 -> println("julio")
            8 -> println("agosto")
            9 -> println("septiembre")
            10 -> println("octubre")
            11 -> println("noviembre")
            12 -> println("diciembre")
            else -> println("No corresponde a ninguna estacion")
        }
    }

    fun EstructurasIterativas() {
        // Estructuras iterativas - ciclos
        // son estructuras de control que permiten repetir procesos dependiendo
        // de una condicion de parada
        // do while -> Repita mientras
        // while
        // for

        /** var i=1
        do{
        println("$i")
        i++ //i=i+1
        }while (i<=10)

        while (i<=10){
        println("$i")
        i++ //i=i+1
        }

        //rango de numeros
        //for(i in 2..10 step 2) print("$i ")
        //for(i in 10 downTo 0) print("$i ")
        //for(i in 'a'.. 'z') print("$i ")

        for(i in 1..10){
        print("$i ")
        if(i == 4){
        print("Encontro el cuatro ")
        }
        }*/
        for (i in 'a'..'c') {
            println("$i")
            for (j in 1..3) {
                print("$j")
            }
            println()
        }
    }

    fun cicloFor() {
        // ciclo for  recorrer un arreglo
        var arreglo2: Array<String> = arrayOf("pepe", "juan", "maria", "david", "carlos")

        for ((i, value) in arreglo2.withIndex()) {

            println("El elemento en la posicion $i es igual a $value ")

        }

        /**
         * Un array es una estructura que nos permitirá almacenar datos diferentes
         * Ej el contenido del array x es [3,6,8,10,2] vemos 5 elementos
         * esta asignado a un indice de 0 a 4 (tam-1 -> 5-1=4)
         * * indice 0 = 3
         * * indice 1 = 6
         * * indice 2 = 8
         * * indice 3 = 10
         * * indice 4 = 2
         */
        //Array hay que definir de que tipo es
        //ArrayOf toma el tipo de dato

        var arreglo = arrayOf("Pepe", "Juan", "Carlos")

        // println("La cantidad de posiciones es: "arreglo.size)
        println("En la pos 0 = " + arreglo[0])
        println("En la pos 1 = " + arreglo[1])
        println("En la pos 2 = " + arreglo[2])

    }

    fun listas() {
        /**
         * Listas
         *
         * listas inmutables: listOf setOf
         * listas Mutables: mutableListOf arrayListOf,
         */

        val list = mutableListOf(1, 2, 3, 4, 5)//no se puede modificar
        list.add(6)
        list.add(7)
        list.add(8)
        println(list)
        println()

        /* for (i in list){
           println(i)
       }*/

        var list2 = arrayListOf(5, 6, 8, 36, 2, 90, 54, 12, 4, 35)
        println(list2)
        list2.sort()
        println(list2)
        list2.sortDescending()
        println(list2)

        var list3 = setOf(1, 2, 3, 4, 4, 5, 5, 6, 7, 8) //no repite los numeros
        println(list3)
    }

    fun diccionarioMapas() {
        /**
         * diccionarios o mapas
         **/

        val mapaDeNumeros = mapOf("cod1" to 1, "cod2" to 2, "cod3" to 3, "cod4" to 4)

        println("Mapa: $mapaDeNumeros")
        println("Claves: ${mapaDeNumeros.keys}")
        println("Valores: ${mapaDeNumeros.values}")

        for (elemento in mapaDeNumeros) {
            println("${elemento.key} - ${elemento.value}")

        }
    }

    fun funciones() {
        //uso de funciones y ambito de variables en kotlin
        var nombre = "David"
        var notaF1 = calcularPromedio(3.0, 4.0, 2.0, "Ingles", nombre)
        var notaF2 = calcularPromedio(3.5, 4.2, 2.0, "Español", nombre)
        var notaF3 = calcularPromedio(3.0, 4.5, 2.0, "Etica", nombre)
        var notaFinal = calcularPromedio(notaF1, notaF2, notaF3, "Todas las materias", nombre)
    }

    fun calcularPromedio(n1: Double, n2: Double, n3: Double, materia: String, nombre: String): Double {
        var prom = (n1 + n2 + n3) / 3
        println("Hola $nombre El Promedio de $materia es $prom")
        return prom
    }
    
}
