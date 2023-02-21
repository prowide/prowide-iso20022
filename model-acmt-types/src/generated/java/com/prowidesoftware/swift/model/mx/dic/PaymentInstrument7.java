
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
 * Instrument that has or represents monetary value and is used to process a payment instruction.
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstrument7", propOrder = {
    "sttlmCcy",
    "cshAcct",
    "chq",
    "pmtCard",
    "drctDbt"
})
public class PaymentInstrument7 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "CshAcct")
    protected List<CashAccount4> cshAcct;
    @XmlElement(name = "Chq")
    protected Boolean chq;
    @XmlElement(name = "PmtCard")
    protected PaymentCard2 pmtCard;
    @XmlElement(name = "DrctDbt")
    protected DirectDebitMandate3 drctDbt;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstrument7 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the cshAcct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cshAcct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCshAcct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CashAccount4 }
     * 
     * 
     */
    public List<CashAccount4> getCshAcct() {
        if (cshAcct == null) {
            cshAcct = new ArrayList<CashAccount4>();
        }
        return this.cshAcct;
    }

    /**
     * Gets the value of the chq property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isChq() {
        return chq;
    }

    /**
     * Sets the value of the chq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PaymentInstrument7 setChq(Boolean value) {
        this.chq = value;
        return this;
    }

    /**
     * Gets the value of the pmtCard property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentCard2 getPmtCard() {
        return pmtCard;
    }

    /**
     * Sets the value of the pmtCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCard2 }
     *     
     */
    public PaymentInstrument7 setPmtCard(PaymentCard2 value) {
        this.pmtCard = value;
        return this;
    }

    /**
     * Gets the value of the drctDbt property.
     * 
     * @return
     *     possible object is
     *     {@link DirectDebitMandate3 }
     *     
     */
    public DirectDebitMandate3 getDrctDbt() {
        return drctDbt;
    }

    /**
     * Sets the value of the drctDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DirectDebitMandate3 }
     *     
     */
    public PaymentInstrument7 setDrctDbt(DirectDebitMandate3 value) {
        this.drctDbt = value;
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
     * Adds a new item to the cshAcct list.
     * @see #getCshAcct()
     * 
     */
    public PaymentInstrument7 addCshAcct(CashAccount4 cshAcct) {
        getCshAcct().add(cshAcct);
        return this;
    }

}
