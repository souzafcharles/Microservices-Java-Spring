package com.souza.charles.user.services;
 /*
  Tutorial: Microservices in Practice with Java Spring
  Instructor: Michelli Brito - Decoder.
  Project adapted by: Charles Fernandes de Souza
  Date: February 21, 2025
 */

import com.souza.charles.user.dtos.UserRecordDTO;
import com.souza.charles.user.model.UserModel;
import com.souza.charles.user.repositories.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UserService {

    final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public UserModel save(UserRecordDTO userRecordDTO) {
        UserModel userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDTO, userModel);
        return userRepository.save(userModel);
    }

    @Transactional
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Transactional
    public Optional<UserModel> findById(UUID id) {
        return userRepository.findById(id);
    }

    @Transactional
    public Optional<UserModel> update(UUID id, UserRecordDTO userRecordDTO) {
        return userRepository.findById(id).map(user -> {
            BeanUtils.copyProperties(userRecordDTO, user, "userId");
            return userRepository.save(user);
        });
    }

    @Transactional
    public boolean delete(UUID id) {
        return userRepository.findById(id).map(user -> {
            userRepository.delete(user);
            return true;
        }).orElse(false);
    }
}
