package ru.ocrace

data class Summary(
    var indexPerson: Int? = null,
    var indexRace: Int? = null,
    val indexStage: Int? = null,
    val indexObstacle: Int? = null,
    val indexParticipant: Int? = null
) {
}