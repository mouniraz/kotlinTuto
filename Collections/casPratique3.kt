enum class  Couleur{
    TREFLE,COUEUR,CARREAU,PIQUE
}

class carte(val couleur:Couleur,val value:Int)
{
    override fun toString(): String {
        return "$couleur $value"
    }
}


fun main()
{


    var map= hashMapOf<Int,carte>(1 to carte(Couleur.COUEUR,1) , 2 to carte(Couleur.PIQUE,2),3 to carte(Couleur.PIQUE,3))
    println(map)
    map.put(4 ,carte(Couleur.COUEUR,4))
    map.put(5 ,carte(Couleur.PIQUE,3))
    map.remove(1)
    println(map)


}
