open class Triangle(_name: String) : Shape(_name) {
    private var sideOne: Double = 0.0
    private var sideTwo: Double = 0.0
    private var sideThree: Double = 0.0

    fun setDimensions(sideOne: Double, sideTwo: Double, sideThree: Double) {
        this.sideOne = sideOne
        this.sideTwo = sideTwo
        this.sideThree = sideThree
    }

    override fun printDimensions() {
        println("Triangle sides - Side One: $sideOne, Side Two: $sideTwo, Side Three: $sideThree")
    }

    override fun getArea(): Double {
        val s = (sideOne + sideTwo + sideThree) / 2
        return Math.sqrt(s * (s - sideOne) * (s - sideTwo) * (s - sideThree))
    }
}
