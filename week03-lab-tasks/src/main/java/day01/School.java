package day01;

public class School {
    public static void main(String[] args) {
        Students student = new Students();
        student.addHeight(20);
        student.addHeight(22);
        //student.addHeight(34);
        student.addHeight(26);
        student.addHeight(28);
        //student.addHeight(30);
        System.out.println("A gyerekek magassága növekvő sorrendben van: " + student.isHeightsIncreasing());
    }
}
