package io.javabrains.springbootstarter.topic;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework", "Spring Framework Description"),
			new Topic("java","Core java", "Core java Description"),
			new Topic("javascript","javascript","javascript description")
			));

	public List<Topic> getTopics() {
		return topics;
	}
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topic topic) {
		
		// TODO Auto-generated method stub
		topics.add(topic);
	}
	public void updateTopic(Topic topic , String id) {
		// TODO Auto-generated method stub
		
		for(int i =0 ;i< topics.size();i++)
		{
			Topic newTopic = topics.get(i);
			if(newTopic.getId().equals(id)) {
				topics.set(i, topic);
				
			}
		}
	 
	}
	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		topics.removeIf(t -> t.getId().equals(id));
		
	}
	
}
