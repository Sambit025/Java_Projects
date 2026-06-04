class Bank{
    private String Bank_name;
    private String Center_ad = "Delhi";

    Bank(String name){
        this.Bank_name = name;
    }

    Bank(String name,String center){
        this.Bank_name = name;
        this.Center_ad = center;
    }
    String getBankName(){
        return this.Bank_name;
    }
    void setBankName(String name){
        this.Bank_name = name;
    }

    String getCenterAd(){
        return this.Center_ad;
    }
    void setCenterAd(String center){
        this.Center_ad = center;
    }
} 
class Branch{
    Bank b;
    private String BranchId;
    private String BranchAd;
    private String IFSC;
    Branch(Bank b1,String Id,String Ad,String ifsc){
        this.b = b1;
        this.BranchId = Id;
        this.BranchAd = Ad;
        this.IFSC = ifsc;
    }
    String getBankName(){
        return b.getBankName();
    }
    String getCenterAd(){
        return b.getCenterAd();
    }

    String getBranchId(){
        return this.BranchId;
    }
    void setBranchId(String id){
        this.BranchId = id;
    }

    String getBranchAd(){
        return this.BranchAd;
    }
    void setBranchAd(String ad){
        this.BranchAd = ad;
    }

    String getIFSC(){
        return this.IFSC;
    }
    void setIFSC(String ifsc){
        this.IFSC = ifsc;
    }
}
public class Main {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI","Mumbai");
        Branch br1 = new Branch(b1,"SBI001","Andheri","SBI0001");
        System.out.println("Bank Name: "+br1.getBankName());
        System.out.println("Center Address: "+br1.getCenterAd());
        br1.setBranchId("SBI002");
        br1.setBranchAd("Borivali");
        br1.setIFSC("SBI0002");
        System.out.println("Branch ID: "+br1.getBranchId());
        System.out.println("Branch Address: "+br1.getBranchAd());
        System.out.println("IFSC Code: "+br1.getIFSC());
    }
}