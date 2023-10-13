//Anda menyetir terlalu cepat, dan seorang polisi menghentikan anda. tulis kode program komputer untuk menghitung hasilnya dalam bilangan bulat. 0=tidak ditilang, 1 = tilang kecil, 2 = tilang besar. Jika kecepatan lebih kecil atau sama dengan 60, maka hasilnya adalah 0 (tidak ditilang). Jika kecepatan mengemudi adalah di antara 61 dan 80, maka hasilnya 1. Jika kecepatan lebih dari 80 maka hasilnya 2. Kecuali jika hari ini adalah hari ulang tahun anda, batas tilang Anda adalah 5 satuan lebih cepat dari biasanya.
//caught_speeding(60, False) → 0
//caught_speeding(65, False) → 1
//caught_speeding(65, True) → 0

fun caught_speeding (speed: Int, isBirthday: Boolean) : int {
    val maxSpeed = if (isBirthday) speed + 5 else speed

    if (maxSpeed <= 60){
        return 0
    }else if (maxSpeed in 61..80){
        return 1
    }else{
        return 2
    }
}

fun main (){
    println(caught_speeding(60,false))
    println(caught_speeding(65,false))
    println(caught_speeding(65,true))
}