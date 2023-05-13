class P18{
    def slice[T](start:Int,end:Int,lst:List[T]):List[T]=lst.drop(start).dropRight(end-start)
}

object P18{
    def main(args:Array[String]):Unit={
        val p18=new P18
        println(p18.slice(3,7,List("a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k")))
    }
}