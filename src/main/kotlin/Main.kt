import org.intellij.lang.annotations.JdkConstants.ListSelectionMode

//Incluir em uma lista/vetor o nome e o número de telefone de uma pessoa;
//Permitir listar, alterar e excluir os dados dessa lista.
//O projeto deverá ser apresentado na próxima aula.
//val twoDArray = Array(2) { Array<Int>(2) { 0 } }


fun main(args: Array<String>) {
    //var rows = 20
    //var cols = 2
    var i = 0
    var k = 1
//    var Lista_Telefonica = Array(k) {Array<String>(2) {""} }
//    var Controle_Saida = 0
    do {

        var Lista_Telefonica = Array(k) {Array<String>(2) {""} }
        var Controle_Saida = 0


        println("---MENU---")
        println("1 - NOVO CONTATO")
        println("2 - EDITAR CONTATO")
        println("3 - LISTAR CONTATOS")
        println("0 - SAIR")
        Controle_Saida = readLine()?.toInt()!!
        if(Controle_Saida == 1) {
            println("Insira o nome: ")
            var receber_Nome = readLine()?.capitalize()
            if (receber_Nome != "") {
                Lista_Telefonica[i][i] = receber_Nome ?: ""
                println("Insira o numero de Telefone: ")
                var receber_Numero = readLine()
                if (receber_Numero != "") {
                    Lista_Telefonica[i][i + 1] = receber_Numero ?: ""
                    ++k
                    println(Lista_Telefonica[i][i])
                    println(Lista_Telefonica[i][i + 1])
                }
            }

        }
        if(Controle_Saida == 2) {
            println("insira o Nome que Deseja Buscar: ")
            var buscar_Nome = readLine()?.capitalize()
            var j = 0
            while (buscar_Nome == Lista_Telefonica[j][j]) {
                if (buscar_Nome == Lista_Telefonica[j][j]) {
                    println("nome: " + Lista_Telefonica[j][j])
                    println("Numero: " + Lista_Telefonica[j][j + 1])
                } else
                    j++
                println("---MENU---- ")
                println("Editar---- 0")
                println("Excluir--- 1")
                var escolha: Int = readLine()?.toInt() ?: 3
                if (escolha == 0) {
                    println("Insira o nome: ")
                    var receber_Nome = readLine()?.capitalize()
                    if (receber_Nome != "") {
                        Lista_Telefonica[j][j] = receber_Nome ?: Lista_Telefonica[j][j]
                        println("Insira o numero de Telefone: ")
                        var receber_Numero = readLine()
                        if (receber_Numero != "") {
                            Lista_Telefonica[j][j] = receber_Numero ?: Lista_Telefonica[j][j + 1]
                        }
                        println("nome: " + Lista_Telefonica[j][j])
                        println("Numero: " + Lista_Telefonica[j][j + 1])
                    }
                } else if (escolha == 1) {
                    println("deseja excluir:")
                    println("nome: " + Lista_Telefonica[j][j])
                    println("Numero: " + Lista_Telefonica[j][j + 1])
                    println("Sim--- 1")
                    println("Não--- 0")
                    var excluir: Int = readLine()?.toInt() ?: 3
                    if (excluir == 1) {
                        Lista_Telefonica[j][j] = ""
                        Lista_Telefonica[j][j + 1] = ""
                        println("nome: " + Lista_Telefonica[j][j])
                        println("Numero: " + Lista_Telefonica[j][j + 1])
                        println("EXCLUIDO")
                        --k
                    } else
                        return
                }
            }
        }
        if(Controle_Saida == 3) {
            println("1" + Lista_Telefonica.contentDeepToString())
        }
        //++k
        i++
    }while (Controle_Saida != 0)
    return
}
