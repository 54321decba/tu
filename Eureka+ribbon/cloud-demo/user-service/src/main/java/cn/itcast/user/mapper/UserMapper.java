package cn.itcast.user.mapper;

import org.apache.ibatis.annotations.Mapper;

import cn.itcast.user.pojo.User;

@Mapper
public interface UserMapper extends tk.mybatis.mapper.common.Mapper<User>{
}
