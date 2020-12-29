package polymorphisme

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
    val sapi = Sapi()
    sapi.mata = "Dua"
    sapi.nyawa = "Satu"
    sapi.bulu = "Banyak"
    sapi.ekor = "Panjang"
    sapi.kaki = 4
    sapi.deskripsi()

    val kelinci = Kelinci()
    kelinci.mata = "Dua"
    kelinci.nyawa = "Satu"
    kelinci.kaki = 4
    kelinci.ekor = "Panjang"
    kelinci.pelihara = " Oleh Manusia"
    kelinci.deskripsi()

    val patin = Patin()
    patin.mata = "Dua"
    patin.nyawa = "Satu"
    patin.kumis = "Lebat dan"
    patin.ternak = "Hewan Ternak"
    patin.deskripsi()

    val beo = Beo()
    beo.mata = "Dua"
    beo.nyawa = "Satu"
    beo.pelihara = "Oleh Manusia"
    beo.terbang = "Tinggi"
    beo.deskripsi()
}