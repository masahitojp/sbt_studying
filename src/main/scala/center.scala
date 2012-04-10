object Utils {
  // like Groovy's String.center
  def center(str :String, num :Int):String = {
    if(str.length < num){
      val diff = num - str.length
      val temp = " " * (diff/2)
      val rtn = temp + str + temp + " " * (diff % 2)
      rtn
    }
    else{
      str
    }
  }
}
