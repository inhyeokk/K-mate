package com.soksok.kmate.http.model.request;

public class TourRequest {

    private String idx;
    private String name; // 여행 제목
    private String startDate; // 여행 시작 날짜
    private String endDate; // 여행 끝나는 날짜
    private int adult; // 성인 몇명
    private int child; // 어린이 몇명
    private int infant; // 유아 몇명
    private String touristName; // 관광지 이름
    private String tourStyle; // MM 맛집 , HY 휴양 , GG 관광 , AT 액티비티 , MC, 문화체험
    private String tourType; // GG 적극적인 , DG 도전적인 , YY 여유로운 , EJ 의지하고싶은, BB 바삐움직이는
    private String mateEmail; // 메이트의 이메일 (가이드의 이메일)
    private String image;

    public TourRequest() {
    }

    public TourRequest(String idx) {
        this.idx = idx;
    }

    public TourRequest(String name, String startDate, String endDate, int adult, int child, int infant, String touristName, String tourStyle, String tourType, String mateEmail , String image) {
        this.name = name;
        this.startDate = startDate;
        this.endDate = endDate;
        this.adult = adult;
        this.child = child;
        this.infant = infant;
        this.touristName = touristName;
        this.tourStyle = tourStyle;
        this.tourType = tourType;
        this.mateEmail = mateEmail;
        this.image = image;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getAdult() {
        return adult;
    }

    public void setAdult(int adult) {
        this.adult = adult;
    }

    public int getChild() {
        return child;
    }

    public void setChild(int child) {
        this.child = child;
    }

    public int getInfant() {
        return infant;
    }

    public void setInfant(int infant) {
        this.infant = infant;
    }

    public String getTouristName() {
        return touristName;
    }

    public void setTouristName(String touristName) {
        this.touristName = touristName;
    }

    public String getTourStyle() {
        return tourStyle;
    }

    public void setTourStyle(String tourStyle) {
        this.tourStyle = tourStyle;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public String getMateEmail() {
        return mateEmail;
    }

    public void setMateEmail(String mateEmail) {
        this.mateEmail = mateEmail;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
