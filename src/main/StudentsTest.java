package main;

import static org.junit.jupiter.api.Assertions.*;

class StudentsTest {

    @org.junit.jupiter.api.Test
    void LoanLimitTest() {
        assertEquals("Loan Limit Reached", Students.getLoans<3);
    }
}