package uebung4.aufgabe4;

public class Person implements Comparable<Person> {
    private String name;
    private String vorname;
    private String plz;
    private String strasse;
    private int hausnr;

    public Person(String pName, String pVorname, String pLZ, String pStrasse, int pHausnr) {
        this.name = pName;
        this.vorname = pVorname;
        this.plz = pLZ;
        this.strasse = pStrasse;
        this.hausnr = pHausnr;
    }

    public int compareTo(Person o) {
        if(o == null) return -1;
        Person that = o;

        if(this.name.compareTo(that.name)<0) {
            return -1;
        } else if(this.name.compareTo(that.name)>0){
            return 1;
        }

        if(this. vorname.compareTo(that.vorname)<0) {
            return -1;
        } else if(this. vorname.compareTo(that.vorname)>0){
            return 1;
        }

        if(this.plz.compareTo(that.plz)<0) {
            return -1;
        } else if(this.plz.compareTo(that.plz)>0){
            return 1;
        }

        if(this.strasse.compareTo(that.strasse)<0) {
            return -1;
        } else if(this.strasse.compareTo(that.strasse)>0){
            return 1;
        }

        if(this.hausnr<that.hausnr) {
            return -1;
        } else if(this.hausnr>that.hausnr){
            return 1;
        }
        return 0;
    }

    /**
    public int compareTo(Person o) {
        if(o == null) return -1;
            Person that = o;
            if(this.name==that.name) {
                if(this.vorname==that.vorname) {
                    if(this.plz==that.plz) {
                        if(this.straße==that.straße) {
                            if(this.hausnr==that.hausnr) {
                                return 0;
                            }else if(this.hausnr < that.hausnr) {
                                return -1;
                            }else {
                                return 1;
                            }
                        }else if(this.straße.length() < that.straße.length()) {
                            return -1;
                        }else {
                            return 1;
                        }
                    }else if(this.plz < that.plz) {
                        return -1;
                    }else {
                        return 1;
                    }
                }else if(this.vorname.length() < that.vorname.length()) {
                    return -1;
                }else {
                    return 1;
                }
            }else if(this.name.length() < that.name.length()) {
                return -1;
            }else {
                return 1;
            }
    }
    **/

    public void printPerson() {
        System.out.println(this.name +" " +this.vorname +" " +this.plz +" " +this.strasse +" " +this.hausnr);
    }
}