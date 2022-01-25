package Mappers;

public class PostUserResponse{


    public String name;
    public String job;
    public String id;
    public String createdAt;



    @Override
    public String toString() {
        return "PostUserResponse {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", id='" + id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                '}';
    }
}
