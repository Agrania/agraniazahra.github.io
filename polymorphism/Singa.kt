package polymorphism

class Singa : Mamalia() {

    var berat: Int = 0

    fun berat() {
        println("Singa jantan memiliki berat sekitar $berat kg")
    }

    override fun perkenalan() {
        println("Kenalin... Aku adalah $nama, aku tinggal di $tinggal")
    }
}