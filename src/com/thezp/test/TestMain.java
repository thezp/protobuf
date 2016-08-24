package com.thezp.test;

import com.thezp.domain.PersonProbuf;

/**
 * Created by zhangpeng on 16/8/24.
 */
public class TestMain {
    public static void main(String[] args) {
        PersonProbuf.Person aman = PersonProbuf.Person.newBuilder().setId(1).setName("yondaime").setEmail("11@qq.com").build();
        System.out.println(aman);
    }
}
