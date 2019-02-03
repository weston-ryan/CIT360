package ApplicationControlPatternSimplified;

/**
* I started over and simplified this to show "basic" understanding
 */

import java.util.HashMap;

public class ApplicationControllerSimplified {
    private final HashMap<String,Handler> handlerMap = new HashMap();

    public void handleRequest(String command, HashMap<String,Object> data){
        Handler aCommandHandler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }

    public void mapCommand(String aCommand, Handler acHandler){
        handlerMap.put(aCommand,acHandler);
    }
}
