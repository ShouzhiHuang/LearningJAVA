package frank.java.moviecatalogservice.models;

import java.util.List;

// in case of future enhancement like changing the reponse body use a wrapper class instead of List as a root class
public class UserRating {
    private List<Rating> userRatings;

    private String userId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

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
