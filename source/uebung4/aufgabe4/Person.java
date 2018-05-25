package uebung4.aufgabe4;

public class Person implements Comparable {
    private String name;
    private String vorname;
    private int plz;
    private String straße;
    private int hausnr;

    public Person(String pName, String pVorname, int pLZ, String pStraße, int pHausnr) {
        this.name=pName;
        this.vorname=pVorname;
        this.plz=pLZ;
        this.straße=pStraße;
        this.hausnr=pHausnr;
    }

    public int compareTo(Object o) {
        if(o == null) return -1;
        if(o instanceof Person) {
            Person that = (Person) o;
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
        return -2;
    }

    public void printPerson() {
        System.out.println(this.name +" " +this.vorname +" " +this.plz +" " +this.straße +" " +this.hausnr);
    }
}