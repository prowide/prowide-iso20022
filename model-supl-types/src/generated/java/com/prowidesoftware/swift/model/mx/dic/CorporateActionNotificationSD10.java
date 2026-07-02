
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
 * Customer security identification reference information.
 * 
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionNotificationSD10", propOrder = {
    "plcAndNm",
    "cstmrIntlSctyId",
    "sctyOfIntrstMtchgScty"
})
public class CorporateActionNotificationSD10 {

    @XmlElement(name = "PlcAndNm")
    protected String plcAndNm;
    @XmlElement(name = "CstmrIntlSctyId")
    protected String cstmrIntlSctyId;
    @XmlElement(name = "SctyOfIntrstMtchgScty")
    protected SecurityIdentification20 sctyOfIntrstMtchgScty;

    /**
     * Gets the value of the plcAndNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlcAndNm() {
        return plcAndNm;
    }

    /**
     * Sets the value of the plcAndNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD10 setPlcAndNm(String value) {
        this.plcAndNm = value;
        return this;
    }

    /**
     * Gets the value of the cstmrIntlSctyId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCstmrIntlSctyId() {
        return cstmrIntlSctyId;
    }

    /**
     * Sets the value of the cstmrIntlSctyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionNotificationSD10 setCstmrIntlSctyId(String value) {
        this.cstmrIntlSctyId = value;
        return this;
    }

    /**
     * Gets the value of the sctyOfIntrstMtchgScty property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public SecurityIdentification20 getSctyOfIntrstMtchgScty() {
        return sctyOfIntrstMtchgScty;
    }

    /**
     * Sets the value of the sctyOfIntrstMtchgScty property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification20 }
     *     
     */
    public CorporateActionNotificationSD10 setSctyOfIntrstMtchgScty(SecurityIdentification20 value) {
        this.sctyOfIntrstMtchgScty = value;
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
