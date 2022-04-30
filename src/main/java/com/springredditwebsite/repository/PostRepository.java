package com.springredditwebsite.repository;

import com.springredditwebsite.model.Post;
import com.springredditwebsite.model.Subreddit;
import com.springredditwebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
