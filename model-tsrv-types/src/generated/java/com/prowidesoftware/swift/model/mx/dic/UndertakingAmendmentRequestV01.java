
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * The UndertakingAmendmentRequest message is sent by the party that requested issuance of the undertaking (applicant or obligor) to the party that issued the undertaking to request issuance of a proposed amendment to the undertaking. The undertaking could be a demand guarantee, standby letter of credit, counter-undertaking (counter-guarantee or counter-standby), or suretyship undertaking. The message provides details on proposed changes to the undertaking, for example, to the expiry date, amount, and/or terms and conditions. It may also be used to request termination or cancellation of the undertaking.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingAmendmentRequestV01", propOrder = {
    "udrtkgAmdmntReqDtls",
    "instrsToBk",
    "dgtlSgntr"
})
public class UndertakingAmendmentRequestV01 {

    @XmlElement(name = "UdrtkgAmdmntReqDtls", required = true)
    protected Amendment3 udrtkgAmdmntReqDtls;
    @XmlElement(name = "InstrsToBk")
    protected List<String> instrsToBk;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgAmdmntReqDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Amendment3 }
     *     
     */
    public Amendment3 getUdrtkgAmdmntReqDtls() {
        return udrtkgAmdmntReqDtls;
    }

    /**
     * Sets the value of the udrtkgAmdmntReqDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amendment3 }
     *     
     */
    public UndertakingAmendmentRequestV01 setUdrtkgAmdmntReqDtls(Amendment3 value) {
        this.udrtkgAmdmntReqDtls = value;
        return this;
    }

    /**
     * Gets the value of the instrsToBk property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the instrsToBk property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrsToBk().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInstrsToBk() {
        if (instrsToBk == null) {
            instrsToBk = new ArrayList<String>();
        }
        return this.instrsToBk;
    }

    /**
     * Gets the value of the dgtlSgntr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public PartyAndSignature2 getDgtlSgntr() {
        return dgtlSgntr;
    }

    /**
     * Sets the value of the dgtlSgntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyAndSignature2 }
     *     
     */
    public UndertakingAmendmentRequestV01 setDgtlSgntr(PartyAndSignature2 value) {
        this.dgtlSgntr = value;
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
     * Adds a new item to the instrsToBk list.
     * @see #getInstrsToBk()
     * 
     */
    public UndertakingAmendmentRequestV01 addInstrsToBk(String instrsToBk) {
        getInstrsToBk().add(instrsToBk);
        return this;
    }

}
