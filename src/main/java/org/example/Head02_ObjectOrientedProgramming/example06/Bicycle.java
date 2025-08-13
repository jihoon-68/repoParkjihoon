package org.example.Head02_ObjectOrientedProgramming.example06;

public class Bicycle {
    private String brand;
    private String brake;
    private String type;
    private String wheel;
    private String chain;
    private String handle;
    private String bodyMaterial;
    private String color;
    private int size;
    private int weight;
    private int gearNumber;
    private int saddleHeight;
    private int handleHeight;


    //자전거 브랜드랑,몸체,사이즈,용도 정하고 나머지는  구성은 생각중 나중에 Getter/Setter 로 등로 예정
    public Bicycle(String brand, String bodyMaterial,String type,int size){
        this.brand = brand;
        this.bodyMaterial = bodyMaterial;
        this.size = size;
        this.type = type;
    }

    //풀 생성자
    //자전거 구성 다 했을떄
    public Bicycle(String brand, String brake, String type,
                   String wheel, String chain, String handle,
                   String bodyMaterial, String color,
                   int size, int weight, int gearNumber,
                   int saddleHeight, int handleHeight) {
        this.brand = brand;
        this.brake = brake;
        this.type = type;
        this.wheel = wheel;
        this.chain = chain;
        this.handle = handle;
        this.bodyMaterial = bodyMaterial;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.gearNumber = gearNumber;
        this.saddleHeight = saddleHeight;
        this.handleHeight = handleHeight;
    }

    public void ChainChange(String chain){
        System.out.println(this.chain+"에서 "+chain+"체인으로 변경 하는중");
        //변경은 이 만드어진 Setter 함수 재활용
        setChain(chain);
    }

    public void saddleHeightAdjustment(int saddleHeight){
        System.out.println(this.saddleHeight+"에서 "+saddleHeight+"으로 안장 높이 변경 하는중");
        //변경은 이 만드어진 Setter 함수 재활용
        setSaddleHeight(saddleHeight);
    }

    public void handleHeightAdjustment(int handleHeight){
        System.out.println(this.handleHeight+"에서 "+handleHeight+"으로 핸들 높이 변경 하는중");
        //변경은 이 만드어진 Setter 함수 재활용
        setHandleHeight(handleHeight);
    }

    public void brake(){
        System.out.println("브래이크 밟는중");
    }

    public void pedalStep(){
        System.out.println("페달 밟는중");
    }

    public void reflectionChange(){
        System.out.println("반향 전환하는 중");
    }

    public void horn(){
        System.out.println("경적 울리는 중");
    }

    public void parking(){
        System.out.println("주차 하는 중");
    }

    public void stunt(){
        System.out.println("묘기 하는 중");
    }

    public void boarding(){
        System.out.println("자전거 타는 중");
    }

    @Override
    public String toString() {
        //라인 변경 "\n"으로 출력문 정리
        return "Bicycle" +
                "brand=" + brand + '\'' +"\n"+
                " brake=" + brake + '\'' +"\n"+
                " type=" + type + '\'' +"\n"+
                " wheel=" + wheel + '\'' +"\n"+
                " chain=" + chain + '\'' +"\n"+
                " handle=" + handle + '\'' +"\n"+
                " bodyMaterial=" + bodyMaterial + '\'' +"\n"+
                " color=" + color + '\'' +"\n"+
                " size=" + size +"\n"+
                " weight=" + weight +"\n"+
                " gearNumber=" + gearNumber +"\n"+
                " saddleHeight=" + saddleHeight +"\n"+
                " handleHeight=" + handleHeight +"\n";
    }

    //Getter
    // 자전거에 모든 정보를 들고올수 있게 전부 Getter 생성

    public String getBrand() {
        return brand;
    }

    public String getBrake() {
        return brake;
    }

    public String getType() {
        return type;
    }

    public String getWheel() {
        return wheel;
    }

    public String getChain() {
        return chain;
    }

    public String getHandle() {
        return handle;
    }

    public String getBodyMaterial() {
        return bodyMaterial;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public int getGearNumber() {
        return gearNumber;
    }



    //Setter
    // 브랜드, 바디,사이즈,용도는 한번 등록 하면 변경을 필요 없으니까 브랜드랑 바디 뺴고 Setter 생성
    public void setBrake(String brake) {
        this.brake = brake;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public void setHandle(String handle) {
        this.handle = handle;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    public void setSaddleHeight(int saddleHeight) {
        this.saddleHeight = saddleHeight;
    }

    public void setHandleHeight(int handleHeight) {
        this.handleHeight = handleHeight;
    }
}

