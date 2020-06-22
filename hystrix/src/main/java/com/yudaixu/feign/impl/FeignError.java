package com.yudaixu.feign.impl;

import com.yudaixu.entity.Student;
import com.yudaixu.feign.FeignProviderClient;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProviderClient {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中.......";
    }
}
