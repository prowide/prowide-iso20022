
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Outcome of the withdrawal authorisation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorisationResult20", propOrder = {
    "authstnNtty",
    "authstnRspn",
    "rspnTrac",
    "authstnCd",
    "actn",
    "feeToAdd"
})
public class AuthorisationResult20 {

    @XmlElement(name = "AuthstnNtty")
    @XmlSchemaType(name = "string")
    protected PartyType16Code authstnNtty;
    @XmlElement(name = "AuthstnRspn", required = true)
    protected ResponseType12 authstnRspn;
    @XmlElement(name = "RspnTrac")
    protected List<ResponseType8> rspnTrac;
    @XmlElement(name = "AuthstnCd")
    protected String authstnCd;
    @XmlElement(name = "Actn")
    protected List<Action7> actn;
    @XmlElement(name = "FeeToAdd")
    protected List<ATMFeeComponent1> feeToAdd;

    /**
     * Gets the value of the authstnNtty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType16Code }
     *     
     */
    public PartyType16Code getAuthstnNtty() {
        return authstnNtty;
    }

    /**
     * Sets the value of the authstnNtty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType16Code }
     *     
     */
    public AuthorisationResult20 setAuthstnNtty(PartyType16Code value) {
        this.authstnNtty = value;
        return this;
    }

    /**
     * Gets the value of the authstnRspn property.
     * 
     * @return
     *     possible object is
     *     {@link ResponseType12 }
     *     
     */
    public ResponseType12 getAuthstnRspn() {
        return authstnRspn;
    }

    /**
     * Sets the value of the authstnRspn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ResponseType12 }
     *     
     */
    public AuthorisationResult20 setAuthstnRspn(ResponseType12 value) {
        this.authstnRspn = value;
        return this;
    }

    /**
     * Gets the value of the rspnTrac property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rspnTrac property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRspnTrac().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResponseType8 }
     * 
     * 
     * @return
     *     The value of the rspnTrac property.
     */
    public List<ResponseType8> getRspnTrac() {
        if (rspnTrac == null) {
            rspnTrac = new ArrayList<>();
        }
        return this.rspnTrac;
    }

    /**
     * Gets the value of the authstnCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthstnCd() {
        return authstnCd;
    }

    /**
     * Sets the value of the authstnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AuthorisationResult20 setAuthstnCd(String value) {
        this.authstnCd = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action7 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action7> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
    }

    /**
     * Gets the value of the feeToAdd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the feeToAdd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFeeToAdd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ATMFeeComponent1 }
     * 
     * 
     * @return
     *     The value of the feeToAdd property.
     */
    public List<ATMFeeComponent1> getFeeToAdd() {
        if (feeToAdd == null) {
            feeToAdd = new ArrayList<>();
        }
        return this.feeToAdd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the rspnTrac list.
     * @see #getRspnTrac()
     * 
     */
    public AuthorisationResult20 addRspnTrac(ResponseType8 rspnTrac) {
        getRspnTrac().add(rspnTrac);
        return this;
    }

    /**
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public AuthorisationResult20 addActn(Action7 actn) {
        getActn().add(actn);
        return this;
    }

    /**
     * Adds a new item to the feeToAdd list.
     * @see #getFeeToAdd()
     * 
     */
    public AuthorisationResult20 addFeeToAdd(ATMFeeComponent1 feeToAdd) {
        getFeeToAdd().add(feeToAdd);
        return this;
    }

}
