
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
 * The UndertakingApplication message is sent by the party requesting issuance of the undertaking (applicant or obligor) to the party issuing the undertaking. It is used to request the issuance of an undertaking (demand guarantee or standby letter of credit or suretyship) or counter-undertaking (counter-guarantee or counter-standby or suretyship), and provides details on the applicable rules, terms, conditions and content of the undertaking to be issued.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingApplicationV01", propOrder = {
    "udrtkgApplDtls",
    "instrsToBk",
    "dgtlSgntr"
})
public class UndertakingApplicationV01 {

    @XmlElement(name = "UdrtkgApplDtls", required = true)
    protected Undertaking1 udrtkgApplDtls;
    @XmlElement(name = "InstrsToBk")
    protected List<String> instrsToBk;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgApplDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking1 }
     *     
     */
    public Undertaking1 getUdrtkgApplDtls() {
        return udrtkgApplDtls;
    }

    /**
     * Sets the value of the udrtkgApplDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking1 }
     *     
     */
    public UndertakingApplicationV01 setUdrtkgApplDtls(Undertaking1 value) {
        this.udrtkgApplDtls = value;
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
    public UndertakingApplicationV01 setDgtlSgntr(PartyAndSignature2 value) {
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
    public UndertakingApplicationV01 addInstrsToBk(String instrsToBk) {
        getInstrsToBk().add(instrsToBk);
        return this;
    }

}
