fun main(){
    print("Enter the number:");
    var a= readLine()!!.toInt();
    var OddEven= if(a % 2==0) {
        print("Number is Even")
    }
    else{
        print("Number is Odd")
    }
}