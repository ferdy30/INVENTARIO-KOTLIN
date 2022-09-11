fun main(parametro: Array<String>) {
    println(".....................................................")
    println(".... BIENVENIDO AL SISTEMA DE FARMACIA FIORELLA.....")
    println("........... FAVOR INGRESAR SUS CREDENCIALES ..........")
    println(".....................................................")


    val empleado = usuario()

    empleado.validacion()
    empleado.continuar()


}


