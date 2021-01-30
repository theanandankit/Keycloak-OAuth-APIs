package com.medical.record.centerServer.service;

import com.medical.record.centerServer.Entity.PersonalInfo;
import com.medical.record.centerServer.Repository.PersonalInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalInfoService {

	@Autowired
	private PersonalInfoRepository personalInfoRepository;

	public PersonalInfo save(PersonalInfo personalInfo) {
		return personalInfoRepository.save(personalInfo);
	}

	public PersonalInfo update(PersonalInfo temp) {
		PersonalInfo personalInfo = personalInfoRepository.findById(temp.getId()).orElse(null);
		if (personalInfo != null) {
			personalInfo.setAddress(temp.getAddress());
			personalInfo.setCity(temp.getCity());
			personalInfo.setContactNo(temp.getContactNo());
			personalInfo.setPinCode(temp.getPinCode());
			personalInfo.setState(temp.getState());
			return personalInfoRepository.save(personalInfo);
		}
		return null;
	}
}
