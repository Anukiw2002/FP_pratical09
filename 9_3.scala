object NameFormatter {

  def toUpper(str: String): String = str.toUpperCase()

  def toLower(str: String): String = str.toLowerCase()

  def formatNames(name: String)(formatFunc: String => String): String = {
    formatFunc(name)
  }

  def main(args: Array[String]): Unit = {
    val name1 = formatNames("Benny")(toUpper)
    val name2 = formatNames("Niroshan")(name => {
      val firstPart = name.substring(0, 2).toUpperCase()
      val secondPart = name.substring(2).toLowerCase()
      firstPart + secondPart
    })
    val name3 = formatNames("Saman")(toLower)
    val name4 = formatNames("Kumara")(name => {
      val firstPart = name.substring(0, 1).toUpperCase()
      val lastPart = name.substring(name.length - 1).toUpperCase()
      val middlePart = name.substring(1, name.length - 1).toLowerCase()
      firstPart + middlePart + lastPart
    })

    println(name1)  
    println(name2) 
    println(name3) 
    println(name4) 
  }
}
