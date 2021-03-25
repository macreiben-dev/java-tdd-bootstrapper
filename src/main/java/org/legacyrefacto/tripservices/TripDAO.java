package org.legacyrefacto.tripservices;

import org.legacyrefacto.tripservices.exceptions.CollaboratorCallException;
import org.legacyrefacto.tripservices.users.User;

import java.util.List;

public class TripDAO {

    public static List<Trip> findTripsByUser(User user) throws CollaboratorCallException {
        throw new CollaboratorCallException(
                "TripDAO should not be invoked on an unit test.");
    }
}