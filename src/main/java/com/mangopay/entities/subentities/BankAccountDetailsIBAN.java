package com.mangopay.entities.subentities;

import com.mangopay.core.Dto;
import com.mangopay.core.interfaces.BankAccountDetails;

/**
 * Class represents IBAN type of bank account.
 */
public class BankAccountDetailsIBAN extends Dto implements BankAccountDetails {

    /**
     * IBAN number.
     *
     * @deprecated Use {@link #getIban()} and {@link #setIban(String)} instead.
     */
    @Deprecated
    public String IBAN;

    /**
     * BIC.
     *
     * @deprecated Use {@link #getBic()} and {@link #setBic(String)} instead.
     */
    @Deprecated
    public String BIC;

    public String getIban() {
        return IBAN;
    }

    public void setIban(String iban) {
        this.IBAN = iban;
    }

    public String getBic() {
        return BIC;
    }

    public void setBic(String bic) {
        this.BIC = bic;
    }
}
