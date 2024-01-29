// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }
enum class SEXO { F, M }

data class Usuario(val nome: String, var idade: Int, val sexo: SEXO)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60, val nivel: Nivel, var concluido: Boolean = false)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(vararg  usuarios: Usuario) = inscritos.addAll(usuarios)

    fun listarInscritos ()  = inscritos.toString()

    fun listarConteudos() = conteudos.toString()

}

fun main() {

    val user1 = Usuario("José", 19, SEXO.M)
    val user2 = Usuario("Maria", 20, SEXO.F)
    val user3 = Usuario("João", 21, SEXO.M)
    val user4 = Usuario("Célia", 22, SEXO.F)

    val ce1 = ConteudoEducacional("Algorritmos", 40, Nivel.BASICO)
    val ce2 = ConteudoEducacional(nome = "Avançando no WEB",  nivel = Nivel.INTERMEDIARIO)
    val ce3 = ConteudoEducacional("JS Adançando", 80, Nivel.AVANCADO)

    val formacao1 = Formacao("DEV WEB", listOf(ce1, ce2, ce3))
    formacao1.matricular(user1, user2, user3, user4)

    println(formacao1.listarInscritos())
    println(formacao1.listarConteudos())
}
