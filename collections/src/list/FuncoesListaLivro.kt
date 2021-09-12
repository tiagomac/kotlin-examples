package list

fun List<Livro?>.imprimeComMarcadores() {
    val textoFormatado = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it.titulo} de ${it.autor} ano ${it.anoPublicacao}"
        }
    println(" #### Lista de Livros #### \n$textoFormatado")
}