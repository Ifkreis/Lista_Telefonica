//Incluir em uma lista/vetor o nome e o número de telefone de uma pessoa;
//Permitir listar, alterar e excluir os dados dessa lista.
//O projeto deverá ser apresentado na próxima aula.



fun main(args: Array<String>) {
    var rows = 1
    var cols = 2
    var i = 0
    var Lista_Telefonica = List(rows) { MutableList(cols) { "" } }


    println("Insira o nome: ")
    var receber_Nome = readLine()?.capitalize()
    if (receber_Nome != "") {
        Lista_Telefonica[i][i] = receber_Nome ?: ""
        println("Insira o numero de Telefone: ")
        val receber_Numero = readLine()
        if (receber_Numero != "") {
            //print(i)
            Lista_Telefonica[i][i + 1] = receber_Numero ?: ""
            println(Lista_Telefonica[i][i])
            println(Lista_Telefonica[i][i+1])
            //print("\n" + i)
        }
    }

    println("insira o Nome que Deseja Buscar: ")

    var buscar_Nome = readLine()?.capitalize()
    i = 0
    while (buscar_Nome == Lista_Telefonica[i][i]) {
        if (buscar_Nome == Lista_Telefonica[i][i]) {
            println("nome: " + Lista_Telefonica[i][i])
            println("Numero: " + Lista_Telefonica[i][i+1])
        } else
            i++

        println("---MENU---- ")
        println("Editar---- 0")
        println("Excluir--- 1")

        var escolha: Int = readLine()?.toInt() ?: 3
        if (escolha == 0) {
            println("Insira o nome: ")
            val receber_Nome = readLine()?.capitalize()
            if (receber_Nome != "") {
                Lista_Telefonica[i][i] = receber_Nome ?: Lista_Telefonica[i][i]
                println("Insira o numero de Telefone: ")
                val receber_Numero = readLine()
                if (receber_Numero != "") {
                    Lista_Telefonica[i][i + 1] = receber_Numero ?: Lista_Telefonica[i][i + 1]
                }
                println("nome: " + Lista_Telefonica[i][i])
                println("Numero: " + Lista_Telefonica[i][i+1])
            }
        }else if (escolha == 1){
            println("deseja excluir:")
            println("nome: " + Lista_Telefonica[i][i])
            println("Numero: " + Lista_Telefonica[i][i+1])
            println("Sim--- 1")
            println("Não--- 0")
            var excluir: Int = readLine()?.toInt() ?: 3
            if(excluir == 1) {
                Lista_Telefonica[i][i] = ""
                Lista_Telefonica[i][i + 1] = ""
                println("nome: " + Lista_Telefonica[i][i])
                println("Numero: " + Lista_Telefonica[i][i + 1])
                println("EXCLUIDO")
            } else
                return
        }
    }
}
