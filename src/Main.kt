//Michael Geraghty
//Assignment 0
//9/08/24 CIS3515
//The purpose of this assignment  is to become familiar with inheritence,
//interfaces, encapsulation, and polymorphism in Kotlin.

fun main() {
    // Input for Square
    println("Enter the length and height of the square:")
    print("Length: ")
    val squareLength = readLine()?.toDoubleOrNull() ?: 0.0
    print("Height: ")
    val squareHeight = readLine()?.toDoubleOrNull() ?: 0.0
    val square = Square("Square")
    square.setDimensions(squareLength, squareHeight)
    square.printDimensions()
    println("Square area: ${square.getArea()}")

    // Input for Circle
    println("\nEnter the radius of the circle:")
    print("Radius: ")
    val circleRadius = readLine()?.toDoubleOrNull() ?: 0.0
    val circle = Circle("Circle")
    circle.setDimensions(circleRadius)
    circle.printDimensions()
    println("Circle area: ${circle.getArea()}")

    // Input for Triangle
    println("\nEnter the three sides of the triangle:")
    print("Side 1: ")
    val sideOne = readLine()?.toDoubleOrNull() ?: 0.0
    print("Side 2: ")
    val sideTwo = readLine()?.toDoubleOrNull() ?: 0.0
    print("Side 3: ")
    val sideThree = readLine()?.toDoubleOrNull() ?: 0.0
    val triangle = Triangle("Triangle")
    triangle.setDimensions(sideOne, sideTwo, sideThree)
    triangle.printDimensions()
    println("Triangle area: ${triangle.getArea()}")

    // Input for Equilateral Triangle
    println("\nEnter the side length of the equilateral triangle:")
    print("Side length: ")
    val equilateralSide = readLine()?.toDoubleOrNull() ?: 0.0
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")
    equilateralTriangle.setDimensions(equilateralSide)
    equilateralTriangle.printDimensions()
    println("Equilateral Triangle area: ${equilateralTriangle.getArea()}")
}

