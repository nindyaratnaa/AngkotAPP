import java.util.*;

public class DataProvider {
    public static List<Angkot> getData() {
        List<Angkot> list = new ArrayList<>();

        Angkot adl = new Angkot("ADL (Arjosari – Dinoyo – Landungsari)");
        adl.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        adl.tambahPemberhentian(new Pemberhentian("Dinoyo", "06:10, 07:10, 08:10"));
        adl.tambahPemberhentian(new Pemberhentian("Terminal Landungsari", "06:25, 07:25, 08:25"));
        list.add(adl);

        Angkot ag = new Angkot("AG (Arjosari – Gadang – Hamid Rusdi)");
        ag.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        ag.tambahPemberhentian(new Pemberhentian("Gadang", "06:20, 07:20, 08:20"));
        ag.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:35, 07:35, 08:35"));
        list.add(ag);

        Angkot al = new Angkot("AL (Arjosari – Landungsari)");
        al.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        al.tambahPemberhentian(new Pemberhentian("Terminal Landungsari", "06:25, 07:25, 08:25"));
        list.add(al);

        Angkot at = new Angkot("AT (Arjosari - Tidar)");
        at.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        at.tambahPemberhentian(new Pemberhentian("Tidar", "06:15, 07:15, 08:15"));
        list.add(at);

        Angkot abg = new Angkot("ABG (Arjosari - Borobudur - Gadang)");
        abg.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        abg.tambahPemberhentian(new Pemberhentian("Borobudur", "06:10, 07:10, 08:10"));
        abg.tambahPemberhentian(new Pemberhentian("Gadang", "06:20, 07:20, 08:20"));
        list.add(abg);

        Angkot amh = new Angkot("AMH (Arjosari - Mergosono - Gadang - Hamid Rusdi)");
        amh.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        amh.tambahPemberhentian(new Pemberhentian("Mergosono", "06:10, 07:10, 08:10"));
        amh.tambahPemberhentian(new Pemberhentian("Gadang", "06:20, 07:20, 08:20"));
        amh.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:35, 07:35, 08:35"));
        list.add(amh);

        Angkot ajh = new Angkot("AJH (Arjosari - Janti - Gadang - Hamid Rusdi)");
        ajh.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        ajh.tambahPemberhentian(new Pemberhentian("Janti", "06:10, 07:10, 08:10"));
        ajh.tambahPemberhentian(new Pemberhentian("Gadang", "06:20, 07:20, 08:20"));
        ajh.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:35, 07:35, 08:35"));
        list.add(ajh);

        Angkot asd = new Angkot("ASD (Arjosari - Sarangan - Dieng)");
        asd.tambahPemberhentian(new Pemberhentian("Terminal Arjosari", "06:00, 07:00, 08:00"));
        asd.tambahPemberhentian(new Pemberhentian("Sarangan", "06:10, 07:10, 08:10"));
        asd.tambahPemberhentian(new Pemberhentian("Dieng", "06:20, 07:20, 08:20"));
        list.add(asd);

        Angkot hl = new Angkot("HL (Hamid Rusdi - Gadang - Landungsari)");
        hl.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:00, 07:00, 08:00"));
        hl.tambahPemberhentian(new Pemberhentian("Gadang", "06:10, 07:10, 08:10"));
        hl.tambahPemberhentian(new Pemberhentian("Terminal Landungsari", "06:25, 07:25, 08:25"));
        list.add(hl);

        Angkot ckl = new Angkot("CKL (Cemorokandang - Landungsari)");
        ckl.tambahPemberhentian(new Pemberhentian("Terminal Cemorokandang", "06:00, 07:00, 08:00"));
        ckl.tambahPemberhentian(new Pemberhentian("Terminal Landungsari", "06:25, 07:25, 08:25"));
        list.add(ckl);

        Angkot hml = new Angkot("HML (Hamid Rusdi - Gadang - Mergan - Landungsari)");
        hml.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:00, 07:00, 08:00"));
        hml.tambahPemberhentian(new Pemberhentian("Gadang", "06:10, 07:10, 08:10"));
        hml.tambahPemberhentian(new Pemberhentian("Mergan", "06:20, 07:20, 08:20"));
        hml.tambahPemberhentian(new Pemberhentian("Terminal Landungsari", "06:35, 07:35, 08:35"));
        list.add(hml);

        Angkot hm = new Angkot("HM (Hamid Rusdi - Gadang - Madyopuro)");
        hm.tambahPemberhentian(new Pemberhentian("Terminal Hamid Rusdi", "06:00, 07:00, 08:00"));
        hm.tambahPemberhentian(new Pemberhentian("Gadang", "06:10, 07:10, 08:10"));
        hm.tambahPemberhentian(new Pemberhentian("Madyopuro", "06:20, 07:20, 08:20"));
        list.add(hm);

        Angkot mks = new Angkot("MKS (Mulyorejo - Klayatan - Sukun)");
        mks.tambahPemberhentian(new Pemberhentian("Terminal Mulyorejo", "06:00, 07:00, 08:00"));
        mks.tambahPemberhentian(new Pemberhentian("Klayatan", "06:10, 07:10, 08:10"));
        mks.tambahPemberhentian(new Pemberhentian("Sukun", "06:20, 07:20, 08:20"));
        list.add(mks);

        Angkot tst = new Angkot("TST (Tlogowaru - Sarangan - Tasikmadu)");
        tst.tambahPemberhentian(new Pemberhentian("Terminal Tlogowaru", "06:00, 07:00, 08:00"));
        tst.tambahPemberhentian(new Pemberhentian("Sarangan", "06:10, 07:10, 08:10"));
        tst.tambahPemberhentian(new Pemberhentian("Tasikmadu", "06:20, 07:20, 08:20"));
        list.add(tst);

        Angkot tsg = new Angkot("TSG (Tawangmangu - Jl. Soehat - Gasek)");
        tsg.tambahPemberhentian(new Pemberhentian("Terminal Tawangmangu", "06:00, 07:00, 08:00"));
        tsg.tambahPemberhentian(new Pemberhentian("Jl. Soehat", "06:10, 07:10, 08:10"));
        tsg.tambahPemberhentian(new Pemberhentian("Gasek", "06:20, 07:20, 08:20"));
        list.add(tsg);

        return list;
    }
}
