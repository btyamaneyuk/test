package com.example.sample.service;

import com.example.sample.constant.Constant;
import com.example.sample.helper.Helper;

@org.springframework.stereotype.Service
public class Service {

    public void useModel() {

        Constant constant = new Constant();

        Helper helper = new Helper();
        helper.createModel(constant.id, constant.name, constant.address);

    }
}
