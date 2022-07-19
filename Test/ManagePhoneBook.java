public class ManagePhoneBook {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        pb.insertPhone("Luong","0977194578");
        pb.insertPhone("Tien","0987654345");
        pb.insertPhone("Vu","0234567875");
        for (String pl : pb.PhoneList){
            System.out.println(pl);
        }
    }
}
