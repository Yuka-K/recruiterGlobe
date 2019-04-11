package com.example.recruiterglobe;

import java.util.zip.ZipEntry;

/**
 * Represents an item in a COACH
 */
public class PLAYER {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mid;

    /**
     * Item Id
     */
    @com.google.gson.annotations.SerializedName("Fname")
    private String mFname;

    @com.google.gson.annotations.SerializedName("Lname")
    private String mLname;

    @com.google.gson.annotations.SerializedName("Address")
    private String mAddress;

    @com.google.gson.annotations.SerializedName("City")
    private String mCity;

    @com.google.gson.annotations.SerializedName("Zipcode")
    private Integer mZipcode;

    @com.google.gson.annotations.SerializedName("Country")
    private String mCountry;

    @com.google.gson.annotations.SerializedName("NationalRanking")
    private String mNationalRanking;

    @com.google.gson.annotations.SerializedName("UTR")
    private String mUTR;

    @com.google.gson.annotations.SerializedName("Team")
    private String mTeam;

    @com.google.gson.annotations.SerializedName("Award")
    private String mAward;

    @com.google.gson.annotations.SerializedName("Email")
    private String mEmail;

    @com.google.gson.annotations.SerializedName("PhoneNumber")
    private Integer mPhoneNumber;

    @com.google.gson.annotations.SerializedName("Password")
    private String mPassword;

    @com.google.gson.annotations.SerializedName("ConfirmPassword")
    private String mConfirmPassword;

    /**
     * Indicates if the item is completed
     */
    @com.google.gson.annotations.SerializedName("complete")
    private boolean mComplete;

    /**
     * ToDoItem constructor
     */
    public PLAYER() {

    }

    @Override
    public String toString() {
        return getFname();
    }


    public PLAYER(String id, String Fname, String Lname, String Address, String City, Integer Zipcode, String Country, String NationalRanking, String UTR, String Team, String Award, String Email, Integer PhoneNumber, String Password, String ConfirmPassword) {
        this.setId(id);
        this.setFname(Fname);
        this.setLname(Lname);
        this.setAddress(Address);
        this.setCity(City);
        this.setZipcode(Zipcode);
        this.setCountry(Country);
        this.setNationalRanking(NationalRanking);
        this.setUTR(UTR);
        this.setTeam(Team);
        this.setAward(Award);
        this.setEmail(Email);
        this.setPhoneNumber(PhoneNumber);
        this.setPassword(Password);
        this.setConfirmPassword(ConfirmPassword);
    }

    /**
     * Returns the item text
     */
    public String getFname() { return mFname; }

    /**
     * Sets the item text
     *
     * @param Fname
     *            text to set
     */
    public final void setFname(String Fname) {
        mFname = Fname;
    }

    public String getLname() { return mLname; }
    public final void setLname(String Lname) { mLname = Lname; }

    public String getAddress() { return mAddress; }
    public final void setAddress(String Address) { mAddress = Address; }

    public String getCity() { return mCity; }
    public final void setCity(String City) { mCity = City; }

    public Integer getZipcode() { return mZipcode; }
    public final void setZipcode(Integer Zipcode) { mZipcode = Zipcode; }

    public String getCountry() { return mCountry; }
    public final void setCountry(String Country) { mCountry = Country; }

    public String getNationalRanking() { return mNationalRanking; }
    public final void setNationalRanking(String NationalRanking) { mNationalRanking = NationalRanking; }

    public String getUTR() { return mUTR; }
    public final void setUTR(String UTR) { mUTR = UTR; }

    public String getTeam() { return mTeam; }
    public final void setTeam(String Team) { mTeam = Team; }

    public String getAward() { return mAward; }
    public final void setAward(String Award) { mAward = Award; }

    public Integer getPhoneNumber() { return mPhoneNumber; }
    public final void setPhoneNumber(Integer PhoneNumber) { mPhoneNumber = PhoneNumber; }

    public String getEmail() { return mEmail; }
    public final void setEmail(String Email) { mEmail = Email; }

    public String getPassword() { return mPassword; }
    public final void setPassword(String Password) { mPassword = Password; }

    public String getmConfirmPassword() { return mConfirmPassword; }
    public final void setConfirmPassword(String ConfirmPassword) { mCountry = ConfirmPassword; }

    /**
     * Returns the item id
     */
    public String getId() {
        return mid;
    }

    /**
     * Sets the item id
     *
     * @param id
     *            id to set
     */
    public final void setId(String id) {
        mid = id;
    }

    /**
     * Indicates if the item is marked as completed
     */
    public boolean isComplete() {
        return mComplete;
    }

    /**
     * Marks the item as completed or incompleted
     */
    public void setComplete(boolean complete) {
        mComplete = complete;
    }

    @Override
    public boolean equals(Object o) {
        return o instanceof PLAYER && ((PLAYER) o).mid == mid;
    }
}