package inheritance

class Dosen : Karyawan() {

    var prodi: String = ""

    fun mengajar(){
        println("Saya mengajar di prodi $prodi")
    }
}