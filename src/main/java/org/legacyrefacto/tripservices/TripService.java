package org.legacyrefacto.tripservices;

import java.util.ArrayList;
import java.util.List;

import org.legacyrefacto.tripservices.exceptions.CollaboratorCallException;
import org.legacyrefacto.tripservices.exceptions.UserNotLoggedInException;
import org.legacyrefacto.tripservices.users.User;
import org.legacyrefacto.tripservices.users.UserSession;

public class TripService {

    public List<Trip> getTripsByUser(User user) throws UserNotLoggedInException, CollaboratorCallException {
        List<Trip> tripList = new ArrayList<Trip>();
        User loggedUser = UserSession.getInstance().getLoggedUser();
        boolean isFriend = false;
        if (loggedUser != null) {
            for (User friend : user.getFriends()) {
                if (friend.equals(loggedUser)) {
                    isFriend = true;
                    break;
                }
            }
            if (isFriend) {
                tripList = TripDAO.findTripsByUser(user);
            }
            return tripList;
        } else {
            throw new UserNotLoggedInException();
        }
    }

}