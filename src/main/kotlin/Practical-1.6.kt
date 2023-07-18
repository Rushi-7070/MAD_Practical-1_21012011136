fun main(){
    print(add(5,4));
    print(sub(6,2));
    print(mult(8,2));
    print(div(10,2));
}
fun add(a:Int,b:Int):Int {
    var c = a + b;
    print("Addition is:")
    return c;

}
fun sub(a:Int,b:Int):Int {
    var c = a - b;
    print("\nSuntraction is:")
    return c;

}
fun mult(a:Int,b:Int):Int {
    var c = a * b;
    print("\nMultiplication is:")
    return c;

}
fun div(a:Int,b:Int):Int {
    var c = a / b;
    print("\nDivision is:")
    return c;

}