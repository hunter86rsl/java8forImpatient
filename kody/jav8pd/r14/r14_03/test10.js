// Uruchom wpisuj¹c: jjs r14/r14_03/test10.js
// (bez przekierowania)

list = new java.util.ArrayList()
try {
   var first = list.get(0)
   print(first)
} catch (e) {
   if (e instanceof java.lang.IndexOutOfBoundsException)
      print('list is empty')     
}