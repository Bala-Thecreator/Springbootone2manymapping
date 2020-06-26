package com.marlabs.bala.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marlabs.bala.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long>
{

}
