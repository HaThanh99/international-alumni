package dtu.captone.alumni.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.io.Serializable;
import java.util.Collection;

public class SecurityUser extends User implements Serializable {

    private static final long serialVersionUID = 1L;

    private String impersonate;

    private int status;

    public SecurityUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, true, true, true, true, authorities);
    }

    public String getImpersonate() {
        return impersonate;
    }

    public void setImpersonate(String impersonate) {
        this.impersonate = impersonate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int i) {
        this.status = i;
    }
}
