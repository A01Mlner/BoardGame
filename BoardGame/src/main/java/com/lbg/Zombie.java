package com.lbg;

public class Zombie extends Monster{
    @Override
    public String greeting(){
        StringBuilder sb = new StringBuilder();
        sb.append("Eurghhhhhh");
        return sb.toString();
    }

    @Override
    public int livesLost(){
        return 2;
    }
}
