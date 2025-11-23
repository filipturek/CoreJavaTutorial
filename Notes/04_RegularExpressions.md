# Section 4: Regular Expressions
## Testing expressions
`myString.matches(regex)` - takes _regex_ to verify it string matches

## Simple expressions
### String literals
`myString.matches("cat")` - to check if we have exact match
### Square brackets
`myString.matches("[cC]at")` - square brackets allow us to put any characters we can accept. In this example "Cat" and "cat" will match. Square brackets symbols only one character. 
### Range
`myString.matches("[a-fA-F]at")` - Hyphen `-` allow us to create a range of characters
### Negation
`myString.matches("[^c-fC-F]at")` - Caret `^` negates regular expression from a bracket
### Word character
`myString.matches("\\wat")` - `\w` escape stands for any word letter (lower/upper case), digit 0-9 and underscore `_`. `\w` is not recognised by java syntax as regex are more general, and therefore it requires additional `\` to do an escape character for a backslash character.
### Digit character
`myString.matches("\\d")` - `\d` escape stands for any digit character.
### Quantifier
`myString.matches("\\d{4}")` - `{4}` quantifier tells how many characters should meet this criteria
### Space character
`myString.matches("\\d{3}[-.,\\s]\\d{3})"` - `\s` represents space character
### Plus symbol
`myString.matches("\\d{3}[-.,\\s]+\\d{3})"` - `+` represents one or more quantifier
### Asterisk symbol
`myString.matches("\\d{3}[-.,\\s]*\\d{3})"` - `*` represents zero or more quantifier
### Question mark
`myString.matches("\\d{3}[-.,\\s]?\\d{3})"` - `?` represents zero or one quantifier
### Range quantifier
`myString.matches("\\d{3}[-.,\\s]?\\d{2,4})"` - `{2,4}` represents min and max quantifier (2 to 4)
`myString.matches("\\d{3}[-.,\\s]?\\d{2,4})"` - `{2,}` represents min limit for quantifier (2 or more)
### Parenthesis () to group regex
`myString.matches("(\\d{3}[-.,\\s]?){2}\\d{2,4})"` - `(...){2}` groups pattern and allows to apply quantifier to fine the same sequence more than once




