package com.erp.vo;

public class EmpVo {
    private Integer id;
    private String userName;
    private String tel;
    private String idCardNo;
    private  String realName;
    private Integer gender;
    private String email;
    private String address;
    private String birthDate;
    private String deptName;
    private String roleName;




    @Override
    public String toString() {
        return "EmpVo{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", tel='" + tel + '\'' +
                ", idCardNo='" + idCardNo + '\'' +
                ", realName='" + realName + '\'' +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", deptName='" + deptName + '\'' +
                ", roleName='" + roleName + '\'' +
                '}';
    }

    public EmpVo(Integer id, String userName, String tel, String idCardNo, String realName, Integer gender, String email, String address, String birthDate, String deptName, String roleName) {
        this.id = id;
        this.userName = userName;
        this.tel = tel;
        this.idCardNo = idCardNo;
        this.realName = realName;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.birthDate = birthDate;
        this.deptName = deptName;
        this.roleName = roleName;
    }

    public EmpVo() {
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

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
