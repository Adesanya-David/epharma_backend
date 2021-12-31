package com.security;

public enum ApplicationUserPermission {
    CREATE_USER("canCreateUser"),
    DELETE_USER("canDeleteUser"),
    VIEW_ITEMS("canViewItems"),
    CREATE_ITEMS("canCreateItEMS"),
    DELETE_ITEMS("canDeleteItems");

    private final String permission;

    ApplicationUserPermission(String permission) {
        this.permission = permission;
    }

    public String getPermission() {
        return permission;
    }
}
