package com.example.demo.controller;


import java.util.Map;

import javax.annotation.Resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.SampleService;


@RestController
@RequestMapping("/sample")
public class SampleController {
	@Resource(name="sampleService")
	SampleService sampleService;
	
	@RequestMapping(value = "/selectSample", method = RequestMethod.GET)
	public ResponseEntity<?> selectSample(@RequestParam Map<String, Object> paramMap) throws Exception {
		
		return ResponseEntity.ok(sampleService.selectSample(paramMap));
	}
	
	@RequestMapping(value = "/selectSampleList", method = RequestMethod.GET)
	public ResponseEntity<?> selectSampleList(@RequestParam Map<String, Object> paramMap) throws Exception {
		
		return ResponseEntity.ok(sampleService.selectSampleList(paramMap));
	}
	
	@RequestMapping(value = "/insertSample", method = RequestMethod.POST)
	public ResponseEntity<?> insertSample(@RequestParam Map<String, Object> paramMap) throws Exception {
		
		return ResponseEntity.ok(sampleService.insertSample(paramMap));
	}
	
	@RequestMapping(value = "/updateSample", method = RequestMethod.POST)
	public ResponseEntity<?> updateSample(@RequestParam Map<String, Object> paramMap) throws Exception {
		
		return ResponseEntity.ok(sampleService.updateSample(paramMap));
	}
	
	@RequestMapping(value = "/deleteSample", method = RequestMethod.POST)
	public ResponseEntity<?> deleteSample(@RequestParam Map<String, Object> paramMap) throws Exception {
		
		return ResponseEntity.ok(sampleService.deleteSample(paramMap));
	}
}
