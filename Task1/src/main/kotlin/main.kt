
class Users(val name:String,
                val email:String,
                val gender:String,
                val age: Int,
                val company:String,
                val address:String,
                val role:String,
                val salary:Int
){

}

fun userDetail():List<Users>{
    var userList:List<Users> = listOf<Users>(
        Users("John", "john@gmail.com","male",24,"google","Chennai, Tamilnadu","Developer",40000),
        Users("Doe","doe@yahoo.com","male",35,"yahoo","Denmark, Canada","Tester",30000),
        Users("Ajith","ajith@gmail.com","male",22,"zoho","Chengalpattu, Tamilnadu","QA", 25000),
        Users("Praveena","praveena@gmail.com","female",22,"HTC","Banglore, Karnataka","Developer",50000),
        Users("Jagdesh","jagdesh@gmail.com","male",22,"HCL","Hosur, Karnataka","Developer",35000),
        Users("Naveen kumar","naveen@gmail.com","male",30,"TCS","Taramani, Tamilnadu","Tester",38000))
    return userList
}
fun salary(){

}





fun main(args: Array<String>) {
    println("Hello World!")
var details = userDetail()
    for(i in details) {
        println(i)
    }
    }

