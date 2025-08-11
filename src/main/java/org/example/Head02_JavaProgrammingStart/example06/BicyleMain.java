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
/**
 * 객체: 자전거
 * 	속성
 * 		브랜드(String),
 * 		무게(int)
 * 		기어 단수(int)
 * 		브레이크 종류(String)
 * 		종류(String)
 * 		 휠(String)
 * 		 체인(String)
 * 		 손잡이(String)
 * 		 바디 재질(String),
 * 		 색상(String)
 * 		 크기(int)
 * 	행동
 * 		체인 변경()
 * 		안장 높이 조절()
 * 		손잡이 높이 조절()
 * 		브레이크()
 * 		페달 밟기()
 * 		반향전환()
 * 		경적()
 * 		주차()
 * 		묘기()
 * 		탑승()
 **/
