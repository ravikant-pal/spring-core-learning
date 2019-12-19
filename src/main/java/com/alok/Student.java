package com.alok;

public class Student {
    private String sName;
    private int sId;
    private CheatSheet cheatSheet;

    public void setCheatSheet(CheatSheet cheatSheet) {
        this.cheatSheet = cheatSheet;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }



    public void studentDoingCheating() {
        System.out.print("The student "+sName+" is cheating, his/her id is :"+sId+" with this ->>> ");
        System.out.print(cheatSheet.getCheatSheet()+"\n");
    }
}
