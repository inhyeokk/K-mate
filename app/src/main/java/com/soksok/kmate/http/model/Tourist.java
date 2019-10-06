package com.soksok.kmate.http.model;

public class Tourist {

    private String h_kor_city; // 시
    private String h_kor_gu; // 구
    private String h_kor_dong; // 동
    private String name_kor; // 관광지 이름
    private String add_kor; // 부가 설명

    public String getH_kor_city() {
        return h_kor_city;
    }

    public void setH_kor_city(String h_kor_city) {
        this.h_kor_city = h_kor_city;
    }

    public String getH_kor_gu() {
        return h_kor_gu;
    }

    public void setH_kor_gu(String h_kor_gu) {
        this.h_kor_gu = h_kor_gu;
    }

    public String getH_kor_dong() {
        return h_kor_dong;
    }

    public void setH_kor_dong(String h_kor_dong) {
        this.h_kor_dong = h_kor_dong;
    }

    public String getName_kor() {
        return name_kor;
    }

    public void setName_kor(String name_kor) {
        this.name_kor = name_kor;
    }

    public String getAdd_kor() {
        return add_kor;
    }

    public void setAdd_kor(String add_kor) {
        this.add_kor = add_kor;
    }

    @Override
    public String toString() {
        return "Tourist{" +
                "h_kor_city='" + h_kor_city + '\'' +
                ", h_kor_gu='" + h_kor_gu + '\'' +
                ", h_kor_dong='" + h_kor_dong + '\'' +
                ", name_kor='" + name_kor + '\'' +
                ", add_kor='" + add_kor + '\'' +
                '}';
    }
}
