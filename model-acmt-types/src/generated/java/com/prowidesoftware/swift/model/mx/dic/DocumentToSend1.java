
package com.prowidesoftware.swift.model.mx.dic;

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
 * Determine the type of document and the type of communication method to be used to notify a Party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentToSend1", propOrder = {
    "tp",
    "rcpt",
    "mtdOfTrnsmssn",
    "xtndedMtdOfTrnsmssn"
})
public class DocumentToSend1 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Rcpt", required = true)
    protected PartyIdentification2Choice rcpt;
    @XmlElement(name = "MtdOfTrnsmssn")
    @XmlSchemaType(name = "string")
    protected CommunicationMethod1Code mtdOfTrnsmssn;
    @XmlElement(name = "XtndedMtdOfTrnsmssn")
    protected String xtndedMtdOfTrnsmssn;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentToSend1 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public DocumentToSend1 setRcpt(PartyIdentification2Choice value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the mtdOfTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod1Code }
     *     
     */
    public CommunicationMethod1Code getMtdOfTrnsmssn() {
        return mtdOfTrnsmssn;
    }

    /**
     * Sets the value of the mtdOfTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod1Code }
     *     
     */
    public DocumentToSend1 setMtdOfTrnsmssn(CommunicationMethod1Code value) {
        this.mtdOfTrnsmssn = value;
        return this;
    }

    /**
     * Gets the value of the xtndedMtdOfTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXtndedMtdOfTrnsmssn() {
        return xtndedMtdOfTrnsmssn;
    }

    /**
     * Sets the value of the xtndedMtdOfTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DocumentToSend1 setXtndedMtdOfTrnsmssn(String value) {
        this.xtndedMtdOfTrnsmssn = value;
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
