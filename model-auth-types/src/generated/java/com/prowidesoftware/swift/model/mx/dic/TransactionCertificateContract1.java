
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Certificate and contract reference of a transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionCertificateContract1", propOrder = {
    "ctrctRef",
    "txAmtInCtrctCcy",
    "xpctdShipmntDt",
    "xpctdAdvncPmtRtrDt",
    "addtlInf"
})
public class TransactionCertificateContract1 {

    @XmlElement(name = "CtrctRef")
    protected ContractRegistrationReference1Choice ctrctRef;
    @XmlElement(name = "TxAmtInCtrctCcy")
    protected ActiveCurrencyAndAmount txAmtInCtrctCcy;
    @XmlElement(name = "XpctdShipmntDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdShipmntDt;
    @XmlElement(name = "XpctdAdvncPmtRtrDt")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdAdvncPmtRtrDt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationReference1Choice }
     *     
     */
    public ContractRegistrationReference1Choice getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationReference1Choice }
     *     
     */
    public TransactionCertificateContract1 setCtrctRef(ContractRegistrationReference1Choice value) {
        this.ctrctRef = value;
        return this;
    }

    /**
     * Gets the value of the txAmtInCtrctCcy property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getTxAmtInCtrctCcy() {
        return txAmtInCtrctCcy;
    }

    /**
     * Sets the value of the txAmtInCtrctCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public TransactionCertificateContract1 setTxAmtInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.txAmtInCtrctCcy = value;
        return this;
    }

    /**
     * Gets the value of the xpctdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdShipmntDt() {
        return xpctdShipmntDt;
    }

    /**
     * Sets the value of the xpctdShipmntDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransactionCertificateContract1 setXpctdShipmntDt(XMLGregorianCalendar value) {
        this.xpctdShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdAdvncPmtRtrDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpctdAdvncPmtRtrDt() {
        return xpctdAdvncPmtRtrDt;
    }

    /**
     * Sets the value of the xpctdAdvncPmtRtrDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public TransactionCertificateContract1 setXpctdAdvncPmtRtrDt(XMLGregorianCalendar value) {
        this.xpctdAdvncPmtRtrDt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionCertificateContract1 setAddtlInf(String value) {
        this.addtlInf = value;
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
