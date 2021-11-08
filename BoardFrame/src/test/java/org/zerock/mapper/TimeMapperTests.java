package org.zerock.mapper;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.service.BoardService;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
//JAVA용 @COntextConfiguration(classes = {org.zerock.config.RootConfig.class})
@Log4j
public class TimeMapperTests {
	
	
	//@Autowired
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	//@Autowired
	@Setter(onMethod_ = @Autowired)
	private BoardService service;
	
//	@Test
//	public void testGetData() {
//		mapper.getList().forEach(board -> log.info(board));
//	}
	
//	@Test
//	public void testInsert() {
//		BoardVO board = new BoardVO();
//		board.setTitle("새로 작성하는 글");
//		board.setContent("새로 작성하는 내용");
//		board.setWriter("글쓴이");
//		
////		mapper.insert(board);
//		mapper.insertSelectKey(board);
//		log.info(board);
//	}
//	@Test
//	public void testGetData() {
//		BoardVO board = mapper.read(5L);
//		
//		log.info(board);
//	}
	
//	@Test
//	public void testGetData() {
//		
//		log.info(mapper.delete(5L));
//	}
	
//	@Test
//	public void testUpdate() {
//		BoardVO board = new BoardVO();
//		board.setBno(1L);
//		board.setTitle("수정하는 글");
//		board.setContent("수정하는 내용");
//		board.setWriter("글쓴이");
//		int count = mapper.update(board);
////		mapper.insert(board);
//		
//		log.info("UPDATE COUNT : " + count);
//	}
	
	//serveice
	@Test
	public void testUpdate() {
//		//최초테스트
//		log.info(service);
//		assertNotNull(service);
		
		//insert Test
//		BoardVO board = new BoardVO();
//		board.setBno(1L);
//		board.setTitle("새로만든  글");
//		board.setContent("새로운  내용");
//		board.setWriter("글쓴이");
//		service.register(board);
//		
//		log.info("새로 생성되는 글 번호 ; " + board.getBno());
		
		//getList Test
		//service.getList().forEach(board -> log.info(board));
		
		//read Test
//		log.info(service.get(4L));
//		
//		//modify delete 
//		
//		log.info("REMOVE RESULT  : " + service.remove(2L));
//		
//		BoardVO board = service.get(1L);
//		
//		
//		if(board == null) {
//			return;
//		}
//		
//		board.setTitle("제목을 수정한다.");
//		
//		log.info("MODIFY RESULT : " + service.modify(board));
		
//		Criteria cri = new Criteria();
//		cri.setPageNum(3);
//		cri.setAmount(10);
//		List<BoardVO> list = mapper.getListWithPaging(cri);
//		list.forEach(board -> log.info(board));
//		
	}
	
	
	

}
