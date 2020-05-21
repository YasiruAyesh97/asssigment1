object Q1{
  def main(args:Array[String]){
    println (temperatureConvert(35))
    println(volumeOfSphere(5))
    println(wholesaleCost(60))
  }
  def temperatureConvert(c:Double) :Double = c*1.8 + 32
  def volumeOfSphere(r:Double) : Double = (4/3) * math.Pi * math.pow(r,3)

  def wholesaleCost(copy : Double) : Double = {
    val coverPrice :Double = 24.95
    val discount :Double = coverPrice * (40/100)
    val shippingCosts :Double = if(copy<=50) 3 else 3 + (copy-50)*0.75
    val wholesaleCost :Double = shippingCosts + (coverPrice - discount)*copy
    wholesaleCost
  }
}
