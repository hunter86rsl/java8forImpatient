#!/data/apps/jdk1.8.0/bin/jjs

// Zmie� �cie�k� powy�ej na poprawn� na Twoim komputerze a nast�pnie wykonaj
// chmod +x r14/r14_04/test3.js
// r14/r14_04/test3.js -- Fred

if (!arguments[0]) {
    print("U�ycie: test3 nazwaU�ytkownika")
    exit(1)
}

var javaHome = $ENV.JAVA_HOME
print(javaHome)
print("Witaj ${$ARG[0]}, wprowad� ponownie nazw� u�ytkownika ")
var username = readLine('U�ytkownik: ')
var password = java.lang.System.console().readPassword("${username}, podaj has�o: ")
print(new java.lang.String(password).replaceAll('.', '*'))