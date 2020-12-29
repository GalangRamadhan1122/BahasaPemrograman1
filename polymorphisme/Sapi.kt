package polymorphisme

class Sapi :Hewan() {
    var kaki: Int = 0
    var bulu: String = ""
    var ekor: String = ""

    override fun deskripsi() {
        println("Sapi adalah hewan berkaki $kaki dengan ekor $ekor, serta memiliki bulu $bulu ditubuhnya")
    }
}