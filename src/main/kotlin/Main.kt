import org.intellij.lang.annotations.JdkConstants.ListSelectionMode
fun main(args: Array<String>) {
    var i = 0
    var j = 0
    var index = 0
    var Lista_Telefonica = mutableListOf<MutableList<String>>()
    var Controle_Saida = 0

    do {
        fun returnline20(){
            return
        }

        println("---MENU---")
        println("1 - NOVO CONTATO")
        println("2 - EDITAR CONTATO")
        println("3 - LISTAR CONTATOS")
        println("0 - SAIR")
        print("DIGITA A OPÇÃO: ")
        Controle_Saida = readLine()?.toInt()!!
        println("")
        if(Controle_Saida == 1) {
            Lista_Telefonica.add(mutableListOf())
            print("Insira o nome: ")
            var receber_Nome = readLine()?.capitalize()
            println("")
            if (receber_Nome != "") {
                Lista_Telefonica[i].add(receber_Nome.toString())
                print("Insira o numero de Telefone: ")
                var receber_Numero = readLine()
                println("")
                if (receber_Numero != "") {
                    Lista_Telefonica[i].add(receber_Numero.toString())
                    println(Lista_Telefonica[i][0])
                    println(Lista_Telefonica[i][1])
                    i++
                }
            }

        }
        if(Controle_Saida == 2) {
            print("insira o Nome que Deseja Buscar: ")
            var buscar_Nome = readLine()?.capitalize()
            println("")
            //while (buscar_Nome == Lista_Telefonica[j][0]) {
            do{
                if (buscar_Nome == Lista_Telefonica[j][0]) {
                    println("nome: " + Lista_Telefonica[j][0])
                    println("Numero: " + Lista_Telefonica[j][1])


                    println("---MENU---- ")
                    println("Editar---- 0")
                    println("Excluir--- 1")
                    println("DIGITE A OPÇÃO: ")
                    var escolha: Int = readLine()?.toInt() ?: 3
                    println("")
                    if (escolha == 0) {
                        print("Insira o nome: ")
                        var receber_Nome = readLine()?.capitalize()
                        println("")
                        if (receber_Nome != "") {
                            Lista_Telefonica[j][0] = receber_Nome ?: Lista_Telefonica[j][0]
                            print("Insira o numero de Telefone: ")
                            var receber_Numero = readLine()
                            println("")
                            if (receber_Numero != "") {
                                Lista_Telefonica[j][0] = receber_Numero ?: Lista_Telefonica[j][1]
                            }
                            println("nome: " + Lista_Telefonica[j][0])
                            println("Numero: " + Lista_Telefonica[j][1])
                            returnline20()
                        }
                    } else if (escolha == 1) {
                        println("deseja excluir:")
                        println("nome: " + Lista_Telefonica[j][0])
                        println("Numero: " + Lista_Telefonica[j][1])
                        println("Sim--- 1")
                        println("Não--- 0")
                        print("DIGITE A OPÇÃO: ")
                        var excluir: Int = readLine()?.toInt() ?: 3
                        println("")
                        if (excluir == 1) {
                            //Lista_Telefonica[j][0] = ""
                            //Lista_Telefonica[j][1] = ""
                            Lista_Telefonica.removeAt(j)

                            println("nome: " + Lista_Telefonica[j][0])
                            println("Numero: " + Lista_Telefonica[j][1])
                            println("EXCLUIDO")
                            returnline20()
                        }
                    }
                }
                else
                    j++
            } while (buscar_Nome == Lista_Telefonica[j][0])
        }
        if(Controle_Saida == 3) {
            index = 0
            while (index  < Lista_Telefonica.size ){
                println("Nome: " + Lista_Telefonica[index][0] + " Numero: " + Lista_Telefonica[index][1])
                println("------------------------------------")
                index ++
            }
        }

    }while (Controle_Saida != 0)
}
