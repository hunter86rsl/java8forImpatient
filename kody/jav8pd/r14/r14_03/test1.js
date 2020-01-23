// Uruchom wpisuj¹c: jjs < r14/r14_03/test1.js

'Witaj, œwiecie'
'Witaj, œwiecie'.length
function silnia(n) { return n <= 1 ? 1 : n * silnia(n - 1) }
silnia(10)
var url = new java.net.URL('http://horstmann.com')
var input = new java.util.Scanner(url.openStream())
input.useDelimiter('$')
var contents = input.next()
contents