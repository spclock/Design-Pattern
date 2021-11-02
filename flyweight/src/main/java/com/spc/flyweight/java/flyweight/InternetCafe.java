package com.spc.flyweight.java.flyweight;

import java.util.HashMap;
import java.util.Map;

public class InternetCafe {


    private Map<String, Computer> map = new HashMap<>();

    public InternetCafe() {

        map.put("10001", new Computer());
        map.put("10002", new Computer());
        map.put("10003", new Computer());
        map.put("10004", new Computer());
        map.put("10005", new Computer());
        map.put("10006", new Computer());
        map.put("10007", new Computer());

    }


    public Computer login(Long id, String number) {
        if (map.get(number).getUserId() != null) {
            System.out.println(number + "号机子已经被占用");
            return null;
        }
        return map.computeIfPresent(number, (k, v) -> {
            Computer value = map.get(number);
            value.setUserId(id);
            System.out.println(id+" 登录 "+ number + " 机子成功");
            return value;
        });
    }

    public void logOut(String number) {
        map.computeIfPresent(number, (k, v) -> {
            Computer value = map.get(number);
            value.setUserId(null);
            System.out.println(number+" 机子下机了，请工作人员及时清理");
            return value;
        });
    }
}
