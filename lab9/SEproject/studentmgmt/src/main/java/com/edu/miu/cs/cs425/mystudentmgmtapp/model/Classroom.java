package com.edu.miu.cs.cs425.mystudentmgmtapp.model;

import javax.persistence.*;

@Entity
@Table
public class Classroom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long classroomId;
    @Column(name="buildingName",nullable = false)
       private String buildingName;

    @Column(name="roomNumber",nullable = false)
    private String roomNumber;

    public Classroom(Long classroomId, String buildingName, String roomNumber) {
        this.classroomId = classroomId;
        this.buildingName = buildingName;
        this.roomNumber = roomNumber;
    }

    public Classroom() {
    }

    public Long getClassroomId() {
        return classroomId;
    }

    public void setClassroomId(Long classroomId) {
        this.classroomId = classroomId;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "classroomId=" + classroomId +
                ", buildingName='" + buildingName + '\'' +
                ", roomNumber='" + roomNumber + '\'' +
                '}';
    }
}
