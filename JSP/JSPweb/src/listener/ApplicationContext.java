package listener;

import javax.naming.InitialContext;
import java.io.FileReader;
import java.util.Hashtable;
import java.util.Properties;

public class ApplicationContext {
    Hashtable<String, Object> objTable = new Hashtable<String, Object>();
    public Object getBean(String key) {
        return objTable.get(key);
    }
    public ApplicationContext(String propertiesPath) throws Exception {
        Properties props = new Properties();
        props.load(new FileReader(propertiesPath));
    }
    public void prepareObjects(Properties props)throws Exception {
        Context ctx = new InitialContext();
        for (Object item : props.keySet()){
            key = (String) item;
            value = props.getProperty(key);
            if (key.startsWith("jndi.")) {
                objTable.put(key, ctx.lookup(value));
            }else {
                objTable.put(key, Class.forName(value).newInstance());
            }
        }
    }
}
