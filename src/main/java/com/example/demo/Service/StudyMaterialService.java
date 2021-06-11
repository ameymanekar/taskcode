package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.Model.StudyMaterialModel;

@Component
public interface StudyMaterialService {

	
	public boolean isRegister55(StudyMaterialModel StudyMaterialModel);

	public List<StudyMaterialModel> getAllRecords99( StudyMaterialModel StudyMaterialModel);
	 
	
}
