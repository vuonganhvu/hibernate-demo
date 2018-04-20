import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args) throws ScriptException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("javascript");

        engine.eval("var x = 10;");
        engine.eval("var y = 20;");
        engine.eval("var z = x + y;");
        engine.eval("print(z);");
    }
}
