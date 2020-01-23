package r14.r14_02;

import java.io.StringWriter;

import javax.script.Bindings;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ScriptEngineDemo {
    public static void main(String[] args) throws ScriptException, NoSuchMethodException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("nashorn");
        String scriptString = "6 * 7";
        Object result = engine.eval(scriptString);
        System.out.println(result);
        
        engine.eval("n = 1728");
        result = engine.eval("n + 1");
        System.out.println(result);
        
        System.out.println(engine.getFactory().getParameter("THREADING"));
        
        engine.put("k", 1728);
        result = engine.eval("k + 1");
        System.out.println(result);
        engine.eval("n = 1728");
        result = engine.get("n");
        System.out.println(result);
        
        Bindings scope = engine.createBindings();
        scope.put("m", 1728);
        result = engine.eval("m + 1", scope);
        System.out.println(result);
        
        StringWriter writer = new StringWriter();
        engine.getContext().setWriter(writer);
        engine.eval("print('Hello'); java.lang.System.out.println('World')");
        System.out.println("writer.toString(): " + writer.toString());
        
        /*
        StringReader reader = new StringReader("Fred");
        engine.getContext().setReader(reader);
        engine.eval("name = new java.util.Scanner(java.lang.System.in).nextLine();  java.lang.System.out.println(name)");
        System.out.println("Done");
        */

        engine.eval("function pozdrowienie(jak, kto) { return jak + ', ' + kto + '!' }");
        result = ((Invocable) engine).invokeFunction("pozdrowienie", "Witaj", "Œwiecie");
        System.out.println(result);

        engine.eval("function Pozdrawiacz(jak) { this.jak = jak }");
        engine.eval("Pozdrawiacz.prototype.welcome = function(kto) { return this.jak + ', ' + kto + '!' }");
        Object yo = engine.eval("new Pozdrawiacz('Yo')");
        result = ((Invocable) engine).invokeMethod(yo, "welcome", "œwiecie");
        System.out.println(result);

        engine.eval("function welcome(kto) { return 'Witaj, ' + kto + '!' }");
        Pozdrawiacz g1 = ((Invocable) engine).getInterface(Pozdrawiacz.class);
        result = g1.welcome("œwiecie");
        System.out.println(result);
        
        Pozdrawiacz g2 = ((Invocable) engine).getInterface(yo, Pozdrawiacz.class);
        result = g2.welcome("œwiecie");
        System.out.println(result);
        
        JSON json = ((Invocable) engine).getInterface(engine.eval("JSON"), JSON.class);
        result = json.parse("{\"name\": \"Fred\", \"age\": 42}");
        System.out.println(result);
        result = json.stringify(result);
        System.out.println(result);
    }

    public interface Pozdrawiacz {
        String welcome(String kto);
    }
    
    public interface JSON {
        Object parse(String str);
        String stringify(Object obj);
    }    
}
