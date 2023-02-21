
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the amendment.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Amendment2", propOrder = {
    "udrtkgAmdmntMsg",
    "frstAdvsgPtyAddtlInf",
    "scndAdvsgPtyAddtlInf",
    "confDtls",
    "dgtlSgntr"
})
public class Amendment2 {

    @XmlElement(name = "UdrtkgAmdmntMsg", required = true)
    protected UndertakingAmendmentMessage1 udrtkgAmdmntMsg;
    @XmlElement(name = "FrstAdvsgPtyAddtlInf")
    protected AdvisingPartyAdditionalInformation1 frstAdvsgPtyAddtlInf;
    @XmlElement(name = "ScndAdvsgPtyAddtlInf")
    protected AdvisingPartyAdditionalInformation1 scndAdvsgPtyAddtlInf;
    @XmlElement(name = "ConfDtls")
    protected UndertakingConfirmation1 confDtls;
    @XmlElement(name = "DgtlSgntr")
    protected List<PartyAndSignature2> dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntMsg property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingAmendmentMessage1 }
     *     
     */
    public UndertakingAmendmentMessage1 getUdrtkgAmdmntMsg() {
        return udrtkgAmdmntMsg;
    }

    /**
     * Sets the value of the udrtkgAmdmntMsg property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingAmendmentMessage1 }
     *     
     */
    public Amendment2 setUdrtkgAmdmntMsg(UndertakingAmendmentMessage1 value) {
        this.udrtkgAmdmntMsg = value;
        return this;
    }

    /**
     * Gets the value of the frstAdvsgPtyAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public AdvisingPartyAdditionalInformation1 getFrstAdvsgPtyAddtlInf() {
        return frstAdvsgPtyAddtlInf;
    }

    /**
     * Sets the value of the frstAdvsgPtyAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public Amendment2 setFrstAdvsgPtyAddtlInf(AdvisingPartyAdditionalInformation1 value) {
        this.frstAdvsgPtyAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the scndAdvsgPtyAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public AdvisingPartyAdditionalInformation1 getScndAdvsgPtyAddtlInf() {
        return scndAdvsgPtyAddtlInf;
    }

    /**
     * Sets the value of the scndAdvsgPtyAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdvisingPartyAdditionalInformation1 }
     *     
     */
    public Amendment2 setScndAdvsgPtyAddtlInf(AdvisingPartyAdditionalInformation1 value) {
        this.scndAdvsgPtyAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the confDtls property.
     * 
     * @return
     *     possible object is
     *     {@link UndertakingConfirmation1 }
     *     
     */
    public UndertakingConfirmation1 getConfDtls() {
        return confDtls;
    }

    /**
     * Sets the value of the confDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link UndertakingConfirmation1 }
     *     
     */
    public Amendment2 setConfDtls(UndertakingConfirmation1 value) {
        this.confDtls = value;
        return this;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dgtlSgntr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlSgntr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyAndSignature2 }
     * 
     * 
     */
    public List<PartyAndSignature2> getDgtlSgntr() {
        if (dgtlSgntr == null) {
            dgtlSgntr = new ArrayList<PartyAndSignature2>();
        }
        return this.dgtlSgntr;
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
     * Adds a new item to the dgtlSgntr list.
     * @see #getDgtlSgntr()
     * 
     */
    public Amendment2 addDgtlSgntr(PartyAndSignature2 dgtlSgntr) {
        getDgtlSgntr().add(dgtlSgntr);
        return this;
    }

}
