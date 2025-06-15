package com.example.bai5testlan3.controller;

import com.example.bai5testlan3.repository.NguoiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class NguoiController {

    @Autowired
    private NguoiRepository nguoiRepository;

    @GetMapping("/nguoi")
    public String hienThiDanhSach(Model model) {
        model.addAttribute("nguoiList", nguoiRepository.findAll());
        return "nguoi"; // -> tìm nguoi.html
    }

}
