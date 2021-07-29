package files

fun main() {
    val pair: Pair<String, Double> = Pair("Mateus", 1000.0) // tipo de mapa
    val map1 = mapOf(pair)

    map1.forEach{ (k, v) ->
        println("Chave: $k - Valor: $v")
    }

    val map2 = mapOf(
        "Pedro" to 2500.0,
        "Bibiana" to 3000.0
    )
    map2.forEach{ (k, v) ->
        println("Chave: $k - Valor: $v")
    }
}