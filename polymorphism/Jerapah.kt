package polymorphism

class Jerapah : Mamalia() {
    var kaki: Int = 0
    var tinggi: Int = 0

    fun banyakkaki() {
        println("Aku memiliki $kaki kaki")
    }

    fun tinggi() {
        println("Tinggiku kurang lebih $tinggi meter")
    }

}