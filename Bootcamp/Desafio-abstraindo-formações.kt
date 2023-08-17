enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

// Definindo a classe Usuario com um atributo nome.
class Usuario(val nome: String)

// Definindo a classe ConteudoEducacional com atributos nome e duracao (default é 60).
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

// Definindo a classe Formacao com atributos nome e conteudos.
class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    // Criando uma lista para armazenar os inscritos na formação.
    val inscritos = mutableListOf<Usuario>()

    // Método para matricular um usuário na formação.
    fun matricular(usuario: Usuario) {
        // Adiciona o usuário à lista de inscritos.
        inscritos.add(usuario)
        // Imprime uma mensagem confirmando a matrícula.
        println("Usuário ${usuario.nome} matriculado na formação $nome")
    }
}

fun main() {
    // Criando alguns ConteudoEducacional.
    val conteudo1 = ConteudoEducacional("Introdução à Programação")
    val conteudo2 = ConteudoEducacional("Estruturas de Dados")
    val conteudo3 = ConteudoEducacional("Desenvolvimento Web")

    // Criando uma Formacao com os conteúdos educacionais.
    val formacao = Formacao("Formação em Desenvolvimento", listOf(conteudo1, conteudo2, conteudo3))

    // Criando alguns usuários.
    val usuario1 = Usuario("João")
    val usuario2 = Usuario("Maria")

    // Matriculando os usuários na formação e imprimindo uma mensagem.
    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    // Imprimindo o nome da formação e a quantidade de inscritos.
    println("${formacao.nome} tem ${formacao.inscritos.size} inscritos:")

    // Imprimindo o nome de cada inscrito.
    for (inscrito in formacao.inscritos) {
        println(inscrito.nome)
    }
}