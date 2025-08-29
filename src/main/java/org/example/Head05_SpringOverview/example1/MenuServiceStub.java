package org.example.Head05_SpringOverview.example1;

import java.util.List;

public class MenuServiceStub implements MenuService {
    public List<String> getMenuList () {
        return List.of("샘플커피1", "샘플커피2");
    }
}
