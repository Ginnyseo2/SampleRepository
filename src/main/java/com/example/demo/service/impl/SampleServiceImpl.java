package com.example.demo.service.impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.example.demo.mapper.SampleMapper;
import com.example.demo.service.SampleService;

@Service(value="sampleService")
public class SampleServiceImpl implements SampleService {
	@Resource(name="sampleMapper")
	SampleMapper sampleMapper;

	@Override
	public Map<String, Object> selectSample(Map<String, Object> paramMap) throws Exception {
		
		return sampleMapper.selectSample(paramMap);
	}

	@Override
	public List<Map<String, Object>> selectSampleList(Map<String, Object> paramMap) throws Exception {
		
		return sampleMapper.selectSampleList(paramMap);
	}

	@Override
	public Map<String, Object> insertSample(Map<String, Object> paramMap) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("cnt", sampleMapper.insertSample(paramMap));
		
		return result;
	}

	@Override
	public Map<String, Object> updateSample(Map<String, Object> paramMap) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("cnt", sampleMapper.updateSample(paramMap));
		
		return result;
	}

	@Override
	public Map<String, Object> deleteSample(Map<String, Object> paramMap) throws Exception {
		Map<String, Object> result = new HashMap<>();
		result.put("cnt", sampleMapper.deleteSample(paramMap));
		
		return result;
		
	}
	
}
