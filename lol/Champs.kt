abstract class Champs {
    abstract val champs:List<String>
    abstract val items:List<String>
    abstract val boots:List<String>
    abstract val mythicItems:List<String>
    fun list5Items(){
        var itemList = mutableListOf<String>()
        var i = 0
        while(i<5){
            var itemToAdd = items.random()
            if(!itemList.contains(itemToAdd)){
                itemList.add(itemToAdd)
            } else{
                itemToAdd = items.random()
                itemList.add(itemToAdd)
            }

            i++
        }
        val mythicItem = mythicItems.random()
        itemList.add(mythicItem)
        val boots = boots.random()
        itemList.add(boots)
        for(item in itemList){
            println(item)
        }
    }
}