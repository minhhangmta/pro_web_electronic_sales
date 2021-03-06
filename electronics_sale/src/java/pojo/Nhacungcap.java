package pojo;
// Generated Nov 29, 2017 9:53:13 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Nhacungcap generated by hbm2java
 */
public class Nhacungcap  implements java.io.Serializable {


     private Integer maNcc;
     private String tennhacc;
     private String email;
     private String sodienthoai;
     private String diachi;
     private Set sanphams = new HashSet(0);

    public Nhacungcap() {
    }

    public Nhacungcap(String tennhacc, String email, String sodienthoai, String diachi, Set sanphams) {
       this.tennhacc = tennhacc;
       this.email = email;
       this.sodienthoai = sodienthoai;
       this.diachi = diachi;
       this.sanphams = sanphams;
    }
   
    public Integer getMaNcc() {
        return this.maNcc;
    }
    
    public void setMaNcc(Integer maNcc) {
        this.maNcc = maNcc;
    }
    public String getTennhacc() {
        return this.tennhacc;
    }
    
    public void setTennhacc(String tennhacc) {
        this.tennhacc = tennhacc;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSodienthoai() {
        return this.sodienthoai;
    }
    
    public void setSodienthoai(String sodienthoai) {
        this.sodienthoai = sodienthoai;
    }
    public String getDiachi() {
        return this.diachi;
    }
    
    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }
    public Set getSanphams() {
        return this.sanphams;
    }
    
    public void setSanphams(Set sanphams) {
        this.sanphams = sanphams;
    }




}


