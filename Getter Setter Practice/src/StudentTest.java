import static org.junit.Assert.*;
import junit.framework.TestCase;

import org.junit.Test;


public class StudentTest extends TestCase
	{

	public void testStudent()
		{
		Student s = new Student("abc", 123);
		assertEquals("abc", s.getName());
		assertEquals(123, s.getScore());
		}
	
	public void testSetName()
		{
		Student s2 = new Student("abc", 123);
		s2.setName("def");
		assertEquals("def", s2.getName());
		}
	
	public void testSetScore()
		{
		Student s3 = new Student("abc", 123);
		s3.setScore(456);
		assertEquals(456, s3.getScore());
		}

	}
