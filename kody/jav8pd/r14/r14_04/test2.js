// Uruchom wpisuj¹c: jjs -scripting r14/r14_04/test2.js
// (tylko na Linux/Unix/Mac OS X)

classpath=`pwd`
mainclass='Hello'
`rm ${mainclass.class}`
var cmd = "javac -classpath ${classpath} ${mainclass}.java"
print(cmd)
var output = $EXEC(cmd)
print(output)
var message = "Jest godzina ${java.time.Instant.now()}"
print(message)
message = 'Jest godzina ${java.time.Instant.now()}'
print(message)

name='myapp'
dir='/opt/apps/myapp'
// Using cat instead of asadmin
output = $EXEC("cat", <<END)
start-domain
start-database
deploy ${name} ${dir}
exit
END
print(output)