package Mappers;

public class PutUserResponse {

    public String name;
    public String job;
    public String updatedAt;

    @Override
    public String toString() {
        return "PutUserResponse {" +
                "name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", updatedAt='" + updatedAt + '\'' +
                '}';
    }
}
