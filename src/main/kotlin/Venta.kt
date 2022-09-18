import java.io.FileOutputStream
import java.io.OutputStreamWriter
import java.io.PrintWriter
import java.text.DecimalFormat



class Venta {

    val inventario: MutableMap<Int, Inventario> = mutableMapOf()
    val vendedor = usuario()

    fun cargar() {

        inventario[0] = Inventario("sanabucal", 7.12f, 600)
        inventario[1] = Inventario("Tosil", 5.10f, 500)
        inventario[2] = Inventario("Ambroxol", 5.06f, 800)
        inventario[3] = Inventario("Antigrip A", 44.25f, 200)
        inventario[4] = Inventario("Brondex", 3.60f, 800)
        inventario[5] = Inventario("Cetafren", 20.11f, 400)
        inventario[6] = Inventario("Dologrip", 16f, 100)
        inventario[7] = Inventario("Palagrip", 3.20f, 400)
        inventario[8] = Inventario("Panadol dia", 2.94f, 500)
        inventario[9] = Inventario("Panadol noche", 2.94f, 500)
        inventario[10] = Inventario("Panadol Multisintomas", 3.46f, 400)
    }

    fun listado() {
        println("listado de nuestros productos")
        for ((codigo, inventario) in inventario) {
            println("Codigo: $codigo  Descripcion ${inventario.nombre}  Precio: ${inventario.precio}  Stock Actual: ${inventario.cantidad}")
        }


    }fun validar() {
        print("Desea regresar al menu? s/n")
        var opcion = readLine().toString()

        if (opcion == "s") {
            var usuario = usuario()
            print(usuario.menu())
        } else if (opcion == "n") {
            print("tenga un feliz día")
        } else ("opcion no valida")

    }
    //consultar productos y hacer venta
    val datos =ArrayList<String>()
    val precio = ArrayList<Float>()



    fun venta() {
        println("                                            ")
        print("Ingrese el codigo del producto que desea comprar:")
        val codigo = readLine()!!.toInt()

        if (codigo in inventario) {
            println("                                            ")
            println("Nombre: ${inventario[codigo]?.nombre}  Precio:${inventario[codigo]?.precio}  Stock:${inventario[codigo]?.cantidad}")
            println("                                           ")

            //DATOS REQUERIDOS

            print("Ingrese la cantidad de productos que desea:")
            val cant = readLine()!!.toFloat()

            val cant1 = inventario[codigo]?.precio?.toFloat()
            println("                                            ")
            println("CANTIDAD: $cant TOTAL: " + cant * cant1!!)
            println("                                            ")

            println("----------Desea agregar más productos?----------------")
            println("s/n")
            val leer = readLine()


            //DATOS GUARDADOS

            val z = "CANTIDAD: $cant TOTAL: " + cant * cant1!!
            val x = "PRODUCTO: ${inventario[codigo]?.nombre}  PRECIO: ${inventario[codigo]?.precio}          $z "
            val X = x.toString()

            val precio1 = cant*cant1
            precio.add(precio1!!)

            val sum = precio.sum()

            datos.add(X)

             //FACTURA

            while (leer == "s") {
                this.venta()
            }
            if (leer == "n") {
                println("-----------------FARMACIA FIORELLA------------------------")
                println("----------------------FACTURA----------------------------")
                println("---------------------------------------------------------")

                for (items in datos) {
                    println("${items}")
                }
                println("                                                         ")

                //TOTAL
                println("                                           TOTAL: $$sum")
                if (sum > 20){
                    val sum1 = sum*(0.03)
                    val sum2 = DecimalFormat("#.##")
                    val x = sum2.format(sum1).toDouble()
                    val totaldescuento=  sum-x
                    print("                            TOTAL CON DESCUENTO: $"+sum2.format(totaldescuento))
                }



                println("                                                         ")
                println("---------------------------------------------------------")
                println("---------------------------------------------------------")
                println("------------------Feliz día------------------------------")

          //      println(vendedor.comprador())

                this.validar()

            } else {
                print("Opcion no valida")
                this.validar()

            }


}else {
    println("Opcion no valida")
            this.validar()
}}}