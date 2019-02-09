package ApplicationControlPatternSimplified;

/**
* Ryan Weston
* I started over and simplified this to show "basic" understanding
 */

import java.util.HashMap;

public class ApplicationControllerSimplified {
    private final HashMap<String,Handler> handlerMap = new HashMap();

    //
    public void handleRequest(String command, HashMap<String,Object> data){
        Handler handler = handlerMap.get(command);
        if (aCommandHandler != null){
            aCommandHandler.handleIt(data);
        }
    }
    //to create something to calculate the area of a house or driveway for future use.
    public void mapCommand(String aCommand, Handler aHandler){
        //handlerMap.put(aCommand,acHandler);
        handlerMap.put("A", new AreaOfHouse());
        handlerMap.put("B", new DrivwaySize());  
       }
}
