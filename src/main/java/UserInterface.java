import Mappers.*;
import feign.Param;
import feign.RequestLine;

interface UserInterface {

    @RequestLine("GET /users/{no}")
    SingleUser contributors(@Param("no") String no);

    @RequestLine("POST /users")
    PostUserResponse create(CreateUser newUser);

    @RequestLine("GET /users?page={page_no}")
    PaginatedUser getPage(@Param("page_no") String page_no);

    @RequestLine(("PUT /users/2"))
    PutUserResponse putUser(CreateUser createUser);

}