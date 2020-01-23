// Uruchom wpisuj¹c: jjs < r14/r14_03/test6.js

var intArray = Java.type('int[]')
var StringArray = Java.type('java.lang.String[]')

var numbers = new intArray(10) // Tablica int[] 
var names = new StringArray(10) // Tablica referencji do String 

numbers[0] = 42
print(numbers[0])
names[0] = 'Fred'

for each (var elem in numbers) print(elem)

for (var i in names) print(i + ": " + names[i])

names = []
names[0] = 'Fred'
names[2] = 'Barney'
for (var i in names) print(i)

java.util.Arrays.toString(names) // B³¹d
var javaNames = Java.to(names, StringArray)
java.util.Arrays.toString(javaNames) // Ok

var jsNumbers = Java.from(numbers)
jsNumbers[-1] = 42
print(jsNumbers[-1] + " " + jsNumbers[0] + " " + jsNumbers[1])