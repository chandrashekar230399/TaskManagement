package com.chandu.TaskProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.TaskProject.Entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
