package polymorphisme

class Kelinci : Hewan() {
    var kaki: Int = 0
    var pelihara: String = ""
    var ekor: String = ""

    override fun deskripsi() {
        println("Kelinci adalah hewan berkaki $kaki, berekor $ekor, dan termasuk hewan yang biasa dipelihara $pelihara")
    }
}