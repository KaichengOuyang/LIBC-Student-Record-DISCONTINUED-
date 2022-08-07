package Core.Objects;

public class Student {
    String name;
    String siblings;
    String parentPhoneNumber;
    String paymentDate;
    String typeOfPackage;
    String refillDate;
    //registered class
    //Auto populate spot during group lesson

    public Student(String name, String siblings, String parentPhoneNumber, String paymentDate, String typeOfPackage, String refillDate) {
        this.name = name;
        this.siblings = siblings;
        this.parentPhoneNumber = parentPhoneNumber;
        this.paymentDate = paymentDate;
        this.typeOfPackage = typeOfPackage;
    }

    public String getName() {
        return name;
    }

    public String getSiblings() {
        return siblings;
    }

    public String getParentPhoneNumber() {
        return parentPhoneNumber;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public String getTypeOfPackage() {
        return typeOfPackage;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSiblings(String siblings) {
        this.siblings = siblings;
    }

    public void setParentPhoneNumber(String parentPhoneNumber) {
        this.parentPhoneNumber = parentPhoneNumber;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public void setTypeOfPackage(String typeOfPackage) {
        this.typeOfPackage = typeOfPackage;
    }

    public String getRefillDate() {
        return refillDate;
    }

    public void setRefillDate(String refillDate) {
        this.refillDate = refillDate;
    }

    public String toString() {
        return "Name: " + name + "\nSiblings: " + siblings + "\nParent's Phone Number: " + parentPhoneNumber + "\nPayment Date: " + paymentDate + "\nType of Package: " + typeOfPackage;
    }
}
