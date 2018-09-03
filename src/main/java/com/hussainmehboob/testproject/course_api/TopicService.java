package com.hussainmehboob.testproject.course_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topics> lstTopics = new ArrayList<Topics>(Arrays.asList(
			new Topics("spring", "Spring Framework", "Spring Framework Description"),
			new Topics("java", "Java Framework", "Java Framework Description"),
			new Topics("android", "Adroid Framework", "Android Framework Description")
			)) ;
	
	public List<Topics> getAllTopics(){
		return lstTopics;
	}

	public Topics getTopic(String id) {
		return lstTopics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public Boolean addTopic(Topics topic) {
		return lstTopics.add(topic);
	}

	public Boolean updateTopic(Topics topic, String id) {
		for(int i=0; i<lstTopics.size(); i++) {
			if(lstTopics.get(i).getId().equals(id)) {
				lstTopics.set(i, topic);
				return true;
			}
		}
		return false;
	}

	public Boolean deleteTopic(String id) {
		lstTopics.removeIf(t -> t.getId().equals(id));
		return null;
	}
	
}
