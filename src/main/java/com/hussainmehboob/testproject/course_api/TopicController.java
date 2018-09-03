package com.hussainmehboob.testproject.course_api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topics> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	
	@RequestMapping("/topics/{id}")
	public Topics getAllTopics(@PathVariable String id) {
		return topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public Boolean addTopic(@RequestBody Topics topic) {
		return topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public Boolean updateTopic(@RequestBody Topics topic, @PathVariable String id) {
		return topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public Boolean deleteTopic(@PathVariable String id) {
		return topicService.deleteTopic(id);
	}
	
}
