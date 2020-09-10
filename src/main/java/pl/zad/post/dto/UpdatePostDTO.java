package pl.zad.post.dto;

import java.io.Serializable;

public class UpdatePostDTO implements Serializable {

    private final long post_id;
    private final String postText;

    public UpdatePostDTO(long post_id, String postText) {
        this.post_id = post_id;
        this.postText = postText;
    }

    public long getPost_id() {
        return post_id;
    }

    public String getPostText() {
        return postText;
    }

    @Override
    public String toString() {
        return "UpdatePostDTO{" +
                "post_id=" + post_id +
                ", postText='" + postText + '\'' +
                '}';
    }
}
