# Section 4: Regular Expressions
## Testing expressions
`myString.matches(regex)` - takes _regex_ to verify it string matches

## Simple expressions
### String literals
`myString.matches("cat")` - to check if we have exact match
### Square brackets
`myString.matches("[cC]at")` - square brackets allow us to put any characters we can accept. In this example "Cat" and "cat" will match
### Hyphen
`myString.matches("[a-fA-F]at")` - Hyphen `-` allow us to create a range of characters


