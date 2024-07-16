package com.application.demo.book_my_show.repository;

import com.application.demo.book_my_show.entity.ShowSeatEntity;
import com.application.demo.book_my_show.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Integer> {
}
