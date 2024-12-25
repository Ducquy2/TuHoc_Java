public class bai27_baitaptt {
    public static void main(String[] args) {
        String a = "D:/galialaptrinh/music/remix.mp3";
        int lasSlashIndex = a.lastIndexOf('/'); // tim dau slash"/" cuoi o dau
        String fileName = a.substring(lasSlashIndex+1); //trich loc chuoi con tu a
        System.out.println(fileName);

        // chi in ra remix
        int lasDotIndex = fileName.lastIndexOf('.');
        //trich loc chuoi tu fileName den sat vi tri Dot
        String nameOnly = fileName.substring(0,lasDotIndex);//lay tu ko den sat dau Dot
        System.out.println(nameOnly);

    }
}
