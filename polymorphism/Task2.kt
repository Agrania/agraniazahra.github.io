package polymorphism

fun main() {

    val kucing = Kucing()
    kucing.nama = "Kucing"
    kucing.tinggal = "Darat"
    kucing.asal = "Persia"
    kucing.perkenalan()
    kucing.kaki = 4
    kucing.banyakkaki()
    kucing.jenis = "Mamalia"
    kucing.jenis()

    val elang = Elang()
    elang.nama = "Elang"
    elang.tinggal = "Udara"
    elang.asal = "Indonesia"
    elang.perkenalan()
    elang.sayap = 2
    elang.sayap()

    val jerapah = Jerapah()
    jerapah.nama = "Jerapah"
    jerapah.tinggal = "Darat"
    jerapah.asal = "Afrika"
    jerapah.perkenalan()
    jerapah.kaki = 4
    jerapah.banyakkaki()
    jerapah.jenis = "Mamalia"
    jerapah.jenis()
    jerapah.tinggi = 5
    jerapah.tinggi()

    val lumba = LumbaLumba()
    lumba.nama = "Lumba-Lumba"
    lumba.tinggal = "Air"
    lumba.asal = "Afrika"
    lumba.perkenalan()
    lumba.jenis = "Mamalia"
    lumba.jenis()

    val paus = Paus()
    paus.nama = "Paus Biru"
    paus.tinggal = "Air"
    paus.asal = "Afrika"
    paus.perkenalan()
    paus.jenis = "Mamalia"
    paus.jenis()
    paus.panjang = 25
    paus.panjang()

    val ayam = Ayam()
    ayam.nama = "Ayam"
    ayam.tinggal = "Darat"
    ayam.asal = "Amerika"
    ayam.perkenalan()
    ayam.kaki = 2
    ayam.banyakkaki()
    ayam.sayap = 2
    ayam.sayap()

    val singa = Singa()
    singa.nama = "Singa"
    singa.tinggal = "Darat"
    kucing.asal = "Afrika"
    singa.perkenalan()
    singa.berat = 190
    singa.berat()
    singa.jenis = "Mamalia"
    singa.jenis()

}