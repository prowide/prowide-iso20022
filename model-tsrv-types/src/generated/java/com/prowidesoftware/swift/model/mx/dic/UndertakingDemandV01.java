
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
 * The UndertakingDemand message and other required documents are sent by the beneficiary to the party that issued the undertaking, either directly or via a presenting or nominated party. It is a demand for payment and may include a request to extend the undertaking expiry date. The demand itself must be contained in an enclosed file within the message or must be specified as narrative text within the message. It may contain other required documents in addition to the demand.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingDemandV01", propOrder = {
    "udrtkgDmndDtls",
    "bkToBkInf",
    "dgtlSgntr"
})
public class UndertakingDemandV01 {

    @XmlElement(name = "UdrtkgDmndDtls", required = true)
    protected Demand1 udrtkgDmndDtls;
    @XmlElement(name = "BkToBkInf")
    protected List<String> bkToBkInf;
    @XmlElement(name = "DgtlSgntr")
    protected PartyAndSignature2 dgtlSgntr;

    /**
     * Gets the value of the udrtkgDmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand1 }
     *     
     */
    public Demand1 getUdrtkgDmndDtls() {
        return udrtkgDmndDtls;
    }

    /**
     * Sets the value of the udrtkgDmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand1 }
     *     
     */
    public UndertakingDemandV01 setUdrtkgDmndDtls(Demand1 value) {
        this.udrtkgDmndDtls = value;
        return this;
    }

    /**
     * Gets the value of the bkToBkInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bkToBkInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBkToBkInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBkToBkInf() {
        if (bkToBkInf == null) {
            bkToBkInf = new ArrayList<String>();
        }
        return this.bkToBkInf;
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
    public UndertakingDemandV01 setDgtlSgntr(PartyAndSignature2 value) {
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
     * Adds a new item to the bkToBkInf list.
     * @see #getBkToBkInf()
     * 
     */
    public UndertakingDemandV01 addBkToBkInf(String bkToBkInf) {
        getBkToBkInf().add(bkToBkInf);
        return this;
    }

}
