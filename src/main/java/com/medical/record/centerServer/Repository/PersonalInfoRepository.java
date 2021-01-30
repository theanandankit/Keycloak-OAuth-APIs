package com.medical.record.centerServer.Repository;

import com.medical.record.centerServer.Entity.PersonalInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonalInfoRepository extends JpaRepository<PersonalInfo,Integer> {

}
