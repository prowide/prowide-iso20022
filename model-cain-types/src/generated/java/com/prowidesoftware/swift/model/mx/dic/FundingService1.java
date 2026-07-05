
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
 * Funds related service such as a payment or a transfer related to the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FundingService1", propOrder = {
    "fndgSvc",
    "fndgSrc",
    "clmInf"
})
public class FundingService1 {

    @XmlElement(name = "FndgSvc")
    protected TransferService1 fndgSvc;
    @XmlElement(name = "FndgSrc")
    protected FundingSource2 fndgSrc;
    @XmlElement(name = "ClmInf")
    protected ClaimInformation1 clmInf;

    /**
     * Gets the value of the fndgSvc property.
     * 
     * @return
     *     possible object is
     *     {@link TransferService1 }
     *     
     */
    public TransferService1 getFndgSvc() {
        return fndgSvc;
    }

    /**
     * Sets the value of the fndgSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferService1 }
     *     
     */
    public FundingService1 setFndgSvc(TransferService1 value) {
        this.fndgSvc = value;
        return this;
    }

    /**
     * Gets the value of the fndgSrc property.
     * 
     * @return
     *     possible object is
     *     {@link FundingSource2 }
     *     
     */
    public FundingSource2 getFndgSrc() {
        return fndgSrc;
    }

    /**
     * Sets the value of the fndgSrc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundingSource2 }
     *     
     */
    public FundingService1 setFndgSrc(FundingSource2 value) {
        this.fndgSrc = value;
        return this;
    }

    /**
     * Gets the value of the clmInf property.
     * 
     * @return
     *     possible object is
     *     {@link ClaimInformation1 }
     *     
     */
    public ClaimInformation1 getClmInf() {
        return clmInf;
    }

    /**
     * Sets the value of the clmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClaimInformation1 }
     *     
     */
    public FundingService1 setClmInf(ClaimInformation1 value) {
        this.clmInf = value;
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
