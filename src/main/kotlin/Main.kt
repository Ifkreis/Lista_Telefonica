import org.intellij.lang.annotations.JdkConstants.ListSelectionMode

//Incluir em uma lista/vetor o nome e o número de telefone de uma pessoa;
//Permitir listar, alterar e excluir os dados dessa lista.
//O projeto deverá ser apresentado na próxima aula.
//val twoDArray = Array(2) { Array<Int>(2) { 0 } }

//    0  1
//0  [i] [j]
//1  [i] [j]
fun main(args: Array<String>) {
    var i = 0
    var j = 0
    var index = 0
    var Lista_Telefonica = mutableListOf<MutableList<String>>()
    var Controle_Saida = 0

    do {


        println("---MENU---")
        println("1 - NOVO CONTATO")
        println("2 - EDITAR CONTATO")
        println("3 - LISTAR CONTATOS")
        println("0 - SAIR")
        Controle_Saida = readLine()?.toInt()!!
        if(Controle_Saida == 1) {
            Lista_Telefonica.add(mutableListOf())
            println("Insira o nome: ")
            var receber_Nome = readLine()?.capitalize()
            if (receber_Nome != "") {
                Lista_Telefonica[i].add(receber_Nome.toString())
                println("Insira o numero de Telefone: ")
                var receber_Numero = readLine()
                if (receber_Numero != "") {
                    Lista_Telefonica[i].add(receber_Numero.toString())
                    println(Lista_Telefonica[i][0])
                    println(Lista_Telefonica[i][1])
                }
            }

        }
        if(Controle_Saida == 2) {
            println("insira o Nome que Deseja Buscar: ")
            var buscar_Nome = readLine()?.capitalize()
            while (buscar_Nome == Lista_Telefonica[j][0]) {
                if (buscar_Nome != Lista_Telefonica[j][0]) {
                    j++
                }
                if (buscar_Nome == Lista_Telefonica[j][0]) {
                    println("nome: " + Lista_Telefonica[j][0])
                    println("Numero: " + Lista_Telefonica[j][1])


                    println("---MENU---- ")
                    println("Editar---- 0")
                    println("Excluir--- 1")
                    var escolha: Int = readLine()?.toInt() ?: 3
                    if (escolha == 0) {
                        println("Insira o nome: ")
                        var receber_Nome = readLine()?.capitalize()
                        if (receber_Nome != "") {
                            Lista_Telefonica[j][0] = receber_Nome ?: Lista_Telefonica[j][0]
                            println("Insira o numero de Telefone: ")
                            var receber_Numero = readLine()
                            if (receber_Numero != "") {
                                Lista_Telefonica[j][0] = receber_Numero ?: Lista_Telefonica[j][1]
                            }
                            println("nome: " + Lista_Telefonica[j][0])
                            println("Numero: " + Lista_Telefonica[j][1])
                        }
                    } else if (escolha == 1) {
                        println("deseja excluir:")
                        println("nome: " + Lista_Telefonica[j][0])
                        println("Numero: " + Lista_Telefonica[j][1])
                        println("Sim--- 1")
                        println("Não--- 0")
                        var excluir: Int = readLine()?.toInt() ?: 3
                        if (excluir == 1) {
                            //Lista_Telefonica[j][0] = ""
                            //Lista_Telefonica[j][1] = ""
                            Lista_Telefonica.removeAt(j)

                            println("nome: " + Lista_Telefonica[j][0])
                            println("Numero: " + Lista_Telefonica[j][1])
                            println("EXCLUIDO")
                        }
                    }
                }
            }
        }
        if(Controle_Saida == 3) {
            while (index  < Lista_Telefonica.size ){
                println("Nome: " + Lista_Telefonica[index][0] + " Numero: " + Lista_Telefonica[index][1])
                println("------------------------------------")
                index ++
            }
        }
        i++
    }while (Controle_Saida != 0)
    return
}
