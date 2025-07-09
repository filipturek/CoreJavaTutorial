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