package com.app.dao;

import org.apache.ibatis.session.SqlSession;

import com.app.postTask.config.PostTaskConfig;
import com.app.vo.PostTaskVO;

public class PostTaskDAO {
	
	private SqlSession sqlSession;
	
	public PostTaskDAO() {
		sqlSession = PostTaskConfig.getSqlSessionFactory().openSession(true);
	}
	
//	게시물추가
	public void insert(PostTaskVO postTaskVO) {
		sqlSession.insert("postTask.insert", postTaskVO);
	}
	
	
//	게시물조회
	
//	게시물리스트
	
//	게시물수정
	
//	게시물삭제
	
}
