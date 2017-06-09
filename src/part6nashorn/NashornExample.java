package part6nashorn;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class NashornExample {

	public static void main(String[] args) {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engineByName = manager.getEngineByName("nashorn");
		
		//Object result = engineByName.eval("");
	}
}
