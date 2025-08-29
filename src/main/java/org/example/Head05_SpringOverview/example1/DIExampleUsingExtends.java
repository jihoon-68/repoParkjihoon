package org.example.Head05_SpringOverview.example1;

public class DIExampleUsingExtends {
    public static void main(String[] args) {
//       // 실제 운영용
//        MenuService service = new MenuService();
//        MenuController controller = new MenuController(service);
//        System.out.println("==실제 운영 예시==");
//        controller.printMenu();
//
//        // 테스트용 또는 Stub 교체
//        MenuService stubService = new MenuServiceStub();
//        MenuController testController = new MenuController(stubService);
//        System.out.println("\n==테스트용 혹은 Stub 예시==");
//        testController.printMenu();

        // 실제 운영 환경
        MenuService realService = new MenuServiceImpl();
        MenuController controller = new MenuController(realService);
        controller.printMenu();

        // 테스트 또는 Stub 사용 환경
        MenuService stubService = new MenuServiceStub();
        MenuController testController = new MenuController(stubService);
        testController.printMenu();


    }

}
