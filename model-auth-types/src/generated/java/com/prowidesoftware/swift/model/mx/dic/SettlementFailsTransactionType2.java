
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
 * Specifies the transaction type as defined in the relevant regulation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsTransactionType2", propOrder = {
    "sctiesBuyOrSell",
    "collMgmtOpr",
    "sctiesLndgOrBrrwg",
    "rpAgrmt",
    "othr"
})
public class SettlementFailsTransactionType2 {

    @XmlElement(name = "SctiesBuyOrSell", required = true)
    protected SettlementTotalData1Choice sctiesBuyOrSell;
    @XmlElement(name = "CollMgmtOpr", required = true)
    protected SettlementTotalData1Choice collMgmtOpr;
    @XmlElement(name = "SctiesLndgOrBrrwg", required = true)
    protected SettlementTotalData1Choice sctiesLndgOrBrrwg;
    @XmlElement(name = "RpAgrmt", required = true)
    protected SettlementTotalData1Choice rpAgrmt;
    @XmlElement(name = "Othr", required = true)
    protected SettlementTotalData1Choice othr;

    /**
     * Gets the value of the sctiesBuyOrSell property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getSctiesBuyOrSell() {
        return sctiesBuyOrSell;
    }

    /**
     * Sets the value of the sctiesBuyOrSell property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsTransactionType2 setSctiesBuyOrSell(SettlementTotalData1Choice value) {
        this.sctiesBuyOrSell = value;
        return this;
    }

    /**
     * Gets the value of the collMgmtOpr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getCollMgmtOpr() {
        return collMgmtOpr;
    }

    /**
     * Sets the value of the collMgmtOpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsTransactionType2 setCollMgmtOpr(SettlementTotalData1Choice value) {
        this.collMgmtOpr = value;
        return this;
    }

    /**
     * Gets the value of the sctiesLndgOrBrrwg property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getSctiesLndgOrBrrwg() {
        return sctiesLndgOrBrrwg;
    }

    /**
     * Sets the value of the sctiesLndgOrBrrwg property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsTransactionType2 setSctiesLndgOrBrrwg(SettlementTotalData1Choice value) {
        this.sctiesLndgOrBrrwg = value;
        return this;
    }

    /**
     * Gets the value of the rpAgrmt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getRpAgrmt() {
        return rpAgrmt;
    }

    /**
     * Sets the value of the rpAgrmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsTransactionType2 setRpAgrmt(SettlementTotalData1Choice value) {
        this.rpAgrmt = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementTotalData1Choice getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1Choice }
     *     
     */
    public SettlementFailsTransactionType2 setOthr(SettlementTotalData1Choice value) {
        this.othr = value;
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
