package inheritance

open class Hewan {
    var nama: String = ""
    var tinggal: String = ""
    var asal: String = ""

    fun perkenalan() {
        println("Aku adalah $nama, aku tinggal di $tinggal")
    }
}