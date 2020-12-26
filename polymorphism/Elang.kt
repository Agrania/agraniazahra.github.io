package polymorphism

class Elang : Hewan() {
    var sayap: Int = 0

    fun sayap() {
        println("Aku memiliki $sayap pasang sayap")
    }

    override fun perkenalan() {
        println("Hallo aku burung $nama, aku terbang di $tinggal")
    }
}