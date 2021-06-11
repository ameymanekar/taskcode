package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.StudyMaterialModel;
import com.example.demo.Repository.StuduMaterialRepo;


@Service
public class StudyMaterialServiceImpl implements StudyMaterialService {

	@Autowired
	StuduMaterialRepo StuduMaterialRepo;

	
	
public List<StudyMaterialModel> getAllRecords99(StudyMaterialModel StudyMaterialModel) {
		
		return StuduMaterialRepo.getAllRecords99(StudyMaterialModel);
	}
	
	
	
	@Override
	public boolean isRegister55(StudyMaterialModel StudyMaterialModel) {
		boolean b = StuduMaterialRepo.isRegister55(StudyMaterialModel);
		return b;
	}
	
	
	
	
}
