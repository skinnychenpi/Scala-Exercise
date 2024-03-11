object Solution {
  /*
  * LeetCode 2129
  * */
  def capitalizeTitle(title: String): String = {
    val splitted : Array[String] = title.split(" ")
    var ans : String = ""
    var count = 0
    for (word <- splitted) {
      if (count != 0) {
        ans += " "
      }
      var newWord :String = word.toLowerCase()
      if (word.length <= 2) {
        ans += newWord
      } else {
        ans += newWord.capitalize
      }
      count += 1
    }
    ans
  }
}