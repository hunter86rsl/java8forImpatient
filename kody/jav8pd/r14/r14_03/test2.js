// Uruchom wpisuj¹c: jjs < r14/r14_03/test2.js

var fmt = java.text.NumberFormat.getPercentInstance()
var rate = 0.0725
fmt.format(rate)
// fmt.setMinimumFractionDigits(2)
fmt.minimumFractionDigits = 2
// fmt['minimumFractionDigits'] = 2
fmt.format(rate)

var list = new java.util.ArrayList
list.add('Piotr')
list.add('Pawe³')
list.add('Maria')
list.add(1)
list
list.remove(1)
list
list['remove(Object)'](1)
list