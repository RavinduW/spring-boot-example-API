package com.javatest.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	//member variable
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("SpringBoot","SpringBoot Framework","less configurations"),
			new Topic("Spring","Spring Framework","need more confiurations")
			));
	
	//return the topics
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	//return the matching topic details
	public Topic getTopic(String id) {
		
		ArrayList<Topic> tempTopics = new ArrayList<Topic>();
		
		for(int i=0; i<topics.size(); i++) {
			if(topics.get(i).getId().contentEquals(id)){
				tempTopics.add(topics.get(i));
				break;
			}	
		}
		
		return tempTopics.get(0);
			
	}
	
	//create topics
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	//update topic
	public void updateTopic(Topic topic, String id) {
		
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().contentEquals(id)){
				topics.set(i, topic);
				return;
			}
			
		}
	}
	
	//delete topic
	public void deleteTopic(String id) {
		
		for(int i=0;i<topics.size();i++) {
			if(topics.get(i).getId().contentEquals(id)){
				topics.remove(i);
				return;
			}
			
		}
	}
	
}
