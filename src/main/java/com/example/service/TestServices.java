package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.domain.TestPOJO;
import com.example.dto.HotelDto;
import com.example.dto.Record;
import com.example.mapper.HotelDtoMapper;
import com.example.mapper.RecordMapper;
import com.example.mapper.TestMapper;

@Service
public class TestServices {

	@Autowired
    private TestMapper testMapper; 
	
	@Autowired
    private HotelDtoMapper hotelDtoMapper;
	
	@Autowired
	private RecordMapper recordMapper;
	
	public String show(){
        return "hello world!";
    }

    public List<TestPOJO> showDao(int age){
        return testMapper.get(age);
    }
    
    public List<HotelDto> findByCountry(String country){
        return hotelDtoMapper.findByCountry(country);
    }
    
    public int insertRecord(Record record){
    	return recordMapper.insert(record);
    }
    
}
