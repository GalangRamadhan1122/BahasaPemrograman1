package inheritance

class Guru : KaryawanSekolah() {
    var mapel: String = ""

    fun mengajar() {
        println("Saya mengajar mata pelajaran $mapel")
    }
}