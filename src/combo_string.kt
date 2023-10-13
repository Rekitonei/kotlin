//Diberikan dua buah string a dan b
//Kembalikan sebuah string dalam bentuk pendek+panjang+pendek, dengan string pendek berada di luar string panjang. String a dan b bisa jadi berbeda panjangnya, tapi bisa jadi juga kosong
//combo_string('Hello', 'hi') → 'hiHellohi'
//combo_string('hi', 'Hello') → 'hiHellohi'
//combo_string('aaa', 'b') → 'baaab'

fun combo_string (a: String, b: String): String{
    val shorter = if (a.length < b.length) a else b
    val longer = if (a.length < b.length) b else a

    return shorter + longer + shorter
}

fun main(){
    println(combo_string("Hello", "hi"))
    println(combo_string("hi", "Hello"))
    println(combo_string("aaa", "b"))
}