package dev.onecoffeeplz.letterkeyboard.data.model

data class KeyboardLayout(
    val id: Int,
    val name: String,
    val keys: List<List<Key>>,
)
