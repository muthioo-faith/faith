fun main(){
    output()
  var statement= sentense("Faith",20)
    println(statement)
    var y =mylength("akirachix")
    println(y)
    myname("faith")
}
fun output() {
    var school = "AkiraChix"
    var name = school[1].toString() + school[3] + school[4]
    println(name)
}
fun sentense(name:String,age:Int):String{
    var statement="Hi,my name is $name and i am $age years old"
    return statement

}
fun mylength(x:String):Int {
    var y = x.length
    return y
}
    fun myname( name:String){
        if(name.equals("faith")){
            println("Thats me")
        } else
            println("i dont know who that is")
    }