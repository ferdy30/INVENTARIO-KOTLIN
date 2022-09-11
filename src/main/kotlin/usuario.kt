  class usuario(private var usuario: String, private var contrasena: String,private var Cambiocontrasena:String) {
    var op: Int? = null
      val menu=Menu()
      var cambio=""


       constructor():this("","","")



     fun carga(){

        print("Ingrese su usuario:")
        usuario = readLine()!!.toString()
        print("Ingrese la contraseña:")
        contrasena = readLine()!!.toString()

    }


   fun validacion() {


        if (usuario == "admin" && contrasena == "admin123") {
            print("Usuario correcto.Bienvenido Admin " )



        } else if (usuario == "vendedor" && contrasena == "vendedor123") {
            println("usuario correcto.Bienvenido vendedor")




        } else if (usuario == "invitado" && contrasena == "invitado123") {
            println("usuario correcto.Bienvenido Invitado")

        }else if (usuario=="admin"&& Cambiocontrasena== "$cambio"){
            println("usuario correcto.Bienvenido Admin")


        }

        else {

            println("usuario incorrecto")

            println("Presione la tecla 1 si desea intentarlo de nuevo")
        }

                   this.menu()
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
      fun prueba(){


      }
   fun cambiocontra(){
       println("Escriba su codigo, contraseña actual,contraseña nueva")
       println("1-admin/admin123\n" +
                "2-vendedor/vendedor123\n" +
                "3-invitado/invitado123")
      var Cambiocontrasena= readLine()!!.toString()
       if (cambio== " $cambio"){
           println("contraseña actualizada con exito")

       }else if (cambio=="2,vendedor123,vendedor321"){
           println("Acseso denegado")

       }else if (cambio=="3,invitador123,invitado321"){
           println("Acseso denegado")


       }
       this.carga()
       this.validacion()
   }

       fun menu() {

           println("....................................................................")
           println("........... FAVOR INGRESAR UNA DE LAS SIGUIENTES OPCIONES ..........")
           println("....................................................................")
           println("1. -venta nueva")
           println("2. -Consultar inventarios")
           println("3. -Cambiar contraseña")
           println("4. -salir del sistema")

           var opcion = readLine()!!.toInt()



           when (opcion) {
               1 -> {
                   println("Bienvenido a venta nueva")
               }

               2 -> {
                   println("Bienvenido a consulta de inventarios")
               }

               3 -> {
                   println("Usted seleccionó la opcion de cambio de contraseña")

                          this.cambiocontra()
               }

               4->{
                   println("Gracias por ingresar a Farmacia Fiorella, que tenga un buen dia!")
               }
               else->{
                   println("Esta opcion no es valida")
               }
           }
       }






   /*  fun menu() {

         println("....................................................................")
         println("........... FAVOR INGRESAR UNA DE LAS SIGUIENTES OPCIONES ..........")
         println("....................................................................")
         println("1. -venta nueva")
         println("2. -Consultar inventarios")
         println("3. -Cambiar contraseña")
         println("4. -salir del sistema")

         var opcion = readLine()!!.toInt()



         when (opcion) {
             1 -> {
                 println("Bienvenido a venta nueva")
             }

             2 -> {
                 println("Bienvenido a consulta de inventarios")
             }

             3 -> {
                 println("Usted seleccionó la opcion de cambio de contraseña")


             }


             4->{
                 println("Gracias por ingresar a Farmacia Fiorella, que tenga un buen dia!")
             }
             else->{
                 println("Esta opcion no es valida")
             }
         }

     */}
















