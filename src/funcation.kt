fun checkNameInList(name: String, nameList: List<String>): Boolean {
    return name in nameList
}

fun main() {
    val nameList = listOf("Muhammad Ali", "Sarah Johnson", "David Smith", "Lisa Davis", "Michael Brown", "Emily Wilson", "Daniel Lee", "Jessica Martinez", "William Taylor", "Olivia Anderson")

    val nameToCheck = "Sarah Johnson"

    if (checkNameInList(nameToCheck, nameList)) {
        println("$nameToCheck Njirr dia ada di list")
    } else {
        println("$nameToCheck Eh kok ada ilang mana njir")
    }
}
