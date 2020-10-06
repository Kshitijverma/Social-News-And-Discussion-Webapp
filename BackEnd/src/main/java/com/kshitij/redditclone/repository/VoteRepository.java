package com.kshitij.redditclone.repository;

import com.kshitij.redditclone.model.Post;
import com.kshitij.redditclone.model.User;
import com.kshitij.redditclone.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}