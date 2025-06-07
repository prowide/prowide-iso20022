
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the format under which the payment that generated the entry was transmitted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentOrigin1Choice", propOrder = {
    "finmt",
    "xmlMsgNm",
    "prtry",
    "instrm"
})
public class PaymentOrigin1Choice {

    @XmlElement(name = "FINMT")
    protected String finmt;
    @XmlElement(name = "XMLMsgNm")
    protected String xmlMsgNm;
    @XmlElement(name = "Prtry")
    protected String prtry;
    @XmlElement(name = "Instrm")
    @XmlSchemaType(name = "string")
    protected PaymentInstrument1Code instrm;

    /**
     * Gets the value of the finmt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFINMT() {
        return finmt;
    }

    /**
     * Sets the value of the finmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentOrigin1Choice setFINMT(String value) {
        this.finmt = value;
        return this;
    }

    /**
     * Gets the value of the xmlMsgNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXMLMsgNm() {
        return xmlMsgNm;
    }

    /**
     * Sets the value of the xmlMsgNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentOrigin1Choice setXMLMsgNm(String value) {
        this.xmlMsgNm = value;
        return this;
    }

    /**
     * Gets the value of the prtry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrtry() {
        return prtry;
    }

    /**
     * Sets the value of the prtry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentOrigin1Choice setPrtry(String value) {
        this.prtry = value;
        return this;
    }

    /**
     * Gets the value of the instrm property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentInstrument1Code }
     *     
     */
    public PaymentInstrument1Code getInstrm() {
        return instrm;
    }

    /**
     * Sets the value of the instrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentInstrument1Code }
     *     
     */
    public PaymentOrigin1Choice setInstrm(PaymentInstrument1Code value) {
        this.instrm = value;
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

}
