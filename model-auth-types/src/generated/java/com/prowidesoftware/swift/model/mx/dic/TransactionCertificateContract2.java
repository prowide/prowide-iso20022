
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
@XmlType(name = "TransactionCertificateContract2", propOrder = {
    "ctrctRef",
    "txAmtInCtrctCcy",
    "xpctdShipmntDt",
    "xpctdAdvncPmtRtrDt",
    "addtlInf"
})
public class TransactionCertificateContract2 {

    @XmlElement(name = "CtrctRef")
    protected ContractRegistrationReference2Choice ctrctRef;
    @XmlElement(name = "TxAmtInCtrctCcy")
    protected ActiveCurrencyAndAmount txAmtInCtrctCcy;
    @XmlElement(name = "XpctdShipmntDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdShipmntDt;
    @XmlElement(name = "XpctdAdvncPmtRtrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar xpctdAdvncPmtRtrDt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the ctrctRef property.
     * 
     * @return
     *     possible object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public ContractRegistrationReference2Choice getCtrctRef() {
        return ctrctRef;
    }

    /**
     * Sets the value of the ctrctRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractRegistrationReference2Choice }
     *     
     */
    public TransactionCertificateContract2 setCtrctRef(ContractRegistrationReference2Choice value) {
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
    public TransactionCertificateContract2 setTxAmtInCtrctCcy(ActiveCurrencyAndAmount value) {
        this.txAmtInCtrctCcy = value;
        return this;
    }

    /**
     * Gets the value of the xpctdShipmntDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public TransactionCertificateContract2 setXpctdShipmntDt(XMLGregorianCalendar value) {
        this.xpctdShipmntDt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdAdvncPmtRtrDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
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
     *     {@link String }
     *     
     */
    public TransactionCertificateContract2 setXpctdAdvncPmtRtrDt(XMLGregorianCalendar value) {
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
    public TransactionCertificateContract2 setAddtlInf(String value) {
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
