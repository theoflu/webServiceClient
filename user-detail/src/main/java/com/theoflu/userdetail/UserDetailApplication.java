package com.theoflu.userdetail;

import com.theoflu.userdetail.model.UserDetails;
import com.theoflu.userdetail.repository.UserDetailRepository;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class UserDetailApplication  implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(UserDetailApplication.class, args);
	}
	private final UserDetailRepository userDetailRepository;
	@Override
	public void run(String... args) throws Exception {
		UserDetails user=	UserDetails.builder().address("adaanna")
				.email("yok@gmail.com")
				.identityId("0000000")
				.phoneNumber("505253512322")
				.build();
		userDetailRepository.save(user);

	}
}
