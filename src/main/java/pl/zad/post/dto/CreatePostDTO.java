package pl.zad.post.dto;

import java.io.Serializable;

public class CreatePostDTO implements Serializable {

    private final String postText;

    public CreatePostDTO(String postText) {
        this.postText = postText;
    }

    public String getPostText() {
        return postText;
    }

    @Override
    public String toString() {
        return "CreatePostDTO{" +
                "postText='" + postText + '\'' +
                '}';
    }
}
