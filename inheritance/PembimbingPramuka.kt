package inheritance

open class PembimbingPramuka :KaryawanSekolah() {
    var pelatih: String = ""

    fun melatih() {
        println("Saya adalah pelatih $pelatih di SMA maarif Yogyakarta")
    }
}