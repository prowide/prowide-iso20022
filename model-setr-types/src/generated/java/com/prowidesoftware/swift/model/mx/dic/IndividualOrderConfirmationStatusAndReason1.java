
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
 * Status report of the individual orders confirmation that was previously received.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndividualOrderConfirmationStatusAndReason1", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "dealRef",
    "confRjctd",
    "amdmntRjctd",
    "sts",
    "stsInitr",
    "invstmtAcctDtls",
    "finInstrmDtls"
})
public class IndividualOrderConfirmationStatusAndReason1 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "DealRef")
    protected String dealRef;
    @XmlElement(name = "ConfRjctd")
    protected List<ConfirmationRejectedStatus1> confRjctd;
    @XmlElement(name = "AmdmntRjctd")
    protected List<ConfirmationRejectedStatus1> amdmntRjctd;
    @XmlElement(name = "Sts")
    @XmlSchemaType(name = "string")
    protected OrderConfirmationStatus1Code sts;
    @XmlElement(name = "StsInitr")
    protected PartyIdentification2Choice stsInitr;
    @XmlElement(name = "InvstmtAcctDtls")
    protected InvestmentAccount13 invstmtAcctDtls;
    @XmlElement(name = "FinInstrmDtls")
    protected FinancialInstrument10 finInstrmDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setOrdrRef(String value) {
        this.ordrRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the dealRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDealRef() {
        return dealRef;
    }

    /**
     * Sets the value of the dealRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setDealRef(String value) {
        this.dealRef = value;
        return this;
    }

    /**
     * Gets the value of the confRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the confRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getConfRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus1 }
     * 
     * 
     */
    public List<ConfirmationRejectedStatus1> getConfRjctd() {
        if (confRjctd == null) {
            confRjctd = new ArrayList<ConfirmationRejectedStatus1>();
        }
        return this.confRjctd;
    }

    /**
     * Gets the value of the amdmntRjctd property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the amdmntRjctd property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAmdmntRjctd().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ConfirmationRejectedStatus1 }
     * 
     * 
     */
    public List<ConfirmationRejectedStatus1> getAmdmntRjctd() {
        if (amdmntRjctd == null) {
            amdmntRjctd = new ArrayList<ConfirmationRejectedStatus1>();
        }
        return this.amdmntRjctd;
    }

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public OrderConfirmationStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderConfirmationStatus1Code }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setSts(OrderConfirmationStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the stsInitr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getStsInitr() {
        return stsInitr;
    }

    /**
     * Sets the value of the stsInitr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setStsInitr(PartyIdentification2Choice value) {
        this.stsInitr = value;
        return this;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public InvestmentAccount13 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount13 }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setInvstmtAcctDtls(InvestmentAccount13 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public FinancialInstrument10 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument10 }
     *     
     */
    public IndividualOrderConfirmationStatusAndReason1 setFinInstrmDtls(FinancialInstrument10 value) {
        this.finInstrmDtls = value;
        return this;
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
     * Adds a new item to the confRjctd list.
     * @see #getConfRjctd()
     * 
     */
    public IndividualOrderConfirmationStatusAndReason1 addConfRjctd(ConfirmationRejectedStatus1 confRjctd) {
        getConfRjctd().add(confRjctd);
        return this;
    }

    /**
     * Adds a new item to the amdmntRjctd list.
     * @see #getAmdmntRjctd()
     * 
     */
    public IndividualOrderConfirmationStatusAndReason1 addAmdmntRjctd(ConfirmationRejectedStatus1 amdmntRjctd) {
        getAmdmntRjctd().add(amdmntRjctd);
        return this;
    }

}
