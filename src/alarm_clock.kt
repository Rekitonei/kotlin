fun alarmClock(day: Int, vacation: Boolean): String {
    val weekDay = day !in listOf(0, 6)
    if (vacation) {
        return if (weekDay) "10:00" else "off"
    }
    return if (weekDay) "7:00" else "10:00"
}



fun main(){
    println(alarmClock(1, false))  // untuk output pukul: 7:00
    println(alarmClock(5, false))  // untuk output pukul: 7:00
    println(alarmClock(0, false))  // untuk output pukul: 10:00
    println(alarmClock(1, true))   // untuk output pukul: 10:00
}