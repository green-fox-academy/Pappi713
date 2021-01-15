package com.greenfoxacademy.club.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class DogStats {

    @Getter
    @Setter
    private Integer lvl;
    private Integer HP;
    private Integer DP;
    private Integer Str;
    private Integer Dex;
    private Integer Int;

    public void setLvl(Integer lvl) {
        this.lvl = lvl;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public void setDP(Integer DP) {
        this.DP = DP;
    }

    public void setStr(Integer str) {
        Str = str;
    }

    public void setDex(Integer dex) {
        Dex = dex;
    }

    public void setInt(Integer anInt) {
        Int = anInt;
    }

    public Integer getLvl() {
        return lvl;
    }

    public Integer getHP() {
        return HP;
    }

    public Integer getDP() {
        return DP;
    }

    public Integer getStr() {
        return Str;
    }

    public Integer getDex() {
        return Dex;
    }

    public Integer getInt() {
        return Int;
    }



    public DogStats(){
        this.lvl=1;
        this.HP=8;
        this.DP=14;
        this.Str=8;
        this.Dex=8;
        this.Int=8;
    }



}
