package com.carf.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carf.domain.Board;

@RestController
@RequestMapping("/boards")
public class BoardController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@RequestMapping(value="",method=RequestMethod.GET)
	public ResponseEntity<List<Board>> list(){
		logger.info("list");
		List<Board> boardList = new ArrayList<>();
		ResponseEntity<List<Board>> entity = new ResponseEntity<>(boardList,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="",method=RequestMethod.POST)
	public ResponseEntity<String> register(@RequestBody Board board){
		logger.info("register");
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/{boardNo}",method=RequestMethod.GET)
	public ResponseEntity<Board> read(@PathVariable("boardNo") int boardNo){
		logger.info("read");
		Board board = new Board();
		//board.setBoardNo(1);
		ResponseEntity<Board> entity = new ResponseEntity<>(board,HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/{boardNo}",method=RequestMethod.DELETE)
	public ResponseEntity<String> remove(@PathVariable("boardNo")int boardNo){
		logger.info("remove");
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
		return entity;
	}
	
	@RequestMapping(value="/{boardNo}",method=RequestMethod.PUT)
	public ResponseEntity<String> modify(@PathVariable("boardNo")int boardNo,@RequestBody Board board){
		logger.info("modify");
		ResponseEntity<String> entity = new ResponseEntity<>("SUCCESS",HttpStatus.OK);
		return entity;
	}
}
