package com.example.demo.service;


import java.util.List;
import java.util.Map;


public interface SampleService {
	Map<String, Object> selectSample(Map<String, Object> paramMap) throws Exception;
	List<Map<String, Object>> selectSampleList(Map<String, Object> paramMap) throws Exception;
	Map<String, Object> insertSample(Map<String, Object> paramMap) throws Exception;
	Map<String, Object> updateSample(Map<String, Object> paramMap) throws Exception;
	Map<String, Object> deleteSample(Map<String, Object> paramMap) throws Exception;
}
