## IntelliJ and GH
### Connect IntelliJ to GitHub (on Mac):
Preferences → Version Control → Github → connect to your GH account /!\ do not create a repo with a README file.
### Commit and push code to GH on IntelliJ:
Git → Commit → tick files you want to commit and add a message → Commit and Push
When working on a file you have the choice between adding extends App to the main function or write a main method. You shouldn’t do both.
## Tuples
In Scala, a tuple is a value that contains a fixed number of elements, each with its own type. Tuples are immutable. They are especially handy for returning multiple values from a method.
For example:
```
val tuple3: (String, Int, Boolean) = ("Jinesh", 34, true) 
val name = tuple3._2 println(name) 
// prints 34, the 2nd value of tuple3
```

## Case classes
They are regular classes which are immutable by default and decomposable through pattern matching.
It uses equal method to compare instance structurally. It does not use new keyword to instantiate object. All the parameters listed in the case class are public and immutable by default.
A class can extend another class, whereas a case class can not extend another case class (because it would not be possible to correctly implement their equality).

## Packages
We use them to organise the code better.

## Data types
It’s best practice to assign a type to a variable when creating one.

| Data types | Data |
| --- | --- |
| Boolean | true or false |
| Byte | 8 bit signed value. Range from -128 to 127 |
|Short|16 bit signed value. Range -32768 to 32767|
|Char|16 bit unsigned Unicode character. Range from U+0000 to U+FFFF|
|Int|32 bit signed value. Range -2147483648 to 2147483647|
|Long|64 bit signed value. -9223372036854775808 to 9223372036854775807|
|Float|32 bit IEEE 754 single-precision float|
|Double|64 bit IEEE 754 double-precision float|
|String|A sequence of Chars|

There are also some special data types:

| Data types | Data |
| --- | --- |
| Unit | List all new or modified files |
| Null | Show file differences that haven't been staged |
|Nothing|subtype of every other type; includes no values|
|Any|the supertype of any type; any object is of type Any|
|AnyRef|the supertype of any reference type|

## IF … ELSE statement
To check if a hard coded number is even or odd:
```
var number:Int = 31
  if(number%2==0){
    println("even")
  } else {
    println("odd")
  }
```

To check if the user’s input number is even or odd:
```
var input = scala.io.StdIn.readInt()
if (input % 2 == 0) {
  println("even")
} else {
  println("odd")
}
```

## Pattern matching
We use pattern matching to check a value against a pattern. The match expression will have a value, the match keyword, and at least one case clause.
```
object MatchNumbers extends App {
// extends App so that not all the code is considered as a main function
  var a:Any = "tru"
  a match {
    case 2 => println("one")
    case "fam" => println("two")
    case 1.2 => println("one point two")
    case true => println("line")
    case _ => println("no")
  }
}
```
In the example above, we used the type `Any` so that we can mix up the data types.

## Loops
### do… while
```
do{
  println(a)
  a+=2
}while(a<=20)
```

### while
```
var a = 10
while(a <= 20){
  println(a)
  a = a+2
}
```

### for
```
object ForLoops extends App {
  for(a<- 1 to 20) {
    println(a)
  }

  for(a<- 1 until 50) // using "until" instead of "to" excludes the last value (here 50)
    {
      println(a)
    }
}
```
We can also use `by` to avoid some values:
```
for(i<- 1 to 20 by 2) {
  print(i) //prints 135791113151719
}
```

### yield
For each iteration of a `for` loop, `yield` generates a value which will be remembered. It's like the`for` loop has a buffer you can’t see, and for each iteration of your `for` loop another item is added to that buffer. When the `for` loop finishes running, it will return this collection of all the yielded values. The type of the collection that is returned is the same type that was iterating over, so a `Map` yields a `Map`, a `List` yields a `List`, and so on.
Also, note that the initial collection is not changed; the for/yield construct creates a new collection according to the algorithm you specify.
```
var result = for(a<-1 to 10) yield a
for(i<- result){
  println(i)
}
```

## Lists
There are different ways to write a list:
```
object BasicList extends App {
  var listOfNumbers = List(1,2,3,4,5,6,7,8,9)
  BasicList.listOfNumbers.foreach{
    println
  }
// prints
// 1
// 2
// 3
// 4
// 5
// 6
// 7
// 8
// 9

  listOfNumbers.foreach(print)
  println 
  // prints 123456789
  
  listOfNumbers.foreach((eler:Int)=>print(eler+" ")) 
  // prints 1 2 3 4 5 6 7 8 9
}
```
