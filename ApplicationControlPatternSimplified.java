package ApplicationControlPatternSimplified;

/**
* Ryan Weston
* I started over and simplified this to show "basic" understanding
 */

import java.util.HashMap;
import java.util.logging.Handler;

public class ApplicationControlPatternSimplified {
    private final HashMap<String,Handler> handlerMap = new HashMap();

    //
    public void handleRequest(String command, HashMap<String,Object> data){
        Handler handler = handlerMap.get(command);
        Object aCommandHandler = null;
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }
    //to create something to calculate the area of an office for future use.
    public void mapCommand(String aCommand, Handler aHandler){
        //handlerMap.put(aCommand,acHandler);
        Handler put = handlerMap.put("A", new OfficeArea());
       // HashMap<String, Handler> put = handlerMap.put("B", new CubicleArea());  
       }
}
