class usuario(private var usuario: String, private var contrasena: String) {
    var op: Int? = null

    constructor() : this("", "") {

        print("Ingrese su usuario:")
        usuario = readLine()!!.toString()
        print("Ingrese la contraseña:")
        contrasena = readLine()!!.toString()
    }


    fun validacion() {


        if (usuario == "admin" && contrasena == "admin123") {
            print("Usuario correcto.Bienvenido Admin")

        } else if (usuario == "vendedor" && contrasena == "vendedor123") {
            println("usuario correcto.Bienvenido vendedor")


        } else if (usuario == "invitado" && contrasena == "invitado123") {
            println("usuario correcto.Bienvenido Invitado")
        } else {

            println("usuario incorrecto")

            println("Presione la tecla 1 si desea intentarlo de nuevo")
        }


    }

    fun continuar() {

        var op: Int = readLine()!!.toInt()

        while (op == 1) {

            print("Ingrese su usuario:")
            usuario = readLine()!!.toString()
            print("Ingrese la contraseña:")
            contrasena = readLine()!!.toString()

            break
        }

        this.validacion()


    }


}












