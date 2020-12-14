fun main() {

    val a : Human = Human("Galang")
    val b : Human = Human("Ramadhan")

    a.email = "galang@gmail.com"
    a.address = "Banguntapan, Bantul, Yogyakarta"


    b.email = "ramadhan@yahoo.com"
    b.address = "Kretek, Bantul, Yogyakarta"


    a.talk()
    b.talk()

    a.introduce()
    b.introduce()

    println(a.verify("galang@gmail.com"))

    println(Galang.name)
    val c : Galang = Galang

    println(c.nationality)


}
