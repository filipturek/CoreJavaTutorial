# Section 3: Working with Text
## Strings
### Creating strings
`String car = "Mercedes"` is similar, but not the same as `String car = new String("Mercedes")`.
For the first one, it creates String object in a background and then assigns reference to that `"Mercedes"` String to our `car`.
Main difference is when we create another object which holds the same string.
Java recognises that both are the same and assigns the reference to the same memory allocation.
Therefore, when we create `String anotherCar = "Mercedes"` then `car` and `anotherCar` points to the same allocation memory and `car == anotherCar` comparison returns `true` - in opposite to keyword `new` which always creates new object and allocates memory for that.

### Upper and Lower casing
- `myString.toUpperCase()` returns content in upper case
- `myString.toLowerCase()` returns content in lower case

### Blank or Empty
- `myString.isEmpty()` returns `true` if string doesn't have any characters. Whitespace characters are also counted.
- `myString.isBlank()` returns `true` if string is empty or contains only whitespace characters.

### Replacing text within a string
- `myString.replace(...)` - replaces all occurrences of target string, it is case-sensitive
- `myString.replaceAll(...)` - replaces all occurrences of target regex
- `myString.replaceFirst(...)` - replaces first occurrence of target string, it is case-sensitive

### Removing leading and trailing white spaces
- `myString.split()` - removes all leading and trailing whitespaces
- `myString.splitLeading()` - removes all leading whitespaces
- `myString.splitTrailing()` - removes all trailing whitespaces
- `myString.splitIndent()` - removes all indents of a text block (multi-line string)
- `myString.trim()` - removes all leading and trailing whitespaces, older implementation

### Getting individual characters
- `myString.charAt(5)` - character at given index (starting from 0)

### Comparing String for Alphabetical order
- `firstString.compareTo(secondString)` - compares alphabetical order of two strings and returns an integer. If the integer is < 0 then `firstString` is before `secondString`. It is also case-sensitive.
- `firstString.compareToIgnoreCase(secondString)` - same as above, but is not case-sensitive.

### Determining if text is contained in a String
- `myString.contains(...)` - returns boolean with a result of a check if string contains a string passed as an argument

### String concatenation
- Concatenation by `+` is simple, but might not be efficient from a memory usage point of view
- `myString.concat(secondString)` - good to combine 2 strings together
- To combine more strings together much better is to build it with `StringBuilder` class
- Very similar implementation to `StringBuilder` is `StringBuffer`. `StringBuffer` is less efficient but is thread safety. For the vast majority of cases `StringBuilder` is what we need.
- `System.out.format("%s %s", text1, text2)` - allows us to concat strings to output, but close to `+` method of concatenation.
- `String.format("%s %s", text1, text2)` - as above but it creates a string instead of printing it.

### Length of a String
- `myString.length()` - returns no. of characters in a string

### Substrings
- `myString.substring(start, end)` - substring from _start_ index to _end_ index excluding character at index _end_. _end_ parameter is optional.

### Searching within a String
- `myString.indexOf(searchedText)` - returns index of first occurrence of searched string.
- `myString.indexOf(codenumber)` - returns index of first occurrence of character behind that code.
- `myString.lastIndexOf(...)` - the same as above but it looks starting from end of a String.
- `myString.indexOf(..., fromIndex)` - second parameter point starting point of searching.
- if searched string not found, method returns -1
- this searching is case-sensitive

### Splitting Strings