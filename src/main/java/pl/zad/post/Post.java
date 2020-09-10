package pl.zad.post;

import javax.persistence.*;

@Entity
@Table(name = "POST")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long post_id;
    private String postText;

    public long getPost_id() {
        return post_id;
    }

    public void setPost_id(long post_id) {
        this.post_id = post_id;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post_id=" + post_id +
                ", postText='" + postText + '\'' +
                '}';
    }
}
