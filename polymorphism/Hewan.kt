package polymorphism

open class Hewan {
    var nama: String = ""
    var tinggal: String = ""
    var asal: String = ""

   open fun perkenalan() {
        println("Aku adalah $nama, aku tinggal di $tinggal")
    }
}