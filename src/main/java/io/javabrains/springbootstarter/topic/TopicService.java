package io.javabrains.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> objTopic = new ArrayList<>( Arrays.asList(
			new Topic("1", "Spring Framework 1", "Description 1"),
			new Topic("2", "Spring Framework 2", "Description 2")
	));
	
	public List<Topic> getAllTopics() {
		return objTopic;
	}
	
	public Topic getTopic(String id) {
		return objTopic.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		objTopic.add(topic);
	}
}
