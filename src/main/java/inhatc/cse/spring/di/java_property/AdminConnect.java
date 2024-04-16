package inhatc.cse.spring.di.java_property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Bean;


public class AdminConnect {
    private String adminId;
    private String adminPw;
    private String subId;
    private String subPw;

    public String getAdminId() {
        return adminId;
    }

    public void setAdminId(String adminId) {
        this.adminId = adminId;
    }

    public String getAdminPw() {
        return adminPw;
    }

    public void setAdminPw(String adminPw) {
        this.adminPw = adminPw;
    }

    public String getSubId() {
        return subId;
    }

    public void setSubId(String subId) {
        this.subId = subId;
    }

    public String getSubPw() {
        return subPw;
    }

    public void setSubPw(String subPw) {
        this.subPw = subPw;
    }
}
