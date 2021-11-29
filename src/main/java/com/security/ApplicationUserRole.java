package com.security;

import com.google.common.collect.Sets;

import java.util.Set;

import static com.security.ApplicationUserPermission.*;

public enum ApplicationUserRole {
    SUPER_ADMIN(Sets.newHashSet()),
    ADMIN(Sets.newHashSet(CREATE_USER, DELETE_USER,VIEW_ITEMS)),
    CUSTOMER(Sets.newHashSet(VIEW_ITEMS));

    private final Set<ApplicationUserPermission> permissions;

    ApplicationUserRole(Set<ApplicationUserPermission> permissions) {
        this.permissions = permissions;
    }

    public Set<ApplicationUserPermission> getPermissions() {
        return permissions;
    }
}
