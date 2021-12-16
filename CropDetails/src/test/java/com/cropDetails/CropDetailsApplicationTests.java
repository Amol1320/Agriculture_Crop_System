package com.cropDetails;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cropDetails.controller.cropDetailsController;
import com.cropDetails.module.CropDetails;
import com.cropDetails.repository.cropDetailsRepository;


@SpringBootTest
class CropDetailsApplicationTests {
	
	@Autowired
	private cropDetailsController cropdetailscontroller;
	
	@MockBean
	private cropDetailsRepository cropdeatilsrepository;

	@Test
	void contextLoads() {
	}
	
	
	@Test
	public void findAllCropTest() {
		when(cropdeatilsrepository.findAll()).thenReturn(Stream.of
				(new CropDetails(101,"Amol Salunke","vegitable","Bajara",80,"Solapur"),
						new CropDetails(104,"Abhi Bhalavankar","vegitable","wheat",75,"Satara"))
		.collect(Collectors.toList()));
		assertEquals(2,cropdetailscontroller.getAllCrop().size());
	}
	
	@Test
	public void deleteCropTest() {
		int id = 115;
		cropdetailscontroller. delete(id);
		verify(cropdeatilsrepository,times(1)).deleteById(id);
	}
	
	@Test
	public void getDealerDataTest() {
		int id = 107;
		cropdetailscontroller. getCropbyId(id);
		verify(cropdeatilsrepository,times(1)).findById(id);
	}
	


}
