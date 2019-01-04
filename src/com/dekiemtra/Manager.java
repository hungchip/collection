package com.dekiemtra;

import java.util.ArrayList;
import java.util.List;

public class Manager {
   // private int numberOfTeacher;
     List<Teacher> teachers = new ArrayList<>();
   //private List<GiangVienBanCoHuu> giangVienBanCoHuus = new ArrayList<>();
   //private List<GiangVienCoHuu> giangVienCoHuus = new ArrayList<>();
    // private List<GiangVienThinhGiang> giangVienThinhGiangs = new ArrayList<>();

    public Manager() {
        this.teachers = new ArrayList<>();
    }

//    public boolean addTeacher(Teacher teacher){
//        for (GiangVienCoHuu giangVienCoHuu: giangVienCoHuus) {
//            if(((GiangVienCoHuu)teacher).getiDTeacher().equals(teacher.getiDTeacher())){
//                return false;
//            }
//        }
//        giangVienCoHuus.add((GiangVienCoHuu)teacher);
//        return true;
//        for (GiangVienThinhGiang giangVienThinhGiang : giangVienThinhGiangs) {
//
//        }
//    }
    public boolean addTeacher( Teacher teacher){
        for (Teacher t: teachers)  {
            if (t.getiDTeacher().equals(teacher.getiDTeacher())){
                return false;
            }
        }
        teachers.add(teacher);
        return true;
    }

//    public void addListTeacher(Teacher teacher){
//        for (Teacher t : teachers) {
//            if (addTeacher(teacher)){
//                if (((GiangVienCoHuu)teacher) instanceof GiangVienCoHuu){
//
//                }
//            }
//        }
//    }
    public void outputListTeacher(){
        for (Teacher teacher: teachers) {
            teacher.outputTeacher();
        }
    }
}
