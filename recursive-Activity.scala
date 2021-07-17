object OneTwo{
	def main(args:Array[String]){}
	def gcd(n:Int,m:Int): Int= m match {
		case 0 => n
		case m if m>n => gcd(m,n)
		case _ => gcd(m,n%m)
	}

	def prime(p:Int,x:Int=2): Boolean = x match {
		case x if p==x => true
		case x if(gcd(p,x)>1) => false
		case _ => prime(p,x+1)
	}

	println(prime(5))
	println(prime(8))

	def primeseq(n:Int): Unit = n match {
		case n if prime(n)==true && n>0 => println(n) ; primeseq(n-1)
		case _ if n>0 => primeseq(n-1)
	} 

	primeseq(10)
}

object Three{
	def main(args:Array[String]){}
	def sum(n:Int): Int = n match{
		case 1=>1
		case _ => n + sum(n-1)
	}
	print(sum(5))
}

object Four{
	def main(args:Array[String]){}
	def iseven(n:Int): Boolean = n match {
		case 0 => true
		case _ => isodd(n-1)
	}
	def isodd(n:Int): Boolean = !(iseven(n))
	println(iseven(6))
	println(isodd(6))
}

object Five{
	def main(args:Array[String]){}
	def iseven(n:Int): Boolean = n match {
		case 0 => true
		case _ => isodd(n-1)
	}
	def isodd(n:Int): Boolean = !(iseven(n))
	
	def evensum(n:Int): Int = n match{
		case n if n<=0=>0
		case n if iseven(n)==true => (n-2) + evensum(n-3)
		case n if iseven(n)==false => (n-1) + evensum(n-2)	
	}
	println(evensum(2))
	println(evensum(0))
	println(evensum(3))
	println(evensum(5))
	println(evensum(8))
}

object Six{
	def main(args:Array[String]){}
	def fibonacci(n:Int): Int = n match{
		case 0=> 0
		case 1=> 1
		case _ => fibonacci(n-1)+fibonacci(n-2)
	}
	def fibonacciseq(n:Int): Any = {
		if(n>0)fibonacciseq(n-1)
		println(fibonacci(n))
	}
	println(fibonacciseq(4))
}
