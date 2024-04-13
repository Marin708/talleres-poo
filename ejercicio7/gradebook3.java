package ejercicio7;

public class gradebook3 {


        private String courseName;
        private int total;
        private int gradeCounter;
        private int aCount;
        private int bCount;
        private int cCount;
        private int dCount;
        private int fCount;


        /**
         * @return the courseName
         */
        public String getCourseName() {
            return courseName;
        }

        /**
         * @param courseName the courseName to set
         */
        public void setCourseName(String courseName) {
            this.courseName = courseName;
        }

        public gradebook3() {
            // TODO Auto-generated constructor stub
        }

        public String displayMessage() {
            return "Bienvenido al sistema de planillas del curso" + getCourseName();
        }
    }


