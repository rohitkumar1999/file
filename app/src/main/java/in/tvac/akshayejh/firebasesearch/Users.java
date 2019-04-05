package in.tvac.akshayejh.firebasesearch;



public class Users {

    public String name, image, status,first,id;
    public  int count =0 ;


    public Users(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }




    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public  int getCount() {
        return count;
    }

    public Users(String name, String image, String status, String first,String id) {
        this.name = name;
        this.image = image;
        this.status = status;
        this.first = first ;
        this.id=id ;
        this.count++ ;
    }
}
