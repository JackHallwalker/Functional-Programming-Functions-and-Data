class Rational(x : Int,y : Int){
  def numer : Int = x
  def denom: Int = y
  def neg: Rational = new Rational(numer*(-1),denom)
  /*def simp_f(a: Int,b: Int): Unit ={
    var nume : Int = a
    var deno : Int = b
    if (nume>=deno){
      sim_f1(nume,deno)
    }
    else {
      sim_f2(deno,nume)
    }

  }
  def sim_f2(c : Int, d: Int, i : Int = 2): Unit ={
    if ((c%i==0)&&(d%i==0)){
      sim_f1(c/i,c/d,i=i+1)
    }
    else if (i==d+1){
      d
    }
    else{
      sim_f1(c,d,i=i+1)
    }
  }
  def sim_f1(c : Int, d: Int, i : Int = 2): Unit ={
    if ((c%i==0)&&(d%i==0)){
      sim_f1(c/i,c/d,i=i+1)
    }
    else if (i==d+1){
      c.toInt
    }
    else{
      sim_f1(c,d,i=i+1)
    }
  }*/
  //def sim: Rational = new Rational(simp_f(numer,denom),denom/(numer/(simp_f(numer,denom))))
  def -(r : Rational) = new Rational((this.numer*r.denom)-(this.denom*r.numer),this.denom*r.denom)
  def +(r : Rational) = new Rational((this.numer*r.denom)+(this.denom*r.numer),this.denom*r.denom)

  def Print : String = numer.toString + "/" + denom.toString

}

var x = new Rational(1,2)
var y = new  Rational(3,2)
println(x.numer)
println(x.denom)
println(x.Print)
println(x.neg.Print)
println((x-y).Print)