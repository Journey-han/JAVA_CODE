package ch02;

public class VIPCustomer extends Customer{

    // 담당 상담원
    private String agentID;
    // 할인률
    double salesRatio;

    public VIPCustomer() {
        customerGrade = "VIP";		// IF Customer 클래스에서 private으로 선언시 오류 발생. Customer의 클래스안에서만 사용할 수 있는 private이기 때문에.
        bonusRatio = 0.05;
        salesRatio = 0.1;
    }

    public String getAgentID() {
        return agentID;
    }

    public void setAgentID(String agentID) {
        this.agentID = agentID;
    }
}
