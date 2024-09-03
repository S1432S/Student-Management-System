package com.example.sms.user;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.sms.exception.RatingNotFoundByIdException;
import com.example.sms.exception.StudentNotFoundByIdException;
import com.example.sms.exception.TrainerNotFoundByIdException;
import com.example.sms.rating.Rating;
import com.example.sms.rating.RatingMapper;
import com.example.sms.rating.RatingRepository;
import com.example.sms.rating.RatingRequest;
import com.example.sms.rating.RatingResponse;
import com.example.sms.security.RegistrationRequest;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService 
{
	private UserRepository userRepository;
	private UserMapper userMapper;
	private RatingRepository ratingRepository;
	private RatingMapper ratingMapper;
	
	public UserResponse saveUser(RegistrationRequest registrationRequest,UserRole role) {
		User user = null;
		switch (role) {
		case ADMIN -> user = new Admin();
		case HR -> user = new HR();
		case STUDENT -> user = new Student();
		case TRAINER -> user = new Trainer();
		default -> throw new IllegalArgumentException("Unexpected value: " + role);
		}

		if(user != null) {
			user = userMapper.mapToUserEntity(registrationRequest, user);
			user.setRole(role);
			user = userRepository.save(user);
		}

		return userMapper.mapToUserResponse(user);
	}

	public UserResponse updateTrainer(TrainerRequest trainerRequest,String userId) {
		return userRepository.findById(userId).map(user->{
			userMapper.mapToTrainerEntity(trainerRequest, (Trainer)user);
			user=userRepository.save(user);
			return userMapper.mapToTrainerResponse((Trainer)user);
		}).orElseThrow(()-> new TrainerNotFoundByIdException("failed to update the trainer"));


	}
	public RatingResponse updateStudentRating(RatingRequest ratingRequest,String ratingId)
	{
		return ratingRepository.findById(ratingId).map(rating->{
			ratingMapper.mapToRating(ratingRequest, rating);
			rating=ratingRepository.save(rating);
			return ratingMapper.mapToRatingResponse(rating);
		}).orElseThrow(()-> new RatingNotFoundByIdException("failed to update the rating"));
	}

	public List<RatingResponse> getStudentRatings(String studentId)
	{
		return userRepository.findById(studentId).map(user->{
			return ((Student)user).getRatings().stream()
					.map(rating -> ratingMapper.mapToRatingResponse(rating))
					.toList();
		}).orElseThrow(()-> new StudentNotFoundByIdException("failed to find the student"));

	}
	public StudentResponse updateStudent(StudentRequest studentRequest, String userId) {
			
		return userRepository.findById(userId).map(user->{
			userMapper.mapToStudentEntity(studentRequest, (Student)user);
			user=userRepository.save(user);
			return userMapper.mapToStudentResponse((Student)user);
		}).orElseThrow(()->new StudentNotFoundByIdException("failed to update the student"));
	}

	public StudentResponse updateStudentStack(String userId, Stack stack) {

		return userRepository.findById(userId).map(user->{
			Student student=(Student)user;
			student.getStack().getSubjects().forEach(subject->{
				Rating rating=new Rating();
				rating.setSubject(subject);
				rating.setStudent(student);
				ratingRepository.save(rating);});
			student.setStack(stack);
			user=userRepository.save(student);
			return userMapper.mapToStudentResponse(student);
		}).orElseThrow(()->new StudentNotFoundByIdException("failed to update the teck stack"));

	}
	
}
