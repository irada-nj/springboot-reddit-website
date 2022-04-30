package com.springredditwebsite.repository;

import com.springredditwebsite.model.Comment;
import com.springredditwebsite.model.Post;
import com.springredditwebsite.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
