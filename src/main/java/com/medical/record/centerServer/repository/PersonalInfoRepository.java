package com.medical.record.centerServer.repository;

import com.medical.record.centerServer.entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo,Integer> {

}
