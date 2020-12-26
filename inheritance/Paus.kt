package inheritance

class Paus : Mamalia() {
    var panjang: Int = 0

    fun panjang() {
        println("Paus memiliki panjang kurang lebih $panjang meter")
    }
}