package dev.onecoffeeplz.letterkeyboard.data.model

data class Key(
    val id: Int,
    val label: String,
    val code: String,
    val type: KeyType,
    val action: KeyAction,
)
