package com.erp.pojo;

public class Emp {
    private Integer id;
    private String userName;
    private String password;
    private String tel;
    private String idCardNo;
    private  String realName;
    private Integer gender;
    private String email;
    private String address;
    private String birthDate;
    private Integer deptId;

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deptId=" + deptId +
                '}';
    }

    public Emp(Integer id, String userName, String password, String tel, String idCardNo, String realName, Integer gender, String email, String address, String birthDate, Integer deptId) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.tel = tel;
        this.idCardNo = idCardNo;
        this.realName = realName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.deptId = deptId;
    }

    public Emp() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getIdCardNo() {
        return idCardNo;
    }

    public void setIdCardNo(String idCardNo) {
        this.idCardNo = idCardNo;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getDeptId() {
        return deptId;
    }

    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
