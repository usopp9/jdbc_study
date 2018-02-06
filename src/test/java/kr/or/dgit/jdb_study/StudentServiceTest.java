package kr.or.dgit.jdb_study;

import static org.junit.Assert.fail;

import java.util.List;

import org.apache.logging.log4j.core.util.Assert;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import kr.or.dgit.jdb_study.dto.Student;
import kr.or.dgit.jdb_study.service.StudentService;

public class StudentServiceTest {
	private static StudentService service;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		service = StudentService.getInstance();
	}

	@After
	public void tearDown() throws Exception {
		service=null;
	}

	@Test
	public void testFindAllStudents() {
		List<Student> list = service.findAllStudents();
		Assert.isNonEmpty(list);
		
	}

}
