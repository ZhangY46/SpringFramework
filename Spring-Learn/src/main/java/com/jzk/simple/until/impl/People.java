package com.jzk.simple.until.impl;

import com.jzk.simple.until.IMove;
import com.jzk.simple.until.IPeople;

/**
 * ClassName:People
 * Package:com.jzk.simple.until.impl
 * Description:
 *
 * @Date:2020/3/18 13:58
 * @Author:JiangZhikuan
 */
public class People implements IPeople {

    IMove move;

    public People(Move move){
        this.move=move;
    }

    public void peopleMove() {
        move.move();
    }
}
