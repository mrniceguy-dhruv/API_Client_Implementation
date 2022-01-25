package Mappers;

import java.util.List;

public class PaginatedUser {

    public int page;
    public int per_page;
    public int total;
    public int total_pages;
    public List <User> data;
    public Support support;

    @Override
    public String toString() {
        return "PaginatedUser {" + "\n" +
                "page=" + page  +
                "," + "\n" +
                "per_page=" + per_page +
                "," + "\n" + "total=" + total  +
                "," +  "\n" + "total_pages=" + total_pages +
                "," +  "\n" + "data=" + data+
                "," + "\n" + "support=" + support +
                '}';
    }
}
