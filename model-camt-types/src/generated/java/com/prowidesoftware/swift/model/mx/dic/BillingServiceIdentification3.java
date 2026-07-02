
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
 * Identification of the service to be billed.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BillingServiceIdentification3", propOrder = {
    "id",
    "subSvc",
    "desc",
    "cmonCd",
    "bkTxCd",
    "svcTp"
})
public class BillingServiceIdentification3 {

    @XmlElement(name = "Id", required = true)
    protected String id;
    @XmlElement(name = "SubSvc")
    protected BillingSubServiceIdentification1 subSvc;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "CmonCd")
    protected BillingServiceCommonIdentification1 cmonCd;
    @XmlElement(name = "BkTxCd")
    protected BankTransactionCodeStructure4 bkTxCd;
    @XmlElement(name = "SvcTp")
    protected String svcTp;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceIdentification3 setId(String value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the subSvc property.
     * 
     * @return
     *     possible object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingSubServiceIdentification1 getSubSvc() {
        return subSvc;
    }

    /**
     * Sets the value of the subSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingSubServiceIdentification1 }
     *     
     */
    public BillingServiceIdentification3 setSubSvc(BillingSubServiceIdentification1 value) {
        this.subSvc = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceIdentification3 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the cmonCd property.
     * 
     * @return
     *     possible object is
     *     {@link BillingServiceCommonIdentification1 }
     *     
     */
    public BillingServiceCommonIdentification1 getCmonCd() {
        return cmonCd;
    }

    /**
     * Sets the value of the cmonCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BillingServiceCommonIdentification1 }
     *     
     */
    public BillingServiceIdentification3 setCmonCd(BillingServiceCommonIdentification1 value) {
        this.cmonCd = value;
        return this;
    }

    /**
     * Gets the value of the bkTxCd property.
     * 
     * @return
     *     possible object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BankTransactionCodeStructure4 getBkTxCd() {
        return bkTxCd;
    }

    /**
     * Sets the value of the bkTxCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link BankTransactionCodeStructure4 }
     *     
     */
    public BillingServiceIdentification3 setBkTxCd(BankTransactionCodeStructure4 value) {
        this.bkTxCd = value;
        return this;
    }

    /**
     * Gets the value of the svcTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcTp() {
        return svcTp;
    }

    /**
     * Sets the value of the svcTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BillingServiceIdentification3 setSvcTp(String value) {
        this.svcTp = value;
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
