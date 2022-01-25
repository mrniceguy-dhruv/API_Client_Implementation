import Mappers.*;
import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;


public class MyApp {
    public static void main(String... args) {
        UserInterface userInterface = Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .target(UserInterface.class, "https://reqres.in/api");


        SingleUser contributors = userInterface.contributors("2");
        CreateUser createUser = new CreateUser("morph","leader");
        PostUserResponse postUserResponse = userInterface.create(createUser);
        PutUserResponse putUserResponse = userInterface.putUser(createUser);

        postUserResponse.job = createUser.job;
        postUserResponse.name = createUser.name;

        putUserResponse.job = createUser.job;
        putUserResponse.name = createUser.name;

        PaginatedUser newOne = userInterface.getPage("2");

        System.out.println(contributors);
        System.out.println(postUserResponse);
        System.out.println(newOne);
        System.out.println(putUserResponse);

    }
}