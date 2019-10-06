package com.soksok.kmate.http.model.request;

public class RegisterRequest {
    private String email; // 유저의 이메일 (아이디) 중복불가.
    private String password; // 유저의 패스워드
    private String nickname; // 유저의 닉네임
    private int age; // 유저의 나이
    private String gender; // 유저의 성별 M or W 남자는 M 여자는 W
    private String profileImage; // 프로필 이미지 String (base64)
    private int iskakao; // 카카오로그인이면 1 아니면 0

    public RegisterRequest(String email, String password, String nickname, int age, String gender , String profileImage , int iskakao) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
        this.age = age;
        this.gender = gender;
        this.profileImage = profileImage;
        this.iskakao = iskakao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public int getIskakao() {
        return iskakao;
    }

    public void setIskakao(int iskakao) {
        this.iskakao = iskakao;
    }
}
