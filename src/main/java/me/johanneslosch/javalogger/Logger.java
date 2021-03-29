package me.johanneslosch.javalogger;

import me.johanneslosch.javafilehandler.WriteFile;

public class Logger {
    /**
     * <p>msg.</p>
     *
     * @param content a {@link java.lang.String} object.
     */
    public static void msg(String content) {
        logger("msg", content);
    }

    /**
     * <p>error.</p>
     *
     * @param content a {@link java.lang.String} object.
     */
    public static void error(String content) {
        logger("error", content);
    }

    /**
     * <p>warning.</p>
     *
     * @param content a {@link java.lang.String} object.
     */

    private static void logger(String type, String content) {
        if (type.equals("warning")) {
            WriteFile.writer("logs", "LOG", "txt",
                    String.format("[WARNING]: %s \n", content));
        }
        if (type.equals("error")) {
            WriteFile.writer("logs", "LOG", "txt",
                    String.format("[ERROR]: %s \n", content));
        }
        if (type.equals("msg")){
            WriteFile.writer("logs", "LOG", "txt",
                    String.format("[MESSAGE]: %s \n", content));
        }
    }

}