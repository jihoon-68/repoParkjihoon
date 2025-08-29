package org.example.Head05_SpringOverview.example1;

import java.util.List;

public class MenuServiceImpl implements MenuService{
    public List<String> getMenuList(){
        return List.of("아메리카노", "카페라떼");
    }
}
