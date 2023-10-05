
fun main() {
    // Criando conteúdos educacionais
    val conteudo1 = ConteudoEducacional("Matemática Básica", 110, Nivel.BASICO)
    val conteudo2 = ConteudoEducacional("Matemática Intermediária", 75, Nivel.INTERMEDIARIO)
    val conteudo3 = ConteudoEducacional("Matemática Avançada", 90, Nivel.DIFICIL)
    val conteudo4 = ConteudoEducacional("Fisica Básica", 110, Nivel.BASICO)
    val conteudo5 = ConteudoEducacional("Fisica Intermediária", 75, Nivel.INTERMEDIARIO)
    val conteudo6 = ConteudoEducacional("Fisica Avançada", 90, Nivel.DIFICIL)

    // Criando uma formação com uma lista de conteúdos
    val formacaoMatematica = Formacao("Formação em Matemática", listOf(conteudo1, conteudo2, conteudo3))
    val formacaoFisica = Formacao("Formação em Fisica", listOf(conteudo4, conteudo5, conteudo6))

    // Criando usuários
    val usuario1 = Usuario("Ana", "ana@example.com", Level.INICIANTE)
    val usuario2 = Usuario("João", "joao@example.com", Level.AMADOR)
    val usuario3 = Usuario("Maria", "maria@example.com", Level.EXPERIENTE)

    // Matriculando usuários na formação
    formacaoMatematica.matricular(usuario1)
    formacaoMatematica.matricular(usuario2)
    formacaoMatematica.matricular(usuario3)

    formacaoFisica.matricular(usuario3)

    // Imprimindo usuários inscritos
    formacaoMatematica.inscritos.forEach {
        println("Nome: ${it.nome}, Level ${it.level}")

        }
    formacaoFisica.inscritos.forEach{
        println("Nome: ${it.nome}")
    }
    }



