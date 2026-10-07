/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentrankingsystem;

/**
 *
 * @author User
 */
public class TestClass { 
    
    public static void main(String[] args) {
        StudentRankingSystem[] studentsList = {
            new StudentRankingSystem("2025-50153", "Benny mark Dela Cerna", "BSIT", 86.50),
            new StudentRankingSystem("2026-0567", "Jessa Villa", "BSBA", 94.25),
            new StudentRankingSystem("2024-0764", "Ramon Magsaysayo", "BSIT", 87.56),
            new StudentRankingSystem("2025-7634", "Jerald Carias", "BSIT", 87.75),
            new StudentRankingSystem("2024-8634", "King Mendez", "BSIT", 91.50),
            new StudentRankingSystem("2025-5732", "Kian Tutan", "BSIT", 98.60),
            new StudentRankingSystem("2025-1242", "Mark Bautista", "BSBA",75.89 ),
            new StudentRankingSystem("2026-9734", "Liza Soberano", "BSCRIM", 90.75)
        };

        System.out.printf("%-12s %-20s %-10s %s%n", "Student ID", "Name", "Course", "Grade");
        System.out.println("-".repeat(55));

        for (StudentRankingSystem student : studentsList) {
            System.out.printf( "%-12s %-20s %-10s %.2f%n",
                student.getStudentId(),student.getName(),student.getCourse(),student.getGrade());
        }
    }
}



