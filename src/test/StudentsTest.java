package test;

import org.junit.Test;

import main.Students;

class StudentsTest {

    @Test
    void LoanLimitTest() {
        assertEquals("Loan Limit Reached", Students.getLoans<3);
    }
}