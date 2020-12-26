package polymorphism

class Kucing : Mamalia() {
    var kaki: Int = 0

    fun banyakkaki() {
        println("Aku memiliki $kaki kaki")
    }

    override fun perkenalan() {
        println("Kenalin dong, aku adalah $nama, aku tinggal di $tinggal")
    }
}