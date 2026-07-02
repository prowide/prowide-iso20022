
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
 * Provides further means of referencing an investigation request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestigationIdentification1", propOrder = {
    "rqstrInvstgtnId",
    "rspndrInvstgtnId",
    "eir"
})
public class InvestigationIdentification1 {

    @XmlElement(name = "RqstrInvstgtnId")
    protected String rqstrInvstgtnId;
    @XmlElement(name = "RspndrInvstgtnId")
    protected String rspndrInvstgtnId;
    @XmlElement(name = "EIR")
    protected String eir;

    /**
     * Gets the value of the rqstrInvstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRqstrInvstgtnId() {
        return rqstrInvstgtnId;
    }

    /**
     * Sets the value of the rqstrInvstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationIdentification1 setRqstrInvstgtnId(String value) {
        this.rqstrInvstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the rspndrInvstgtnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRspndrInvstgtnId() {
        return rspndrInvstgtnId;
    }

    /**
     * Sets the value of the rspndrInvstgtnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationIdentification1 setRspndrInvstgtnId(String value) {
        this.rspndrInvstgtnId = value;
        return this;
    }

    /**
     * Gets the value of the eir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEIR() {
        return eir;
    }

    /**
     * Sets the value of the eir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InvestigationIdentification1 setEIR(String value) {
        this.eir = value;
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
