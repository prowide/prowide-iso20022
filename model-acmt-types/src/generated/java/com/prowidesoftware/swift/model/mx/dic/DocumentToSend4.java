
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Type of document and the type of communication method to be used to notify a party.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentToSend4", propOrder = {
    "tp",
    "rcpt",
    "mtdOfTrnsmssn"
})
public class DocumentToSend4 {

    @XmlElement(name = "Tp", required = true)
    protected String tp;
    @XmlElement(name = "Rcpt", required = true)
    protected PartyIdentification125Choice rcpt;
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
    public DocumentToSend4 setTp(String value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the rcpt property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public PartyIdentification125Choice getRcpt() {
        return rcpt;
    }

    /**
     * Sets the value of the rcpt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification125Choice }
     *     
     */
    public DocumentToSend4 setRcpt(PartyIdentification125Choice value) {
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
    public DocumentToSend4 setMtdOfTrnsmssn(CommunicationMethod3Choice value) {
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
