package net.javaguides.studentmanagmentsystem;

import net.javaguides.studentmanagmentsystem.entity.Student;
import net.javaguides.studentmanagmentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagmentSystemApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(StudentManagmentSystemApplication.class, args);
	}
@Autowired
private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
Student student1= new Student("Yoyo", "the Techie", "yotechie@gmail.com");
studentRepository.save(student1);

		Student student2= new Student("Queen", "Elizabeth", "queenlizzy@gmail.com");
		studentRepository.save(student2);

		Student student3= new Student("Barack", "Obama", "obeezy@gmail.com");
		studentRepository.save(student3);
	}
}
