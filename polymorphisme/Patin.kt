package polymorphisme

class Patin : Hewan(){
    var ternak: String = ""
    var kumis: String = ""

    override fun deskripsi() {
        println("Patin adalah hewan yang hidup di air dan biasa menjadi $ternak bagi sebagian orang, Patin juga memiliki kumis $kumis panjang di bagian wajahnya")
    }
}