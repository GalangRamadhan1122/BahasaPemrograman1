package polymorphisme

open class Hewan {
    var mata: String = ""
    var nyawa: String =""

    open fun deskripsi() {
        println("Hewan yang memiliki $mata dan juga bernyawa $nyawa")
    }
}