// Uruchom wpisuj¹c: jjs -scripting r14/r14_04/test1.js
// (tylko na Linux/Unix/Mac OS X)

var output = `ls -al`

print(output)

var output2 = $EXEC('grep -v java', `ls -al`)

print(output2)