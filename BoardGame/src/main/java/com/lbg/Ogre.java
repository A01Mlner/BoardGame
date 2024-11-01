package com.lbg;

public class Ogre extends Monster{
    public String greeting(){
        StringBuilder sb = new StringBuilder();
        sb.append("Get outta me swamp");
        return sb.toString();
    }
}
