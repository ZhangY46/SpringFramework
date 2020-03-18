package com.jzk.simple.until.impl;

import com.jzk.simple.until.IMove;

import java.text.DecimalFormat;

/**
 * ClassName:Move
 * Package:com.jzk.simple.until.impl
 * Description:
 *
 * @Date:2020/3/18 13:37
 * @Author:JiangZhikuan
 */
public class Move implements IMove {

    private String name;
    private int x;
    private int y;

    public Move(){}

    public Move(String n,Integer x,int y){
        this.name=n;
        this.x=x;
        this.y=y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move() {

        DecimalFormat df=new DecimalFormat("#.00");
        double m=Math.sqrt((x*x+y*y));

        System.out.println(name +" the move :"+ df.format(m)+"M");

    }

}
