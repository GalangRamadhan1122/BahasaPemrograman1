package inheritance

class Pelajar :orang(){
    var nis: Int = 0
    var jurusan: String = ""

    fun belajar() {
        println("Saya belajar di jurusan $jurusan")
    }
}