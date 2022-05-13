fun main(){
    val game = lol()
    var champs = mutableListOf<String>()
    var toplaner = game.topLaners.random()
    println("Toplane: $toplaner")
    champs.add(toplaner)
    var jungler = game.junglers.random()
    if(champs.contains(jungler)){
        jungler = game.junglers.random()
    }
    println("Jungler: $jungler")
    champs.add(jungler)
    var midlane = game.midLaners.random()
    if(champs.contains(midlane)){
        midlane = game.midLaners.random()
    }
    println("Midlane: $midlane")
    champs.add(midlane)
    var adc = game.adc.random()
    if(champs.contains(adc)){
        adc = game.adc.random()
    }
    println("Adc: $adc")
    champs.add(adc)
    var suppport = game.support.random()
    if(champs.contains(suppport)){
        suppport = game.support.random()
    }
    println("Support: $suppport")
    champs.add(suppport)

}