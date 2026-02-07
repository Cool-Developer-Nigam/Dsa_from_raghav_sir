import static java.lang.IO.print;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    IO.println(String.format("Hello and welcome!"));
print(123);
    for (int i = 1; i <= 5; i++) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        IO.println("i = " + i);
    }
}

//It sounds like you’ve been looking at the new **Unnamed Classes and Instance Main Methods** feature! This was introduced as a preview in Java 21 and refined in subsequent versions to make Java feel less "heavy" for beginners and simple scripts.
//
//Here is the breakdown of why these changes happened and how the "New Java" differs from the "Old Java."
//
//---
//
//## 1. No More Class Boilerplate
//
//Previously, Java forced you to wrap every single piece of code in a `class`. In newer editions (starting as a preview in Java 21), you can simply write your methods at the top level of a file.
//
//* **Old Way:** You had to write `public class Main { ... }`.
//* **New Way:** You just start writing `void main() { ... }`.
//
//Behind the scenes, the Java compiler still treats this as a class, but you don't have to see it or type it. It makes the entry barrier much lower.
//
//## 2. `IO.println` vs. `System.out.println`
//
//You mentioned `IO.println`. This is part of the **Implicitly Imported Classes**.
//
//* **`System.out.println` (sout):** This is the classic way. It accesses the `out` static field of the `System` class.
//* **`IO.println`:** In these new "unnamed" classes, Java automatically imports a set of helpful methods for interaction. Instead of the long `System.out.println`, you can use the simplified `println` (often via a static import or the `IO` utility provided in recent preview features).
//
//---
//
//## 3. Why `String[] args` is no longer required
//
//In the past, the JVM looked for a very specific "signature": `public static void main(String[] args)`.
//
//The `String[] args` exists to catch command-line arguments (like if you ran `java MyFile hello`). However, **99% of beginners and simple scripts never use them.** * **Now:** The developers updated the launch protocol. If you don't need arguments, you don't have to define them. Java is now smart enough to look for `main()` without parameters if the one with parameters isn't there.
//
//## 4. Is the Main function not `static` anymore?
//
//Correct! You can now use an **Instance Main Method**.
//
//* **The Old Rule:** `main` had to be `static` because the JVM didn't want to "instantiate" (create) an object of your class just to start the program.
//* **The New Rule:** You can write `void main()`. Java will automatically create an instance of your unnamed class and run the method for you.
//
//| Feature | Old Java (Pre-21) | New Java (21+ Preview) |
//| --- | --- | --- |
//| **Class Declaration** | Mandatory | Optional (Unnamed) |
//| **Static Keyword** | Required | Optional |
//| **Access Modifier** | Must be `public` | Can be `void` (package-protected) |
//| **Parameters** | Must have `String[] args` | Optional |
//
//---
//
//### Why the change?
//
//The goal wasn't to change how "Big Enterprise Java" works, but to make Java a better "first language." It allows you to learn the logic of programming (loops, variables, conditions) without having to explain what `public`, `static`, and `String[] args` mean on day one.
//
//**Would you like me to show you how to set up your IDE or terminal to run these "Preview" features, since they aren't always enabled by default?**
