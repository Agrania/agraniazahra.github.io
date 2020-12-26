package polymorphism

open class Mamalia : Hewan() {
    var jenis: String = ""

    fun jenis() {
        println("Aku merupakan hewan $jenis")
    }
}