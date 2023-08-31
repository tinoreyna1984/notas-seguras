package com.aplicacion.notasseguras.security.util;

import java.util.Arrays;
import java.util.List;

public enum Role {

    CUSTOMER(Arrays.asList(Permission.READ_ALL_NOTES)),
    ADMINISTRATOR(Arrays.asList(Permission.SAVE_ONE_NOTE, Permission.MODIFY_ONE_NOTE, Permission.DELETE_ONE_NOTE, Permission.READ_ALL_NOTES));

    private List<Permission> permissions;

    Role(List<Permission> permissions) {
        this.permissions = permissions;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
