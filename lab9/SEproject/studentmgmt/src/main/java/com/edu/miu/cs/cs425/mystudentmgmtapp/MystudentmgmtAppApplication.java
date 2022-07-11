package com.edu.miu.cs.cs425.mystudentmgmtapp;

import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Classroom;
import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Student;
import com.edu.miu.cs.cs425.mystudentmgmtapp.model.Transcript;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.ClassRoomRepository;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.StudentRepository;
import com.edu.miu.cs.cs425.mystudentmgmtapp.repository.TranscriptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class MystudentmgmtAppApplication implements CommandLineRunner {
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private TranscriptRepository transcriptRepository;
	@Autowired
	private ClassRoomRepository classRoomRepository;



	public static void main(String[] args) {
		SpringApplication.run(MystudentmgmtAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student1 = new Student(null, "665-61-7801", "shizi",
				"kelifa", "abudi",3.75, LocalDate.of(2020,4,2 ));
		studentRepository.save(student1);
		Student student2 = new Student(null, "099-91-4402", "ibu",
				"hmdad", "ibila",3.69, LocalDate.of(2020,8,1 ));
		studentRepository.save(student2);
		Student student3 = new Student(null, "0780-91-8803", "ermi",
				"solo", "kidane",4.00, LocalDate.of(2020,5,5 ));
		studentRepository.save(student3);
		Student student4 = new Student(null, "880-91-1104", "ruth",
				"miki", "semere",3.66, LocalDate.of(2020,9,12 ));
		studentRepository.save(student4);

		Transcript transcript1 = new Transcript(null,"Bsc Compro");
		transcriptRepository.save(transcript1);
		Transcript transcript2 = new Transcript(null,"accounting");
		transcriptRepository.save(transcript2);
		Transcript transcript3 = new Transcript(null,"MSD");
		transcriptRepository.save(transcript3);

		Classroom classRoom1 = new Classroom(null,"McLaughlin building", "M105");
		classRoomRepository.save(classRoom1);
		Classroom classRoom2 = new Classroom(null,"Verill building", "V47");
		classRoomRepository.save(classRoom2);
		Classroom classRoom3 = new Classroom(null,"Verril building", "V28");
		classRoomRepository.save(classRoom3);

	}
}
