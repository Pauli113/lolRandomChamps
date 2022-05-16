import java.util.Scanner

fun main() {
    var champs = mutableListOf<String>()
    println("Toplane: y/n")
    var input = readLine()
    if (input.equals("y")) {
        val toplaner = Toplaner().champs.random()
        println("Toplane: $toplaner")
        champs.add(toplaner)
        println("Items:")
        Toplaner().list5Items()
    } else {
        println("No Toplane")
    }
    println("Jungle: y/n")
    input = readLine()
    if (input.equals("y")) {
        var jungler = Jungler().champs.random()
        if (champs.contains(jungler)) {
            jungler = Jungler().champs.random()
        }
        println("Jungler: $jungler")
        champs.add(jungler)
        println("Items:")
        Jungler().list5Items()
    } else {
        println("No jungle")
    }
    println("Midlane: y/n")
    input = readLine()
    if (input.equals("y")) {
        var midlaner = Midlaner().champs.random()
        if (champs.contains(midlaner)) {
            midlaner = Midlaner().champs.random()
        }
        println("Midlane: $midlaner")
        champs.add(midlaner)
        println("Items:")
        Midlaner().list5Items()
    } else {
        println("No midlane")
    }
    println("Adc: y/n")
    input = readLine()
    if (input.equals("y")) {
        var adc = Adc().champs.random()
        if (champs.contains(adc)) {
            adc = Adc().champs.random()
        }
        println("Adc: $adc")
        champs.add(adc)
        println("Items:")
        Adc().list5Items()
    } else {
        println("No adc")
    }
    println("Support: y/n")
    input = readLine()
    if(input.equals("y")) {
        var suppport = Support().champs.random()
        if (champs.contains(suppport)) {
            suppport = Support().champs.random()
        }
        println("Support: $suppport")
        champs.add(suppport)
        println("Items:")
        Support().list5Items()
    } else {
        println("No support")
    }
}


