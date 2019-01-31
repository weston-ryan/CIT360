/*
This is a much simpler Application Control Pattern.  I think I way over did it on my other version.
*/

package com.doing.more.java.appcontrol;

import java.util.HashMap;

public class ApplicationController {
    private HashMap<String,Handler> handlerMap = new HashMap();

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
