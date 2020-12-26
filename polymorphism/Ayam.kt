package polymorphism

class Ayam : Hewan() {
    var kaki: Int = 0
    var sayap: Int = 0

    fun banyakkaki() {
        println("Aku memiliki $kaki kaki")
    }

    fun sayap() {
        println("Aku memiliki $sayap pasang sayap")
    }
}