
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
 * Includes data elements that can be used for reporting to trade repositories, it is not to be used on regular trade confirmations. Although some fields, for example, unique transaction identifier and prior unique transaction identifier, might be used on regular confirmations.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulatoryReporting1", propOrder = {
    "rptgJursdctn",
    "rptgPty",
    "tradgSdUnqTxIdr",
    "ctrPtySdUnqTxIdr",
    "clrXcptnPty",
    "clrBrkrId",
    "clrThrshldInd",
    "clrdPdctId",
    "undrlygPdctIdr",
    "allcnInd",
    "collstnInd",
    "exctnVn",
    "exctnTmstmp",
    "nonStdFlg",
    "lkSwpId",
    "addtlRptgInf"
})
public class RegulatoryReporting1 {

    @XmlElement(name = "RptgJursdctn")
    protected String rptgJursdctn;
    @XmlElement(name = "RptgPty")
    protected PartyIdentification73Choice rptgPty;
    @XmlElement(name = "TradgSdUnqTxIdr")
    protected UniqueTransactionIdentifier1 tradgSdUnqTxIdr;
    @XmlElement(name = "CtrPtySdUnqTxIdr")
    protected UniqueTransactionIdentifier1 ctrPtySdUnqTxIdr;
    @XmlElement(name = "ClrXcptnPty")
    protected PartyIdentification73Choice clrXcptnPty;
    @XmlElement(name = "ClrBrkrId")
    protected ClearingBrokerIdentification1 clrBrkrId;
    @XmlElement(name = "ClrThrshldInd")
    protected Boolean clrThrshldInd;
    @XmlElement(name = "ClrdPdctId")
    protected String clrdPdctId;
    @XmlElement(name = "UndrlygPdctIdr")
    @XmlSchemaType(name = "string")
    protected UnderlyingProductIdentifier1Code undrlygPdctIdr;
    @XmlElement(name = "AllcnInd")
    @XmlSchemaType(name = "string")
    protected AllocationIndicator1Code allcnInd;
    @XmlElement(name = "CollstnInd")
    @XmlSchemaType(name = "string")
    protected CollateralisationIndicator1Code collstnInd;
    @XmlElement(name = "ExctnVn")
    protected String exctnVn;
    @XmlElement(name = "ExctnTmstmp")
    protected DateAndDateTimeChoice exctnTmstmp;
    @XmlElement(name = "NonStdFlg")
    protected Boolean nonStdFlg;
    @XmlElement(name = "LkSwpId")
    protected String lkSwpId;
    @XmlElement(name = "AddtlRptgInf")
    protected String addtlRptgInf;

    /**
     * Gets the value of the rptgJursdctn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRptgJursdctn() {
        return rptgJursdctn;
    }

    /**
     * Sets the value of the rptgJursdctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting1 setRptgJursdctn(String value) {
        this.rptgJursdctn = value;
        return this;
    }

    /**
     * Gets the value of the rptgPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getRptgPty() {
        return rptgPty;
    }

    /**
     * Sets the value of the rptgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RegulatoryReporting1 setRptgPty(PartyIdentification73Choice value) {
        this.rptgPty = value;
        return this;
    }

    /**
     * Gets the value of the tradgSdUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1 }
     *     
     */
    public UniqueTransactionIdentifier1 getTradgSdUnqTxIdr() {
        return tradgSdUnqTxIdr;
    }

    /**
     * Sets the value of the tradgSdUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1 }
     *     
     */
    public RegulatoryReporting1 setTradgSdUnqTxIdr(UniqueTransactionIdentifier1 value) {
        this.tradgSdUnqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtySdUnqTxIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier1 }
     *     
     */
    public UniqueTransactionIdentifier1 getCtrPtySdUnqTxIdr() {
        return ctrPtySdUnqTxIdr;
    }

    /**
     * Sets the value of the ctrPtySdUnqTxIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier1 }
     *     
     */
    public RegulatoryReporting1 setCtrPtySdUnqTxIdr(UniqueTransactionIdentifier1 value) {
        this.ctrPtySdUnqTxIdr = value;
        return this;
    }

    /**
     * Gets the value of the clrXcptnPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public PartyIdentification73Choice getClrXcptnPty() {
        return clrXcptnPty;
    }

    /**
     * Sets the value of the clrXcptnPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification73Choice }
     *     
     */
    public RegulatoryReporting1 setClrXcptnPty(PartyIdentification73Choice value) {
        this.clrXcptnPty = value;
        return this;
    }

    /**
     * Gets the value of the clrBrkrId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public ClearingBrokerIdentification1 getClrBrkrId() {
        return clrBrkrId;
    }

    /**
     * Sets the value of the clrBrkrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingBrokerIdentification1 }
     *     
     */
    public RegulatoryReporting1 setClrBrkrId(ClearingBrokerIdentification1 value) {
        this.clrBrkrId = value;
        return this;
    }

    /**
     * Gets the value of the clrThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isClrThrshldInd() {
        return clrThrshldInd;
    }

    /**
     * Sets the value of the clrThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting1 setClrThrshldInd(Boolean value) {
        this.clrThrshldInd = value;
        return this;
    }

    /**
     * Gets the value of the clrdPdctId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClrdPdctId() {
        return clrdPdctId;
    }

    /**
     * Sets the value of the clrdPdctId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting1 setClrdPdctId(String value) {
        this.clrdPdctId = value;
        return this;
    }

    /**
     * Gets the value of the undrlygPdctIdr property.
     * 
     * @return
     *     possible object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public UnderlyingProductIdentifier1Code getUndrlygPdctIdr() {
        return undrlygPdctIdr;
    }

    /**
     * Sets the value of the undrlygPdctIdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnderlyingProductIdentifier1Code }
     *     
     */
    public RegulatoryReporting1 setUndrlygPdctIdr(UnderlyingProductIdentifier1Code value) {
        this.undrlygPdctIdr = value;
        return this;
    }

    /**
     * Gets the value of the allcnInd property.
     * 
     * @return
     *     possible object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public AllocationIndicator1Code getAllcnInd() {
        return allcnInd;
    }

    /**
     * Sets the value of the allcnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationIndicator1Code }
     *     
     */
    public RegulatoryReporting1 setAllcnInd(AllocationIndicator1Code value) {
        this.allcnInd = value;
        return this;
    }

    /**
     * Gets the value of the collstnInd property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public CollateralisationIndicator1Code getCollstnInd() {
        return collstnInd;
    }

    /**
     * Sets the value of the collstnInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralisationIndicator1Code }
     *     
     */
    public RegulatoryReporting1 setCollstnInd(CollateralisationIndicator1Code value) {
        this.collstnInd = value;
        return this;
    }

    /**
     * Gets the value of the exctnVn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctnVn() {
        return exctnVn;
    }

    /**
     * Sets the value of the exctnVn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting1 setExctnVn(String value) {
        this.exctnVn = value;
        return this;
    }

    /**
     * Gets the value of the exctnTmstmp property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getExctnTmstmp() {
        return exctnTmstmp;
    }

    /**
     * Sets the value of the exctnTmstmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public RegulatoryReporting1 setExctnTmstmp(DateAndDateTimeChoice value) {
        this.exctnTmstmp = value;
        return this;
    }

    /**
     * Gets the value of the nonStdFlg property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isNonStdFlg() {
        return nonStdFlg;
    }

    /**
     * Sets the value of the nonStdFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public RegulatoryReporting1 setNonStdFlg(Boolean value) {
        this.nonStdFlg = value;
        return this;
    }

    /**
     * Gets the value of the lkSwpId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLkSwpId() {
        return lkSwpId;
    }

    /**
     * Sets the value of the lkSwpId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting1 setLkSwpId(String value) {
        this.lkSwpId = value;
        return this;
    }

    /**
     * Gets the value of the addtlRptgInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlRptgInf() {
        return addtlRptgInf;
    }

    /**
     * Sets the value of the addtlRptgInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RegulatoryReporting1 setAddtlRptgInf(String value) {
        this.addtlRptgInf = value;
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
