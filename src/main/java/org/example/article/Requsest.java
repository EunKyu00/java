package org.example.article;

public class Requsest {
    private String actionCode;
    private int idx;

    public Requsest(String command){
        String[] commandList = command.split("\\?", 2);
        actionCode = commandList[0];
        String[] paramsStr = commandList[1].split("=", 2);
        String key = paramsStr[0];
        String value = paramsStr[1];
        idx = Integer.parseInt(value);
    }
    public String getActionCode(){
        return actionCode;
    }
    public int getIdx(){
        return idx;
    }
}
