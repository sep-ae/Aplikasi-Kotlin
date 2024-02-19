package com.ti2a.aplikasikotlin

fun main(args: Array<String>) {
    printHeader("Biodata")
    biodata("Septito Aldo Elvianto", alamat = "Desa Wayut Dusun Melikan RT 34 RW 09")
    printHeader("Hobby")
    hobby("Memancing", "Memancing secara luas adalah suatu kegiatan menangkap ikan.", bahan = "Pancing, Serokan, Umpan, Wadah Ikan")
}

fun printHeader(title: String) {
    val border = "====".repeat(15)
    println("$border\n==== $title ====\n$border")
}

fun biodata(nama: String, kelas: String = "Teknologi Informasi 2A", alamat: String) {
    val biodata = "Nama = $nama\nKelas = $kelas\nAlamat = $alamat\n"
    print(biodata)
}

fun hobby(hobby: String, desc: String, bahan: String) {
    println("Hobby = $hobby")
    println("Deskripsi = $desc")
    println("Alat & Bahan = $bahan")
}
