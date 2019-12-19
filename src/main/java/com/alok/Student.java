package com.alok;

public class Student {
    private String sName;
    private int sId;
    private CheatSheet cheatSheet;

    public Student(String sName, int sId, CheatSheet cheatSheet) {
        this.sName = sName;
        this.sId = sId;
        this.cheatSheet = cheatSheet;
    }

    public void studentDoingCheating() {
        System.out.print("The student "+sName+" is cheating, his/her id is :"+sId+" with this ->>> ");
        System.out.print(cheatSheet.getCheatSheet()+"\n");
    }
}
