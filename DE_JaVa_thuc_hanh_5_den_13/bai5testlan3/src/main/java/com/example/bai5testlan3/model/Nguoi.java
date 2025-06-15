package com.example.bai5testlan3.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "nguoi")
public class Nguoi {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "ho_ten")
    private String hoTen;

    @Column(name = "ngay_sinh")
    private Date ngaySinh;

    @Column(name = "nghe_nghiep")
    private String ngheNghiep;

    @ManyToOne
    @JoinColumn(name = "hodan_id")
    private Hodan hodan;

    // === Getters & Setters ===

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public Hodan getHodan() {
        return hodan;
    }

    public void setHodan(Hodan hodan) {
        this.hodan = hodan;
    }
}
