package com.example.parksinyoung.moblieprogramming_syjy.singleton;

public class Schedule {
    private String className;
    private String classRoom;
    private String classDay;
    private String classTime;

    private String monday[] = new String[7];
    private String tuesday[] = new String[7];
    private String wednesday[] = new String[7];
    private String thursday[] = new String[7];
    private String friday[] = new String[7];

    public Schedule() {
        for (int i = 0; i < 7; i++) {
            monday[i] = "";
            tuesday[i] = "";
            wednesday[i] = "";
            thursday[i] = "";
            friday[i] = "";

        }
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setClassRoom(String classRoom) {
        this.classRoom = classRoom;
    }

    public void setClassDay(String classDay) {
        this.classDay = classDay;
    }

    public void setClassTime(String classTime) {
        this.classTime = classTime;
    }

    public String getClassName() {
        return className;
    }

    public String getClassRoom() {
        return classRoom;
    }

    public String getClassDay() {
        return classDay;
    }

    public String getClassTime() {
        return classTime;
    }
}