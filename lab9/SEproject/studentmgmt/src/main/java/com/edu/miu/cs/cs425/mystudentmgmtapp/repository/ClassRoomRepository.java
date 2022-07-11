package com.edu.miu.cs.cs425.mystudentmgmtapp.repository;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassRoomRepository extends JpaRepository<Classroom,Long> {
}
