package wyw1813004316qygl.service;

import java.util.List;

import wyw1813004316qygl.entity.wyw_People;
import wyw1813004316qygl.query.wyw_QueryPeople;

public interface wyw_IPeopleService {
	
	public boolean addPeople(wyw_People wyw_people);
	
	public boolean deletePeople(Integer wyw_PeopleId);
	
	public boolean updatePeople(wyw_People wyw_peoplw);
	
	public wyw_People getPeopleById(Integer wyw_PeopleId);
	
	public List<wyw_People> getPeoples();
	
	public List<wyw_People> queryPeoples(wyw_QueryPeople wyw_queryPeople);

}
