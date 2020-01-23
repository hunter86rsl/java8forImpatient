// Uruchom wpisuj¹c: jjs < r14/r14_03/test8.js

var square = function(x) { return x * x}
   // Prawa strona to funkcja anonimowa
var result = square(2) 
   // Operator () wywo³uje funkcjê
result

var words = Java.to('Mary had a little lamb'.split(' '), Java.type('java.lang.String[]'))
java.util.Arrays.sort(words, function(a, b) { return java.lang.Integer.compare(a.length, b.length) })
java.util.Arrays.toString(words)

java.util.Arrays.sort(words, function(a, b) java.lang.Integer.compare(b.length, a.length))
java.util.Arrays.toString(words)