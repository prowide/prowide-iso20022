
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
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
@XmlType(name = "DocumentToSend2", propOrder = {
    "tp",
    "rcpt",
    "mtdOfTrnsmssn"
})
public class DocumentToSend2 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Rcpt", required = true)
    protected PartyIdentification2Choice rcpt;
    @XmlElement(name = "MtdOfTrnsmssn", required = true)
    protected CommunicationMethod3Choice mtdOfTrnsmssn;

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
    public DocumentToSend2 setTp(String value) {
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
    public DocumentToSend2 setRcpt(PartyIdentification2Choice value) {
        this.rcpt = value;
        return this;
    }

    /**
     * Gets the value of the mtdOfTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link CommunicationMethod3Choice }
     *     
     */
    public CommunicationMethod3Choice getMtdOfTrnsmssn() {
        return mtdOfTrnsmssn;
    }

    /**
     * Sets the value of the mtdOfTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CommunicationMethod3Choice }
     *     
     */
    public DocumentToSend2 setMtdOfTrnsmssn(CommunicationMethod3Choice value) {
        this.mtdOfTrnsmssn = value;
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
