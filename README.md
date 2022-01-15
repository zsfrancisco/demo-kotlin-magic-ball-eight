# demo-kotlin-magic-ball-eight

Project used to study and learn Kotlin in a little project of magic ball 8

You can read the following theory

# Some Kotlin theory

## Generalities

Not only used on Android

Back-end development.
Natively - can run on windows for example
script
Multiplatform – it differs in Flutter when it compiles the code in a library and that library remains native for android and IOS

Arises from the need for Java

You can migrate from java to kotlin little by little.

## java virtual machine

It simulates the processes that occur within an operating system.
It helps manage pointers and memory references using a process called garbage collection, which it does is check what reference is not being used to eliminate it.
It works as an intermediate point between our code and what the OS understands, JVM passes our code depending on the OS so that it understands the language called Java Bytecode.
Kotlin → Bytecode

##folders

### gradle

allows you to manage dependencies and manage the project

### Build

Contains the code compiled by gradle

### src

The code is found, the main.kt file is the entry point for the application

### build.gradle.kts

Dependency configuration, version information

### gradle.properties

Properties

## variables

var → read-write variable
val → read only variable, constants can also be used, but these are used outside the function and before val → const val PI = 3.1416

### Types

boolean
Long → long number → 30000000000000000 or 3L
Double
Float → 1.1f

## Kotlin and functional programming

Imperative paradigm → is based on modifying the state of your program by modifying states within it. It focuses on describing how a program works.

Functional → declarative paradigm, helps describe what a program does and not how it does it.

Never mutable always immutable → you want a variable to maintain its state over time

Functions are objects.

Use pure functions → receive the same parameters and return the same result, plus they are not modified by the external environment

## Null-Safety

If we have a boolean, we have two values, true or false, but there can also be a third value → null

The origin of the three-valued boolean often lives in code written in Java, in server response, and in code with bad practices.

Kotlin gives us tools that tell us that a variable can be null.

To declare a variable as possible null

var name: String? = “Anthony”

### safe calls

They are a language tool that help us to execute a code when a variable of type nullable is not null, for example:

println(name?.length())

### double bang

This operator is indicated by exclamation marks !!, this tells the compiler that you know that at this point the variable cannot be null, but it should be used sparingly, because it is bad practice.

### Interoperability with Java

You can see code where some weird variable type is found somewhere, for example, Integer!, this means that Kotlin can't tell if it's nullable or not, so what one should do in that case is convert that data type to nullable.

This type of error is called a null pointer exception.

### elvis-operator

Allows to return a value when an element is null using ?:
val name: String? =null
val charactersOfName: Int = name?.length ?: 0
println("charactersOfName is $charactersOfName")

## lists

They belong to the collections
they can be of two types
mutable
immutable

Is Kotlin better to use lists than arrays for performance

## maps

Key-value data structure
mapOf → immutable maps
map

To access some value of it, it is done by the key

## Set

They cannot have repeated elements, only the first one will be taken into account

## Function

Code that is executed every time we call it

### Syntax

Start with the reserved word fun
Function name
Parameters
return type
Code

If we don't want to return anything, we must specify that the function returns Unit but it is redundant

### extension functions

They allow you to extend the behavior of the type you have, for example String, and use them as if they were phrases or String in the type

## lambdas

They are anonymous functions, they are not declared but are passed immediately as an expression

## High order functions

Higher-order functions are functions that can receive other functions as parameters and/or return them as results.

We will see a series of very simple examples to see how Kotlin implements the concept of higher order functions and as we progress through the course we will be able to see the advantages of this paradigm.

## let

Scope function allows to do operation in a more dynamic and concise way

The let function is a function that creates a temporary scope for an object inside a block of code.

This means that you can refer to the object without using its name since it is the parameter of the lambda function passed to let.

inline fun <T, R> T.let(block: (T) -> R): R

## With

The with function helps us to directly access the properties of the variable or the variable itself using this

## Run

Execute a series of operations after declaring a variable, at the end the this must be returned

## Apply

It allows performing operations on a variable and then returning a value, in this case the this is not returned because it is not necessary because the apply function returns it automatically and can be combined with a saveCast function to avoid nullPointerExecptions

## also

Allows you to get a variable, then execute that variable and return it as a parameter so that it can be used later
