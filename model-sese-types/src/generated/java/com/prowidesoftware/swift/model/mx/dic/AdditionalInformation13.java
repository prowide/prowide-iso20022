
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
 * Additional specific modification criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdditionalInformation13", propOrder = {
    "acctOwnrTxId",
    "clssfctnTp",
    "sfkpgAcct",
    "finInstrmId",
    "qty",
    "fctvDt",
    "xpryDt",
    "cutOffDt",
    "invstr",
    "dlvrgPty1",
    "rcvgPty1"
})
public class AdditionalInformation13 {

    @XmlElement(name = "AcctOwnrTxId")
    protected String acctOwnrTxId;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType32Choice clssfctnTp;
    @XmlElement(name = "SfkpgAcct")
    protected SecuritiesAccount19 sfkpgAcct;
    @XmlElement(name = "FinInstrmId")
    protected SecurityIdentification19 finInstrmId;
    @XmlElement(name = "Qty")
    protected FinancialInstrumentQuantity1Choice qty;
    @XmlElement(name = "FctvDt")
    protected DateAndDateTimeChoice fctvDt;
    @XmlElement(name = "XpryDt")
    protected DateAndDateTimeChoice xpryDt;
    @XmlElement(name = "CutOffDt")
    protected DateAndDateTimeChoice cutOffDt;
    @XmlElement(name = "Invstr")
    protected PartyIdentification100 invstr;
    @XmlElement(name = "DlvrgPty1")
    protected PartyIdentificationAndAccount117 dlvrgPty1;
    @XmlElement(name = "RcvgPty1")
    protected PartyIdentificationAndAccount117 rcvgPty1;

    /**
     * Gets the value of the acctOwnrTxId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcctOwnrTxId() {
        return acctOwnrTxId;
    }

    /**
     * Sets the value of the acctOwnrTxId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AdditionalInformation13 setAcctOwnrTxId(String value) {
        this.acctOwnrTxId = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public ClassificationType32Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType32Choice }
     *     
     */
    public AdditionalInformation13 setClssfctnTp(ClassificationType32Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the sfkpgAcct property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public SecuritiesAccount19 getSfkpgAcct() {
        return sfkpgAcct;
    }

    /**
     * Sets the value of the sfkpgAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesAccount19 }
     *     
     */
    public AdditionalInformation13 setSfkpgAcct(SecuritiesAccount19 value) {
        this.sfkpgAcct = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public AdditionalInformation13 setFinInstrmId(SecurityIdentification19 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public AdditionalInformation13 setQty(FinancialInstrumentQuantity1Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation13 setFctvDt(DateAndDateTimeChoice value) {
        this.fctvDt = value;
        return this;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation13 setXpryDt(DateAndDateTimeChoice value) {
        this.xpryDt = value;
        return this;
    }

    /**
     * Gets the value of the cutOffDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getCutOffDt() {
        return cutOffDt;
    }

    /**
     * Sets the value of the cutOffDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public AdditionalInformation13 setCutOffDt(DateAndDateTimeChoice value) {
        this.cutOffDt = value;
        return this;
    }

    /**
     * Gets the value of the invstr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification100 }
     *     
     */
    public PartyIdentification100 getInvstr() {
        return invstr;
    }

    /**
     * Sets the value of the invstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification100 }
     *     
     */
    public AdditionalInformation13 setInvstr(PartyIdentification100 value) {
        this.invstr = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount117 }
     *     
     */
    public PartyIdentificationAndAccount117 getDlvrgPty1() {
        return dlvrgPty1;
    }

    /**
     * Sets the value of the dlvrgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount117 }
     *     
     */
    public AdditionalInformation13 setDlvrgPty1(PartyIdentificationAndAccount117 value) {
        this.dlvrgPty1 = value;
        return this;
    }

    /**
     * Gets the value of the rcvgPty1 property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount117 }
     *     
     */
    public PartyIdentificationAndAccount117 getRcvgPty1() {
        return rcvgPty1;
    }

    /**
     * Sets the value of the rcvgPty1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount117 }
     *     
     */
    public AdditionalInformation13 setRcvgPty1(PartyIdentificationAndAccount117 value) {
        this.rcvgPty1 = value;
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
