package com.app.postTask.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostTaskDAO;
import com.app.post.Action;
import com.app.post.Result;
import com.app.vo.PostTaskVO;

public class PostTaskWriteOkController implements Action {

	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
		Result result = new Result();
		PostTaskDAO postTaskDAO = new PostTaskDAO();
		PostTaskVO postTaskVO = new PostTaskVO();
		
		postTaskVO.setTitle(req.getParameter("postTitle"));
		postTaskVO.setContent(req.getParameter("postContent"));
		
		postTaskDAO.insert(postTaskVO);
		
		result.setRedirect(true);
		result.setPath("list.postTask");
		
		return result;
	}

}
