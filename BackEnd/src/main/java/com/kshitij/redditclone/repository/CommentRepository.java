package com.kshitij.redditclone.repository;

import com.kshitij.redditclone.model.Comment;
import com.kshitij.redditclone.model.Post;
import com.kshitij.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}