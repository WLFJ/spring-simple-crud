package wyw1813004316qygl.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wyw1813004316qygl.dao.wyw_jobDao;
import wyw1813004316qygl.entity.wyw_People;
import wyw1813004316qygl.query.wyw_QueryPeople;
import wyw1813004316qygl.service.wyw_IPeopleService;

@Service
public class wyw_PeopleServiceImpl implements wyw_IPeopleService {
	
	@Autowired
	private wyw_jobDao wyw_jobdao;

	public boolean addPeople(wyw_People wyw_people) {
		return wyw_jobdao.addPeople(wyw_people) == 1;
	}

	public boolean deletePeople(Integer wyw_PeopleId) {
		wyw_QueryPeople qp = new wyw_QueryPeople();
		qp.setWyw_id(wyw_PeopleId);
		List<wyw_People> plist = wyw_jobdao.getPeople(qp);
		if(plist.size() != 1) return false;
		return wyw_jobdao.deletePeople(plist.get(0)) == 1;
	}

	public boolean updatePeople(wyw_People wyw_people) {
		return wyw_jobdao.updatePeople(wyw_people) == 1;
	}

	public wyw_People getPeopleById(Integer wyw_PeopleId) {
		wyw_QueryPeople qp = new wyw_QueryPeople();
		qp.setWyw_id(wyw_PeopleId);
		List<wyw_People> plist = wyw_jobdao.getPeople(qp);
		if(plist.size() != 1) return null;
		return plist.get(0);
	}

	public List<wyw_People> getPeoples() {
		wyw_QueryPeople qp = new wyw_QueryPeople();
		return wyw_jobdao.getPeople(qp);
	}

	public List<wyw_People> queryPeoples(wyw_QueryPeople wyw_queryPeople) {
		return wyw_jobdao.getPeople(wyw_queryPeople);
	}

}
