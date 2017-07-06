package com.mangopay.entities.subentities;

import com.mangopay.core.Dto;
import com.mangopay.core.interfaces.BankAccountDetails;
import com.mangopay.core.enumerations.CountryIso;

/**
 * Class represents OTHER type of bank account.
 */
public class BankAccountDetailsOTHER extends Dto implements BankAccountDetails {
    
    /**
     * Type.
     */
    //public String Type;
    
    /**
     * The Country associated to the BankAccount.
     *
     * @deprecated Use {@link #getCountry()} and {@link #setCountry(CountryIso)} instead.
     */
    @Deprecated
    public CountryIso Country;
    
    /**
     * Valid BIC format.
     *
     * @deprecated Use {@link #getBic()} and {@link #setBic(String)} instead.
     */
    @Deprecated
    public String BIC;
    
    /**
     * Account number.
     *
     * @deprecated Use {@link #getAccountNumber()} and {@link #setAccountNumber(String)} instead.
     */
    @Deprecated
    public String AccountNumber;

    public CountryIso getCountry() {
        return Country;
    }

    public void setCountry(CountryIso country) {
        this.Country = country;
    }

    public String getBic() {
        return BIC;
    }

    public void setBic(String bic) {
        this.BIC = bic;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.AccountNumber = accountNumber;
    }
}
