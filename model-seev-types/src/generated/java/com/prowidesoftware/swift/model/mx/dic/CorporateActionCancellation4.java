
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
 * Corporate action event cancellation status and reason.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateActionCancellation4", propOrder = {
    "cxlRsnCd",
    "cxlRsn",
    "prcgSts"
})
public class CorporateActionCancellation4 {

    @XmlElement(name = "CxlRsnCd", required = true)
    @XmlSchemaType(name = "string")
    protected CorporateActionCancellationReason1Code cxlRsnCd;
    @XmlElement(name = "CxlRsn")
    protected String cxlRsn;
    @XmlElement(name = "PrcgSts", required = true)
    protected CorporateActionEventStatus1 prcgSts;

    /**
     * Gets the value of the cxlRsnCd property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionCancellationReason1Code }
     *     
     */
    public CorporateActionCancellationReason1Code getCxlRsnCd() {
        return cxlRsnCd;
    }

    /**
     * Sets the value of the cxlRsnCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionCancellationReason1Code }
     *     
     */
    public CorporateActionCancellation4 setCxlRsnCd(CorporateActionCancellationReason1Code value) {
        this.cxlRsnCd = value;
        return this;
    }

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CorporateActionCancellation4 setCxlRsn(String value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the prcgSts property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionEventStatus1 }
     *     
     */
    public CorporateActionEventStatus1 getPrcgSts() {
        return prcgSts;
    }

    /**
     * Sets the value of the prcgSts property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionEventStatus1 }
     *     
     */
    public CorporateActionCancellation4 setPrcgSts(CorporateActionEventStatus1 value) {
        this.prcgSts = value;
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
