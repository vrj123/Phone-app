public class Landline implements Phone{

    private boolean isPowerOn;
    private String myPhoneNo;
    private boolean isRinging;
    public void setPowerOn(boolean powerOn) {
        isPowerOn = powerOn;
    }

    public void setMyPhoneNo(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return isPowerOn;
    }

    public String getMyPhoneNo() {
        return myPhoneNo;
    }

    public boolean ringing() {
        return isRinging;
    }

    public void setRinging(boolean ringing) {
        isRinging = ringing;
    }

    public Landline(String myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
        this.isRinging=false;
        this.isPowerOn=true;
    }


    @Override
    public boolean powerOn() {
        return isPowerOn;
    }

    @Override
    public void callNumber(String phoneNo) {
        if(isPowerOn){
            System.out.println("You are dialing "+phoneNo);
        }
        else{
            System.out.println("Power is off");
        }
        return;
    }

    @Override
    public void receiveCall(String phoneNo) {
        if(isPowerOn && myPhoneNo.equals(phoneNo)){
            isRinging=true;
            System.out.println("You are receiving call on number "+phoneNo);
        }
        else{
            System.out.println("Call not received");
        }
        return;
    }

    @Override
    public boolean answerCall() {
        if(isRinging) {
            System.out.println("You have answered the call");
            isRinging = false;
            return true;
        }
        System.out.println("There is some problem");
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
