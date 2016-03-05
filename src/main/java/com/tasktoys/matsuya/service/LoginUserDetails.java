package com.tasktoys.matsuya.service;

import lombok.Data;
import com.tasktoys.matsuya.domain.User;
import lombok.EqualsAndHashCode;
import org.springframework.security.core.authority.AuthorityUtils;

@Data
@EqualsAndHashCode(callSuper=false)
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {
    /**
	 * 
	 */
	private static final long serialVersionUID = -4955910981517702287L;
	private final User user;

    public LoginUserDetails(User user) {
        super(user.getUsername(),
                user.getEncodedPassword(),
                AuthorityUtils.createAuthorityList("ROLE_USER"));
        this.user = user;
    }
}
