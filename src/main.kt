fun main() {

//   // println(N)

    var result=Numbers(5,2)
    println(result)
    var state=Id("virginia",24)
var C=cars("nissan")
    println(C.length)
}




//fun getName(name:Int){
   // var N="codeHive"
    //println(name.indexOf(name[5]+name[6]+ (name[7].toInt()))

//}
fun Numbers(num:Int,num1:Int):Int{
    var num1=5
    var num=2
    var modulus=num1%num
    return modulus

}
fun Id(name:String,age:Int){
    var z=age
    var p="name"
    var state="hi my name is $p and I am $z years old"
    println(state)
}
fun cars(car:String):String{
    var name=car
    return name


}