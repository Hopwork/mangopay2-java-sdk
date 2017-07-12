package com.mangopay.entities.subentities;

import com.mangopay.core.Dto;
import com.mangopay.core.enumerations.CultureCode;
import com.mangopay.core.enumerations.SecureMode;
import com.mangopay.core.interfaces.PayInExecutionDetails;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Map;

/**
 * Class representing Web type for execution option in PayIn entity.
 */
public class PayInExecutionDetailsWeb extends Dto implements PayInExecutionDetails {

    /**
     * URL format expected.
     *
     * @deprecated Use {@link #getTemplateUrl()} and {@link #setTemplateUrl(String)} instead.
     */
    @Deprecated
    public String TemplateURL;

    /**
     * Culture.
     *
     * @deprecated Use {@link #getCulture()} and {@link #setCulture(CultureCode)} instead.
     */
    @Deprecated
    public CultureCode Culture;

    /**
     * Secure mode.
     *
     * @deprecated Use {@link #getSecureMode()} and {@link #setSecureMode(SecureMode)} instead.
     */
    @Deprecated
    public SecureMode SecureMode;

    /**
     * Redirect URL.
     *
     * @deprecated Use {@link #getRedirectUrl()} instead.
     */
    @Deprecated
    public String RedirectURL;

    /**
     * Return URL.
     *
     * @deprecated Use {@link #getReturnUrl()} and {@link #setReturnUrl(String)} instead.
     */
    @Deprecated
    public String ReturnURL;

    /**
     * The URL where you host the iFramed template.
     * For CB, Visa, MasterCard you need to specify PAYLINE: before your URL
     * with the iFramed template
     * ex: PAYLINE: https://www.maysite.com/payline_template/
     * Used for:
     * - direct debit web type pay-in.
     *
     * @deprecated Use {@link #getTemplateUrlOptions()} and {@link #setTemplateUrlOptions(PayInTemplateURLOptions)} instead.
     */
    @Deprecated
    public PayInTemplateURLOptions TemplateURLOptions;

    public String getTemplateUrl() {
        return TemplateURL;
    }

    public void setTemplateUrl(String templateURL) {
        this.TemplateURL = templateURL;
    }

    public CultureCode getCulture() {
        return Culture;
    }

    public void setCulture(CultureCode culture) {
        this.Culture = culture;
    }

    public SecureMode getSecureMode() {
        return SecureMode;
    }

    public void setSecureMode(SecureMode secureMode) {
        this.SecureMode = secureMode;
    }

    public String getRedirectUrl() {
        return RedirectURL;
    }

    public String getReturnUrl() {
        return ReturnURL;
    }

    public void setReturnUrl(String returnUrl) {
        this.ReturnURL = returnUrl;
    }

    public PayInTemplateURLOptions getTemplateUrlOptions() {
        return TemplateURLOptions;
    }

    public void setTemplateUrlOptions(PayInTemplateURLOptions templateUrlOptions) {
        this.TemplateURLOptions = templateUrlOptions;
    }

    /**
     * Gets the collection of read-only fields names
     *
     * @return List of field names.
     */
    @Override
    public ArrayList<String> getReadOnlyProperties() {

        ArrayList<String> result = super.getReadOnlyProperties();

        result.add("RedirectURL");

        return result;
    }

    /**
     * Gets map which property is an object and what type of object.
     * To be overridden in child class if has any sub objects.
     *
     * @return Collection of field name-field type pairs.
     */
    @Override
    public Map<String, Type> getSubObjects() {

        Map<String, Type> result = super.getSubObjects();

        result.put("TemplateURLOptions", PayInTemplateURLOptions.class);

        return result;
    }
}
