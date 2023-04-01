package Tema5Interfaces;

public class Eje5 {

    public interface CocheCRUD {
        void save();

        void delete();

        void findAll();


    }


    public static class CocheCRUDImple implements CocheCRUD{
        @Override
        public void save() {

        }

        @Override
        public void delete() {

        }

        @Override
        public void findAll() {
        }

        String save = "Save";
        String delete = "Delete";
        String findAll = "Find All";


        public String toString() {

            return "CocheCRUDImple"+
                    "\n"+save+
                    "\n"+delete+
                    "\n"+findAll;
        }

    }






        public static void main(String[] args) {
            CocheCRUD elCoche= new CocheCRUDImple();
            System.out.println(elCoche.toString());
        }

}
