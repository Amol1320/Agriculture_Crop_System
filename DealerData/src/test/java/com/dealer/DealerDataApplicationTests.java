package com.dealer;

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

import com.dealer.controller.DealerController;
import com.dealer.module.DealerData;
import com.dealer.repository.DealerDataRepository;

@SpringBootTest
class DealerDataApplicationTests {
	
	
	@Autowired
	private DealerController dealerCOntroller;
	
	@Autowired
	private DealerDataRepository dealerDataRepository;
	
	
	@Autowired
	private DealerController controller;
	
	@MockBean
	private DealerDataRepository repository;
	
	
	
	@Test
	public void findAllDealerTest() {
		when(repository.findAll()).thenReturn(Stream.of
				(new DealerData("101","Shubham","Punjab",50,"89523535"),
						new DealerData("102","amol","solapur",50,"895236545"))
		.collect(Collectors.toList()));
		assertEquals(2,controller.getAllData().size());
	}
	
	@Test
	public void deleteDealerTest() {
		String dealerid = "115";
		controller. deletDatabyId(dealerid);
		verify(repository,times(1)).deleteById(dealerid);
	}
	
	@Test
	public void getDealerDataTest() {
		String dealerid = "107";
		controller. getdealerbyId(dealerid);
		verify(repository,times(1)).findById(dealerid);
	}
	
	/*@Test
	public void addSellerDetailsTest() {
		DealerData dealerData = new DealerData("101","Amol","Solapur",21,"123654");
		when(repository.save(dealerData)).thenReturn(dealerData);
		assertEquals(dealerData, controller.SaveDealarData(dealerData));
	}*/

	@Test
	void contextLoads() {
	}

}
