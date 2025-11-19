package com.furkan.paynesweb.service;

import com.furkan.paynesweb.model.entity.ContactMessage;
import com.furkan.paynesweb.repository.ContactMessageRepository;
import org.springframework.stereotype.Service;

@Service
public class ContactMessageService {

    private final ContactMessageRepository contactMessageRepository;

    public ContactMessageService(ContactMessageRepository contactMessageRepository) {
        this.contactMessageRepository = contactMessageRepository;
    }

    public void saveMessage(ContactMessage message) {
        contactMessageRepository.save(message);
    }
}
