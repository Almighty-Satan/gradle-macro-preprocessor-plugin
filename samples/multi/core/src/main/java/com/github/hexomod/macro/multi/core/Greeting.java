package com.github.hexomod.macro.multi.core;

public class Greeting {
    public static String getGreeting() {
        String message = "";
        //#ifdef DEBUG
        message += "DEBUG is defined" + "\n";

        //#if PROJECT==Project1
        message += "PROJECT: Project1" + "\n";
        //#endif

        //#if PROJECT==Project2
        message += "PROJECT: Project2" + "\n";
        //#endif

        //#if VAR_BOOL==true
        //#if VAR_BOOL!=false
        message += "VAR_BOOL is true" + "\n";
        //#endif
        //#endif

        //#if VAR_INT==1
        message += "VAR_INT equal 1" + "\n";
        //#endif

        //#if VAR_DOUBLE==2.0
        message += "VAR_DOUBLE equal 2.0" + "\n";
        //#else
        message += "VAR_DOUBLE not equal 2.0" + "\n";
        //#endif

        //#if VAR_BOOL==true && VAR_INT==1
        message += "VAR_BOOL is true and VAR_BOOL equal 1" + "\n";
        //#endif
        //#else
        // Just say hello to the world
        message = "Hello world";
        //#endif DEBUG
        return message;
    }
}
