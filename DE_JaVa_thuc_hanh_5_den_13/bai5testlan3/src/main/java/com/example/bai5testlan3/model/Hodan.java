package com.example.bai5testlan3.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "hodan")
public class Hodan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "so_nha")
    private String soNha;

    @Column(name = "so_thanh_vien")
    private int soThanhVien;

    @OneToMany(mappedBy = "hodan", cascade = CascadeType.ALL)
    private List<Nguoi> danhSachNguoi;

    // Getters & Setters
}

