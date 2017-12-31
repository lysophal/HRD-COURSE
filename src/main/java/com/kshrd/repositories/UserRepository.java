package com.kshrd.repositories;
import java.util.List;

import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.kshrd.model.User;
import com.kshrd.model.Role;

@Repository
public interface UserRepository {
	
	@Select("select id,username,password,status from users where username=#{username}")
	@Results({
		@Result(property="id", column="id"),
		@Result(property="roles",column="id", many=@Many(select="findRolesByUserId"))
	})
	public User findUserByName(String username);
	@Select("select r.id, r.role from roles r inner join users_roles ur on r.id=ur.role_id where ur.user_id=#{id}")
	public List<Role> findRolesByUserId(int id);
}
