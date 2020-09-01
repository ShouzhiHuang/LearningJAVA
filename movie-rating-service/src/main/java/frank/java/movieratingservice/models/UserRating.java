package frank.java.movieratingservice.models;

import java.util.List;

// in case of future enhancement like changing the reponse body use a wrapper class instead of List as a root class
public class UserRating {
    private List<Rating> userRatings;

    public UserRating() { }

    public UserRating(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }

    public List<Rating> getUserRatings() {
        return userRatings;
    }

    public void setUserRatings(List<Rating> userRatings) {
        this.userRatings = userRatings;
    }
}
