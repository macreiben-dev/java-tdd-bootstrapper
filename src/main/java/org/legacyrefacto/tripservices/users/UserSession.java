package org.legacyrefacto.tripservices.users;

import org.legacyrefacto.tripservices.exceptions.CollaboratorCallException;

public class UserSession {

    private static final UserSession userSession = new UserSession();

    private UserSession() {
    }

    public static UserSession getInstance() {
        return userSession;
    }

    public User getLoggedUser() throws CollaboratorCallException {
        throw new CollaboratorCallException(
                "UserSession.getLoggedUser() should not be called in an unit test");
    }

}