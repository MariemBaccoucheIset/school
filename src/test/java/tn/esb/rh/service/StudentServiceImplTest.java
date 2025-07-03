package tn.esb.rh.service;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import tn.esb.rh.entity.Student;
import tn.esb.rh.repository.StudentRepository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
class StudentServiceImplTest {
    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    StudentServiceImpl studentService ;

    Student student = new Student(1, "name1","adress1", 20.00);
    List<Student> listStudents = new ArrayList<Student>() {
        {
            add(new Student(2, "name2","adress2", 30.00));
            add(new Student(3, "name3","adress3", 10.00));
        }
    };

    @BeforeAll
    public static void setUpClass() throws Exception {
    }

    @AfterAll
    public static void tearDownClass() throws Exception {
    }

    @BeforeEach
    public void setUp() throws Exception {
    }

    @AfterEach
    public void tearDown() throws Exception {
    }


    @Test
    @Order(2)
    public void testRetrieveAllStudents() {

        Mockito.when(studentRepository.findAll()).thenReturn(listStudents);

        List<Student> listU = studentService.getStudents();

        Assertions.assertEquals(2, listU.size());
    }


   /* @Test
    @Order(3)
    public void testAddStudent() {

        Mockito.when(studentRepository.save(Mockito.anyObject())).
                thenReturn(listStudents.add(student));


        studentService.registerStudent(student);

        Assertions.assertEquals(3, listStudents.size());
    }


    @Test
    @Order(4)
    public void testRemoveStudent() {


        Mockito.when(studentRepository.deleteById(listStudents.get(0).getRollNumber())).
         then(listStudents.remove(0));



        Assertions.assertEquals(2, listStudents.size());
    }


    */

    /**
     * Test of registerStudent method, of class StudentServiceImpl.
     */
    @Test
    public void testRegisterStudent() {
        System.out.println("registerStudent");
        Student student = null;
        StudentServiceImpl instance = new StudentServiceImpl();
        Student expResult = null;
        Student result = instance.registerStudent(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStudents method, of class StudentServiceImpl.
     */
    @Test
    public void testGetStudents() {
        System.out.println("getStudents");
        StudentServiceImpl instance = new StudentServiceImpl();
        List<Student> expResult = null;
        List<Student> result = instance.getStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteStudent method, of class StudentServiceImpl.
     */
    @Test
    public void testDeleteStudent() {
        System.out.println("deleteStudent");
        Integer id = null;
        StudentServiceImpl instance = new StudentServiceImpl();
        instance.deleteStudent(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateStudent method, of class StudentServiceImpl.
     */
    @Test
    public void testUpdateStudent() {
        System.out.println("updateStudent");
        Student student = null;
        StudentServiceImpl instance = new StudentServiceImpl();
        Student expResult = null;
        Student result = instance.updateStudent(student);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
