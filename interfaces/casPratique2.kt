interface  behavior
{
    fun voice()
    fun eat()
}
open class Animal(var name:String)
{
    override fun toString(): String {
        return name
    }
}
abstract class Carnivore(name: String):Animal(name),behavior
{
    override fun eat() {
     println("eating chair ")
    }
}
class Chien(name:String,var famille:String):Carnivore(name) {
    override fun voice() {
        println("woof")
    }

    override fun toString(): String {
        return super<Carnivore>.toString()+ " $famille"
    }
}


fun main()
{
    val d=Chien("viola","caniche")
    println(d)
}
