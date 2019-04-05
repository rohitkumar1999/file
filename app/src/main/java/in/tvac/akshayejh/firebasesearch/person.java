package in.tvac.akshayejh.firebasesearch;

public class person  {
    private String first_seen,last_seen,image,id ;
    public person()
    {

    }

    public person(String first_seen, String last_seen, String image,String id) {
        this.first_seen = first_seen;
        this.last_seen = last_seen;
        this.image = image;
        this.id = id ;

    }

    public String getFirst_seen() {
        return first_seen;
    }

    public void setFirst_seen(String first_seen) {
        this.first_seen = first_seen;
    }

    public String getLast_seen() {
        return last_seen;
    }

    public void setLast_seen(String last_seen) {
        this.last_seen = last_seen;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
