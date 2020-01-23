// Uruchom wpisuj¹c: jjs < r14/r14_03/test3.js

var javaNetPackage = java.net // Obiekt JavaPackage 
var URL = java.net.URL // Obiekt JavaClass
var JMath = Java.type('java.lang.Math') // Pozwala unikn¹æ konfliktu z obiketem Math JavaScript
JMath.floorMod(-3, 10)

var Url = java.net.Url // Literówka
Url // Nonexistent package
Url = Java.type('java.net.Url') // B³¹d z powodu literówki

var url = new URL('http://horstmann.com')
url = new java.net.URL('http://horstmann.com')
url = new (Java.type('java.net.URL'))('http://horstmann.com')

var entry = new java.util.AbstractMap.SimpleEntry('hello', 42)
entry
var Entry = Java.type('java.util.AbstractMap$SimpleEntry')
new Entry('hello', 42)