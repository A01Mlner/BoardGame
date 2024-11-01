package com.lbg;

public class Skeleton extends Monster{
    @Override
    public String greeting(){
        StringBuilder sb = new StringBuilder();
        sb.append("Clink Clink (bone noises");
        return sb.toString();
    }
}
