package com.gupaoedu.vip.aop.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.gupaoedu.vip.model.Member;


@Service
public class MemberManagerService {
	
	/**
	 * 
	 * @param member
	 * @return
	 */
	public Member add(Member member){
		System.out.println("增加用户");
		return new Member();
	}
	
	
	public void remove(long id) throws Exception{
		System.out.println("删除用户");
		//return true;
		//throw new Exception("这是我们自己跑出来的异常");
	}
	
	
	public boolean modify(Member member){
		System.out.println("修改用户");
		return true;
	}
	
	public boolean query(String loginName){
		System.out.println("查询用户");
		return true;
	}
	
	
}
