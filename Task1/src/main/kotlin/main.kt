data class Users(
    val name: String,
    val email: String,
    val gender: String,
    val age: Int,
    val company: String,
    val address: String,
    val role: String,
    val salary: Int
) {

}
//Getting user details:
fun getUser(): List<Users> {
    val userList: List<Users> = listOf<Users>(
        Users("John","john@gmail.com","male", 24, "google", "Chennai, Tamilnadu", "Developer", 40000),
        Users("Doe", "doe@yahoo.com", "male", 35, "yahoo", "Denmark, Canada ", "Tester", 30000),
        Users("Ajith", "ajith@gmail.com","male", 22, "zoho", "Chengalpattu, Tamilnadu", "QA", 25000),
        Users("Praveena", "john@praveena@gmail.com.com", "female", 22, "HTC", "Banglore, Karnataka", "Developer", 50000),
        Users("Jagdesh", "jagdesh@gmail.com", "male", 22, "HCL", "Hosur, Karnataka ", "Developer", 35000),
        Users("Naveen kumar", "naveen@gmail.com","male", 30, "TCS", "Taramani, Tamilnadu ", "Tester", 38000)
    )
    return userList
}
//Grouping:
fun groupingFun(value:Int): String? {
    val user=getUser()
    val choice:Int=value
    println("Choose 1 for group by Role \nChoose 2 for group by Gender")
    println("Your choice is ${choice}")

    when (choice){
        1->{
            println("Grouping by Role:")
//            val grpBy=user.groupBy { it.role }.forEach{ println("${it.key} -->${it.value}") }
//            return grpBy
            var setGrp = mutableSetOf<String>()
            for(i in user){
                setGrp.add(i.role)
            }
            for(role in setGrp) {
                print("${role} -->")
                for (i in user) {
                    if (i.role.lowercase().equals(role.lowercase())) {
                        println("${i}")
                    }
                }
                println("")
            }
        }
        2->{
            var setGrp = mutableSetOf<String>()
            for(i in user){
                setGrp.add(i.gender)
            }
            for(gender in setGrp) {
                print("${gender} -->")
                for (i in user) {
                    if (i.gender.lowercase().equals(gender.lowercase())) {
                        println("${i}")
                    }
                }
                println("")
            }
        }
        else-> {
            return ("invalid input")
        }
    }
    return null

}

//Sorting
fun sortingFun(value2:Int): Any {
    val user=getUser()
    val choice2:Int=value2
    println("Choose 1 for sort in ascending order \nChoose 2 for sort in descending order")
    println("Your choice is ${choice2}")
    when (choice2){
        1->{
            println("Sort user based on salary (ascending order):")
            val sortingBy=user.sortedBy { it.salary}
            val asc = sortingBy.forEach { println(it.name)}
                return asc
        }
        2->{
            println("Sort user based on salary (descending order):")
            val sortingBy=user.sortedByDescending { it.salary}
            val asc = sortingBy.forEach { println(it.name)}
            return asc
        }
        else-> {
            return ("invalid input")
        }
    }
}

//List of Salary
fun salaryList(){
    val user=getUser()
    println("All User Salary:")
    for (i in user){
        println("${i.name} --> ${i.salary}")
    }
}


//Get user using email id
fun getMail(mailId: String) {
    val user=getUser()
    val emailId =mailId
    for(i in user){
    if (emailId==i.email)
        println(i.name)
    }
}


//Sum of male user's salary
fun sumOfSalary(): Int {
    val user=getUser()
    var tSalary: Int=0
    val maleUserSalary=user.filter { it.gender =="male"}
    tSalary= maleUserSalary.sumOf { it.salary }
    return tSalary
    }

//Users in Location
fun userInLocation(address: String){
    val user=getUser()
    println("Location is: ${address}")
    var userInLoc= user.filter { it.address.contains(address) }
    for (i in userInLoc){
        println(i)
    }
}


fun main(args: Array<String>) {
    groupingFun(2)
    println("")
    println(sortingFun(2))
    println("")
    println("Users in Location:")
    userInLocation("Karnataka")
    println("")
    print("The total sum of Salary of all male users: ")
    println(sumOfSalary())
    println("")
    salaryList()
    println("")
    print("The email belongs to: ")
    println(getMail("doe@yahoo.com"))



}

