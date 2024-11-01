package com.lbg;

public class Zombie extends Monster{
    public String greeting(){
        StringBuilder sb = new StringBuilder();
        sb.append("Eurghhhhhh");
        return sb.toString();
    }
}
