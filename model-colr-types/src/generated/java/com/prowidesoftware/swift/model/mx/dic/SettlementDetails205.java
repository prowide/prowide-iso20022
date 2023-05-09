
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters which explicitly state the conditions that must be fulfilled before a particular transaction of a financial instrument can be settled. These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementDetails205", propOrder = {
    "tradDt",
    "sttlmPties",
    "collOwnrsh"
})
public class SettlementDetails205 {

    @XmlElement(name = "TradDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tradDt;
    @XmlElement(name = "SttlmPties")
    protected SettlementParties35Choice sttlmPties;
    @XmlElement(name = "CollOwnrsh", required = true)
    protected CollateralOwnership4 collOwnrsh;

    /**
     * Gets the value of the tradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTradDt() {
        return tradDt;
    }

    /**
     * Sets the value of the tradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementDetails205 setTradDt(OffsetDateTime value) {
        this.tradDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPties property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementParties35Choice }
     *     
     */
    public SettlementParties35Choice getSttlmPties() {
        return sttlmPties;
    }

    /**
     * Sets the value of the sttlmPties property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementParties35Choice }
     *     
     */
    public SettlementDetails205 setSttlmPties(SettlementParties35Choice value) {
        this.sttlmPties = value;
        return this;
    }

    /**
     * Gets the value of the collOwnrsh property.
     * 
     * @return
     *     possible object is
     *     {@link CollateralOwnership4 }
     *     
     */
    public CollateralOwnership4 getCollOwnrsh() {
        return collOwnrsh;
    }

    /**
     * Sets the value of the collOwnrsh property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollateralOwnership4 }
     *     
     */
    public SettlementDetails205 setCollOwnrsh(CollateralOwnership4 value) {
        this.collOwnrsh = value;
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
