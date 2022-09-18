 class usuario() {
     var op: Int=0
     var usuario: String =""
     var contrasena: String=""



     fun carga() {

         print("Ingrese su usuario:")
         usuario = readLine()!!.toString()
         print("Ingrese la contraseña:")
         contrasena = readLine()!!.toString()

     }


     fun validacion(){


         if (usuario == "admin" && contrasena == "admin123") {
             print("Usuario correcto.Bienvenido Admin ")
             this.menu()

         } else if (usuario == "vendedor" && contrasena == "vendedor123") {
             println("usuario correcto.Bienvenido vendedor")
             this.menu()

         } else if (usuario == "invitado" && contrasena == "invitado123") {
             println("usuario correcto.Bienvenido Invitado")
             this.menu()


         } else {

             println("usuario incorrecto")

             println("Presione la tecla 1 si desea intentarlo de nuevo")
         }


     }

     fun continuar() {

         var op: Int = readLine()!!.toInt()

         while (op == 1) {

             this.carga()

             break
         }

         this.validacion()


     }

     fun cambiocontra() {

         println("Escriba su codigo, contraseña actual,contraseña nueva separados por comas")
         println(
                     "1-admin/admin123\n" +
                     "2-vendedor/vendedor123\n" +
                     "3-invitado/invitado123")


         val str = readLine()!!.toString()
         val list: List<String> = str.split(",").toList()
         var  cambio=list[2]

         if (list[0]=="1" && list[1]=="admin123" && cambio==cambio){
             println("Contraseña actualizada con exito\n" +
                     "porfavor inicie seccion denuevo")

             this.carga()
             if (usuario=="admin"&& contrasena==cambio){
                 println("Usuario correcto.Bienvenido Admin")

             }else{
                 println("usuaro incorrecto. Intentelo de nuevo")
                this.carga()
             }

         }
         else{
             println("Parametros incorrectos asegurese de que su codigo y contraseña actual sean correctas\n" +
                     "vueva a intentarlo de nuevo")
             println(cambiocontra())
         }


         }

     fun menu() {

         var venta1 = Venta()
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
                 venta1.cargar()
                 venta1.listado()
                 venta1.venta()
             }

             2 -> {
                 println("Bienvenido a consulta de inventarios")
                 venta1.cargar()
                 venta1.listado()


             }

             3 -> {
                 println("Usted seleccionó la opcion de cambio de contraseña")


             }

             4 -> {
                 println("Gracias por ingresar a Farmacia Fiorella, que tenga un buen dia!")
             }

             else -> {
                 println("Esta opcion no es valida")
             }
         }
     }


 }















