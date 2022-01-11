package day012_Scanner;

public class GradeLeavel {
    public static void main(String[] args) {

        byte gradeLavels = 5;

        switch (gradeLavels) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("elementey school");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("middle school");
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                System.out.println("high school");
                break;
            case 13:
            case 14:
            case 15:
            case 16:
                System.out.println("collage");
                break;
            case 17:
            case 18:
                System.out.println("graduate");
            default:
                System.out.println("invalid gread");
        }

        System.out.println("--------------------------------------");

        byte gradeLavels1 = 10;
        String text = " ";
        boolean valid = gradeLavels1 >= 1 && gradeLavels1 <= 18;

        if (valid) {
            switch (gradeLavels1) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    text = "elementey school";
                    break;
                case 6:
                case 7:
                case 8:
                    text = " middle school";
                    break;
                case 9:
                case 10:
                case 11:
                case 12:
                    text = "high school";
                    break;
                case 13:
                case 14:
                case 15:
                case 16:
                    text = "collage";
                    break;
                case 17:
                case 18:
                    text = "graduation";
                    break;
                default:
                    text = "invalid grade";
            }

        }

        System.out.println(text);

    }
}


/*
1. Create a class called GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given*/


