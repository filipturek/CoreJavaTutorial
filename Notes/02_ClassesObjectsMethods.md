# Section 2: Classes, Objects & Methods
## Top-Level Classes
### Basic class syntax:

```java
class MyCLass {
    //body of class...
}
```

### Naming convention:
- PascalCase convention
- nouns
- Name can start from letters and (but highly not recommended) `_`, `$` characters

### Access modifiers:
Top‑level classes can use only two _access modifiers_:
- `public` - visible to all classes (from any package)
- _no modifier_ (also called **package-protected**) - visible only to classes in the same package.

> **Multiple classes in one `.java` file**
> 
> A single `.java` source file can declare multiple top‑level classes; however, **only one of them may be declared** `public`.
> The file name must exactly match the name of that `public` class.

## Methods:
In Java, methods are kind of like functions in other languages, but methods in Java cannot exist without class, as it is object-oriented language.

### Declaration:
`void sayHello() { ... }` - minimum method declaration has only return type and a name

#### Parameters:
`void saySomething(String message) { ... }` - _String message_ is a parameter of a method. 
When that method is called, like `saySomething("Here is my message")` then _"Here is my message"_ is referred as argument of a method.

Method may have 0 or more parameters, of different types, as an input for that method. Parameters are comma-separated.

#### _vararg_ parameters:
`public void doSomething(String... words) {}` - `String...` enables user to put variable number of arguments to a method, comma separated.
**Note!** vararg parameter ahs to be a last of parameters in a method.

#### Return type:
`public char getMiddleInitial() { ... }` - return type is set to `char`.
If method doesn't return anything, return type is set to `void`. Then method doesn't require statement with `return` keyword.
If return type is provided, then method always has to have `return` statement.

Method can have only 1 return type.

### Naming convention:
- camelCase convention
- has to end with parenthesis, at least empty, followed by curly braces with block of statements
- should have a verb like _do, get, set, is..._
- Name can start from letters and (but highly not recommended) `_`, `$` characters

### Access modifiers:
TODO:

### _Static_ attribute:
Method which is not bind to an instance of a class (object), but to a class and can be called even if object hasn't been created.
Static methods can refer only to fields of a class, which are also static.

### _main()_ method:
`public static void main(String[] args) { ... }`

Intellij IDE shortcut for that is `psvm`.

Parameter of that method is array of Strings. You can pass any number of arguments while starting application, like running in command line
`java -cp path/to/build ClassName arg1 arg2 arg3 arg4`

## Variables:

Java - statically typed language - it means that datatype has to be always defined for variable.

**Variable detatypes:**
- Primitive datatypes
- Reference datatypes

### Primitive datatypes:

| Type      |  Size (bits)  | Value range                                     |
|:----------|:-------------:|:------------------------------------------------|
| `byte`    |       8       | –128 to 127                                     |
| `short`   |      16       | –32 768 to 32 767                               |
| `int`     |      32       | –2³¹ to 2³¹ – 1                                 |
| `long`    |      64       | –2⁶³ to 2⁶³ – 1                                 |
| `float`   |      32       | approx. ± 3.4 × 10³⁸ (≈ 6–7 significant digits) |
| `double`  |      64       | approx. ± 1.8 × 10³⁰⁸ (≈ 15 significant digits) |
| `char`    |      16       | '\u0000' (0) to '\uffff' (65 535)               |
| `boolean` | JVM‑dependent | `true` or `false`                               |

### Naming convention:
- camelCase convention for variables
- UPPERCASE convention for constants (final)

### _var_ datatype
Local variable can be defined by _var_ type and Java will resolve it during build to correct datatype.

### _Static_ attribute:
Field which is not bind to an instance of a class (object), but to a class.


### Arrays
Simple collection /list/ of defined datatype.

**Declaration with initialization:** `int[] nums = {1, 2, 3, 4, 5}` - comma separated elements within curly brackets,
or **only declaration:**`String[] names = new String[3];` - empty array with predefined size

`myArray.length` - size of array

Array has to have predefined size during declaration. Java doesn't allow to change size once it is declared.
_ArrayList_ collection might be used when dynamic array size is needed.



## Flow control

### Loops

### Conditional statements