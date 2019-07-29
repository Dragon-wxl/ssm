package com.csuft.wxl.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.csuft.wxl.pojo.Persion;
@Mapper
public interface PersionMap {
	List<Persion> selectAll();
}
