package com.chandu.TaskProject.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandu.TaskProject.Entity.Task;

public interface TaskRepository extends JpaRepository<Task,Long> {

}
