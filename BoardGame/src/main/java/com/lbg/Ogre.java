package com.lbg;

public class Ogre extends Monster{
    @Override
    public String greeting(){
        StringBuilder sb = new StringBuilder();
        sb.append("Get outta me swamp");
        return sb.toString();
    }

    @Override
    public int livesLost(){
        return 3;
    }
}
