package com.example.sample.helper;

import com.example.sample.model.Model;
import org.springframework.stereotype.Component;

@Component
public class Helper {

    public Model createModel(int id, String name, String address) {
        Model model = Model.builder()
            .id(id)
            .name(name)
            .address(address)
            .build();
        return model;

    }
}
