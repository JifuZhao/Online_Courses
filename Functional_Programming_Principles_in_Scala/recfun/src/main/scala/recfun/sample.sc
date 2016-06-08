package recfun

object sample {
  
  var chars = "()".toList                         //> chars  : List[Char] = List((, ))

	def balance(chars: List[Char]): Boolean = {
  
	  def update(chars: List[Char], num: Int): Boolean = {
	    var tempNum = 0
	    
	    if (chars.isEmpty)
	      if (num == 0) true
	      else false
	    else {
	      if (chars.head == '(') tempNum = num + 1
	      else if (chars.head == ')') tempNum = num - 1
	      else tempNum = num
	      
	      if (tempNum >= 0) update(chars.tail, tempNum)
	      else false
	      }
	  }
	  
	  update(chars, 0)

	}                                         //> balance: (chars: List[Char])Boolean
  
  balance(chars)                                  //> res0: Boolean = true
}