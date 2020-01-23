// Uruchom wpisuj¹c: jjs < r14/r14_03/test5.js

'Hello'.slice(-2.99)
var price = 9.95
java.lang.String.format('Cena: %.2f', price)
price = 10
java.lang.String.format('Cena: %.2f', price)
   // B³¹d: Format f nie jest poprawny dla java.lang.Integer
java.lang.String.format('Cena: %.2f', Number(price))