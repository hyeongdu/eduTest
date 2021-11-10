package org.zerock.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.zerock.domain.SampleVO;
import org.zerock.domain.Ticket;

import lombok.extern.log4j.Log4j;

@RestController
@RequestMapping("/sample")
@Log4j
public class SampleController {
	
	@GetMapping(value = "/getText", produces = "text/plain; charset=UTF-8")
	public String getText() {
		log.info("MIME TYPE" + MediaType.TEXT_PLAIN_VALUE);
		
		return "안녕하세요";
	}
	
	//produces 는 생략가능하다 
	//APPLICATION_JSON_UTF8_VALUE 스프링 5.2부터 Deprevated됨 
	@GetMapping(value = "/getSample", produces = {MediaType.APPLICATION_JSON_UTF8_VALUE,
													MediaType.APPLICATION_XML_VALUE})
	public SampleVO getSample() {
		log.info("MIME TYPE" + MediaType.TEXT_PLAIN_VALUE);
		
		return new SampleVO(112, "스타", "로드");
	}
	
	//확장자를 .json으로 하면 제이슨 형식으로 기본은 xml
	@GetMapping(value = "/getList")
	public List<SampleVO> getList() {
		log.info("MIME TYPE" + MediaType.TEXT_PLAIN_VALUE);
		
		return IntStream.range(1, 10).mapToObj(i -> new SampleVO(i, i + "First", i + "Last"))
					.collect(Collectors.toList());
	}
	
	//Key에 속하는 데이터는 Xml로 변환되는 겨웅에 태그의 이름이되기 때문에 문자열로 지정한다. 
	@GetMapping(value = "/getMap")
	public Map<String, SampleVO> getMap() {
		log.info("MIME TYPE" + MediaType.TEXT_PLAIN_VALUE);
		
		Map<String, SampleVO> map = new HashMap<>();
		map.put("First", new SampleVO(111, "그루트", "주니어"));
		map.put("second", new SampleVO(111, "그루트", "주니어"));
		
		return map;
	}
	
	@GetMapping(value = "/check", params = {"height", "weight"})
	public ResponseEntity<SampleVO> check(Double height, Double weight) {
		
		SampleVO vo = new SampleVO(0, "" + height, ""  + weight);
		
		ResponseEntity<SampleVO> result = null;
		
		if(height < 150) {
			result = ResponseEntity.status(HttpStatus.BAD_GATEWAY).body(vo);
		} else {
			result = ResponseEntity.status(HttpStatus.OK).body(vo);
		}
		
		return result;
	}
	
	//PathVariable을 이용할 때 int double 과 같은 기본 자료형은 사용할 수 없다. 
	@GetMapping(value = "/product/{cat}/{pid}")
	public String[] getPath(@PathVariable("cat") String cat,
							@PathVariable("pid") String pid) {
		
	
		return new String[] {"category : " + cat, "projuctid : " + pid};
	}
	
	//PostMapping으로 처리하는데 RequestBody는 말 그대로 request요청 body내용을 처리하기 때문이다. 
	@PostMapping(value = "/ticket")
	public Ticket convert(@RequestBody Ticket ticket) {
		log.info("convert......ticket" + ticket);
		
		
		return ticket;
	}

}
