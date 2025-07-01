
package com.example.demo.service;

import com.example.demo.model.Subscriber;
import com.example.demo.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SubscriberService {
    @Autowired
    private SubscriberRepository subscriberRepository;

    public List<Subscriber> getAllSubscribers() {
        return subscriberRepository.findAll();
    }

    public void saveSubscriber(Subscriber subscriber) {
        subscriberRepository.save(subscriber);
    }
}
