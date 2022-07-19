import java.util.ArrayList;

public class PhoneBook extends Phone {
    ArrayList<String> PhoneList = new ArrayList<>();

    @Override
    void insertPhone(String name, String phone) {
        if (PhoneList.isEmpty()) {
            PhoneList.add(name + "," + phone);
        } else {
            boolean timthay = false;
            for (String pb : PhoneList) {
                if (pb.contains(name + ",")) {
                    timthay = true;
                    if (pb.contains(phone)) {
                        PhoneList.set(PhoneList.indexOf(pb), pb + " : " + phone);
                    }
                    break;
                }
            }
            if (timthay) {
                PhoneList.add(name + "," + phone);
            }
        }
    }

    @Override
    void removePhone(String name) {

    }

    @Override
    void updatePhone(String name, String newphone) {

    }

    @Override
    void searchPhone(String name) {

    }

    @Override
    void sort() {

    }
}
