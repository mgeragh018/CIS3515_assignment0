class EquilateralTriangle(_name: String) : Triangle(_name) {
    private var lengthSide: Double = 0.0

    fun setDimensions(lengthSide: Double) {
        this.lengthSide = lengthSide
    }

    override fun printDimensions() {
        println("Equilateral Triangle sides - All sides: $lengthSide")
    }

    override fun getArea(): Double {
        return (Math.sqrt(3.0) / 4) * lengthSide * lengthSide
    }

}
