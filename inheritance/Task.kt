package inheritance

fun main(){

    val afrig = dosen()
    afrig.nama = "Afrig Aminuddin"
    afrig.alamat = "Condongcatur"
    afrig.perkenalan()
    afrig.gaji = 1000000
    afrig.bekerja()
    afrig.prodi = "Sistem Informasi"
    afrig.mengajar()

    val andika = mahasiswa()
    andika.nama = "Andika Maharani"
    andika.alamat ="Bantul"
    andika.perkenalan()
    andika.prodi = "Sistem Informasi"
    andika.belajar()

    val budi = satpam()
    budi.nama = "Budi Satria"
    budi.alamat = "Wonosari"
    budi.perkenalan()
    budi.gaji = 500000
    budi.bekerja()
    budi.pos = "Pos Barat"
    budi.menjaga()

    println()
    println()
    val dimas = Guru()
    dimas.nama = "dimas nugroho"
    dimas.alamat = "Bantul"
    dimas.perkenalan()
    dimas.gaji = 250000
    dimas.bekerja()
    dimas.mapel = "Sejarah"
    dimas.mengajar()

    val galang = Pelajar()
    galang.nama = "Galang Ramadhan"
    galang.nis = 2212
    galang.alamat = "Yogyakarta"
    galang.perkenalan()
    galang.jurusan = "IPS"
    galang.belajar()

    val mukti = KaryawanSekolah()
    mukti.nama = "mukti farhan"
    mukti.alamat = "klaten"
    mukti.perkenalan()
    mukti.gaji = 1000000
    mukti.bekerja()


    val burhan = CleaningService()
    burhan.nama = "burhan"
    burhan.alamat = "seturan"
    burhan.sma = "SMA Maarif Yogyakarta"
    burhan.perkenalan()
    burhan.gaji = 700000
    burhan.membersihkan()

    val koko = PembimbingPramuka()
    koko.nama = "koko yoi"
    koko.alamat = "Wonosari"
    koko.perkenalan()
    koko.gaji = 4000000
    koko.pelatih = "Pramuka SMP"

}