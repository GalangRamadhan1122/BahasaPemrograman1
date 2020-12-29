package polymorphisme

class Beo : Hewan(){
    var pelihara: String = ""
    var terbang: String = ""

    override fun deskripsi() {
        println("Beo adalah hewan berkaki 2 dan termasuk hewan yang biasa dipelihara $pelihara serta memiliki kemampuan terbang $terbang")
    }
}