package inheritance

open class KaryawanSekolah : orang(){
    var nip: String = ""
    var gaji: Int = 0

    fun bekerja() {
        println("Saya bekerja dengan gaji $gaji")
    }
}