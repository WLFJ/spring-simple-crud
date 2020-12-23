package wyw1813004316qygl.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import wyw1813004316qygl.entity.wyw_People;
import wyw1813004316qygl.query.wyw_QueryPeople;

@Mapper
public interface wyw_jobDao {
	
	public Integer addPeople(wyw_People wyw_people);

	public Integer deletePeople(wyw_People wyw_people);
	
	public Integer updatePeople(wyw_People wyw_people);

	public List<wyw_People> getPeople(wyw_QueryPeople wyw_querypeople);
}
