
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
 * Specifies the header details of the cash obligation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CashObligationHeader2", propOrder = {
    "orgnlBizReq",
    "mktInfrstrctrTxId"
})
public class CashObligationHeader2 {

    @XmlElement(name = "OrgnlBizReq", required = true)
    protected OriginalBusinessReport1 orgnlBizReq;
    @XmlElement(name = "MktInfrstrctrTxId")
    protected String mktInfrstrctrTxId;

    /**
     * Gets the value of the orgnlBizReq property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalBusinessReport1 }
     *     
     */
    public OriginalBusinessReport1 getOrgnlBizReq() {
        return orgnlBizReq;
    }

    /**
     * Sets the value of the orgnlBizReq property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalBusinessReport1 }
     *     
     */
    public CashObligationHeader2 setOrgnlBizReq(OriginalBusinessReport1 value) {
        this.orgnlBizReq = value;
        return this;
    }

    /**
     * Gets the value of the mktInfrstrctrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMktInfrstrctrTxId() {
        return mktInfrstrctrTxId;
    }

    /**
     * Sets the value of the mktInfrstrctrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CashObligationHeader2 setMktInfrstrctrTxId(String value) {
        this.mktInfrstrctrTxId = value;
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
