package com.example.demo.mapper;


import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SampleMapper {
	Map<String, Object> selectSample(Map<String, Object> paramMap) throws Exception;
	List<Map<String, Object>> selectSampleList(Map<String, Object> paramMap) throws Exception;
	int insertSample(Map<String, Object> paramMap) throws Exception;
	int updateSample(Map<String, Object> paramMap) throws Exception;
	int deleteSample(Map<String, Object> paramMap) throws Exception;
}
