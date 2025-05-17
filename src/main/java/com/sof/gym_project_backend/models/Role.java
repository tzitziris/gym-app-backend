package com.sof.gym_project_backend.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    GYM, MEMBER;

    @Override
    public String getAuthority() {
        return "ROLE_" + name();  // επιστρέφει "GYM" ή "MEMBER"
    }
}
