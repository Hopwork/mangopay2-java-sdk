package com.mangopay.entities;

import com.mangopay.core.enumerations.CountryIso;
import com.mangopay.core.enumerations.LegalPersonType;

import java.util.ArrayList;

import static com.mangopay.core.enumerations.PersonType.LEGAL;

/**
 * Compatibility version of {@link UserLegal}.
 * Created by thepa on 05-Jul-17.
 */
public class LegacyUserLegal extends User {

    /**
     * Name of this user.
     */
    public String Name;

    /**
     * Type of legal user.
     */
    public LegalPersonType LegalPersonType;

    /**
     * Headquarters address.
     */
    public String HeadquartersAddress;

    /**
     * Legal representative first name.
     */
    public String LegalRepresentativeFirstName;

    /**
     * Legal representative last name.
     */
    public String LegalRepresentativeLastName;

    /**
     * Legal representative address.
     */
    public String LegalRepresentativeAddress;

    /**
     * Legal representative email.
     */
    public String LegalRepresentativeEmail;

    /**
     * Legal representative birthday.
     */
    public long LegalRepresentativeBirthday;

    /**
     * Legal representative nationality.
     */
    public CountryIso LegalRepresentativeNationality;

    /**
     * Legal representative country of residence.
     */
    public CountryIso LegalRepresentativeCountryOfResidence;

    /**
     * Statute.
     */
    public String Statute;

    /**
     * Proof of registration.
     */
    public String ProofOfRegistration;

    /**
     * Shareholder declaration.
     */
    public String ShareholderDeclaration;

    /**
     * Instantiates new LegacyUserLegal object.
     */
    public LegacyUserLegal() {
        setPersonType(LEGAL);
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public LegalPersonType getLegalPersonType() {
        return LegalPersonType;
    }

    public void setLegalPersonType(LegalPersonType legalPersonType) {
        this.LegalPersonType = legalPersonType;
    }

    public String getHeadquartersAddress() {
        return HeadquartersAddress;
    }

    public void setHeadquartersAddress(String headquartersAddress) {
        this.HeadquartersAddress = headquartersAddress;
    }

    public String getLegalRepresentativeFirstName() {
        return LegalRepresentativeFirstName;
    }

    public void setLegalRepresentativeFirstName(String legalRepresentativeFirstName) {
        this.LegalRepresentativeFirstName = legalRepresentativeFirstName;
    }

    public String getLegalRepresentativeLastName() {
        return LegalRepresentativeLastName;
    }

    public void setLegalRepresentativeLastName(String legalRepresentativeLastName) {
        this.LegalRepresentativeLastName = legalRepresentativeLastName;
    }

    public String getLegalRepresentativeAddress() {
        return LegalRepresentativeAddress;
    }

    public void setLegalRepresentativeAddress(String legalRepresentativeAddress) {
        this.LegalRepresentativeAddress = legalRepresentativeAddress;
    }

    public String getLegalRepresentativeEmail() {
        return LegalRepresentativeEmail;
    }

    public void setLegalRepresentativeEmail(String legalRepresentativeEmail) {
        this.LegalRepresentativeEmail = legalRepresentativeEmail;
    }

    public long getLegalRepresentativeBirthday() {
        return LegalRepresentativeBirthday;
    }

    public void setLegalRepresentativeBirthday(long legalRepresentativeBirthday) {
        this.LegalRepresentativeBirthday = legalRepresentativeBirthday;
    }

    public CountryIso getLegalRepresentativeNationality() {
        return LegalRepresentativeNationality;
    }

    public void setLegalRepresentativeNationality(CountryIso legalRepresentativeNationality) {
        this.LegalRepresentativeNationality = legalRepresentativeNationality;
    }

    public CountryIso getLegalRepresentativeCountryOfResidence() {
        return LegalRepresentativeCountryOfResidence;
    }

    public void setLegalRepresentativeCountryOfResidence(CountryIso legalRepresentativeCountryOfResidence) {
        this.LegalRepresentativeCountryOfResidence = legalRepresentativeCountryOfResidence;
    }

    public String getStatute() {
        return Statute;
    }

    public void setStatute(String statute) {
        this.Statute = statute;
    }

    public String getProofOfRegistration() {
        return ProofOfRegistration;
    }

    public void setProofOfRegistration(String proofOfRegistration) {
        this.ProofOfRegistration = proofOfRegistration;
    }

    public String getShareholderDeclaration() {
        return ShareholderDeclaration;
    }

    public void setShareholderDeclaration(String shareholderDeclaration) {
        this.ShareholderDeclaration = shareholderDeclaration;
    }

    /**
     * Gets the collection of read-only fields names.
     *
     * @return List of field names.
     */
    @Override
    public ArrayList<String> getReadOnlyProperties() {

        ArrayList<String> result = super.getReadOnlyProperties();

        result.add("Statute");
        result.add("ProofOfRegistration");
        result.add("ShareholderDeclaration");

        return result;
    }
}
