fun main() {
    val afrig : Human = Human( name: "Afrig")
    val andi : Human = Human ( name: "Andi")

    afrig.email = "afrig@gmail.com"
    andi.address = "Condongcatur, Sleman, Yogyakarta"

    andi.email = "andi@gmail.com"
    andi.address = "Kotagede, Yogyakarta"

    afrig.talk()
    andi.talk()

    afrig.introduce()

    println(afrig.verify(email: "afrig@gmail.com"))

    println(Rahardi.name)

    val ardi : Rahardi = Rahardi
    println(ardi.nationality)

    println(afrig)
}