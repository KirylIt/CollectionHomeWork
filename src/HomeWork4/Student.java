package HomeWork4;

public class Student {
         String name;
         private int group;
         int course;
         private int markLang;
         private int  markMath;
         private int markBio;
         private int markSport;
         private int markSred = (markBio + markLang + markMath + markSport) / 4;

        public Student(int course, String name) {
            this.course = course;
            this.name = name;
        }

        public double getMarkSred() {
            return markSred;
        }

        public void setMarkSred(int markSred) {
            this.markSred = markSred;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getGroup() {
            return group;
        }

        public void setGroup(int group) {
            this.group = group;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public int getMarkLang() {
            return markLang;
        }

        public void setMarkLang(int markLang) {
            this.markLang = markLang;
        }

        public int getMarkMath() {
            return markMath;
        }

        public void setMarkMath(int markMath) {
            this.markMath = markMath;
        }

        public int getMarkBio() {
            return markBio;
        }

        public void setMarkBio(int markBio) {
            this.markBio = markBio;
        }

        public int getMarkSport() {
            return markSport;
        }

        public void setMarkSport(int markSport) {
            this.markSport = markSport;
        }

        Student(String name, int group, int course, int markLang, int markMath, int markBio, int markSport) {
            this.name = name;
            this.group = group;
            this.course = course;
            this.markLang = markLang;
            this.markMath = markMath;
            this.markBio = markBio;
            this.markSport = markSport;
            this.markSred = (markBio + markLang + markMath + markSport) / 4;
        }
    @Override
    public String toString() {
        return
                " name = " + name +
                ", group= " + group +
                ", course= " + course +
                ", markLang= " + markLang +
                ", markMath= " + markMath +
                ", markBio= " + markBio +
                ", markSport= " + markSport +
                ", markSred= " + markSred
                ;
    }
}
