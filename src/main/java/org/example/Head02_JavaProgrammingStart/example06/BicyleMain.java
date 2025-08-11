package org.example.Head02_JavaProgrammingStart.example06;

public class BicyleMain {
    public static void main(String[] args) {
        Bicycle myMtb = new Bicycle(
                "Trek",
                "유압식 디스크",
                "산악용(MTB)",
                "29인치",
                "SRAM Eagle",
                "라이저 바",
                "알루미늄",
                "네이비",
                19,
                13,
                12,
                85,
                105
        );
        myMtb.boarding();
        myMtb.brake();
        myMtb.ChainChange("28인치");
        myMtb.saddleHeightAdjustment(12);
        myMtb.handleHeightAdjustment(11);
        myMtb.parking();
        myMtb.pedalStep();
        myMtb.reflectionChange();
        myMtb.horn();
        myMtb.stunt();
        System.out.println(myMtb.toString());

    }
}
