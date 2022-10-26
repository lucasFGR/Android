fun bonusWhen(cargo: String): Float {
    val bonus = when (cargo) {
        "Gerente" -> {
            2000f
        }

        "Coordenador" -> {
            1500f
        }

        "Engenheiro" -> {
            1000f
        }

        "Estagiario" -> {
            500f
        }

        else -> {
            0f
        }

    }
    return bonus
}


fun main() {

}