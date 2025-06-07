
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
 * Specifies the relationship record between two parties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeCounterpartyRelationshipRecord1", propOrder = {
    "startRltshPty",
    "endRltshPty",
    "rltshTp",
    "desc"
})
public class TradeCounterpartyRelationshipRecord1 {

    @XmlElement(name = "StartRltshPty", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCounterpartyType1Code startRltshPty;
    @XmlElement(name = "EndRltshPty", required = true)
    @XmlSchemaType(name = "string")
    protected TradeCounterpartyType1Code endRltshPty;
    @XmlElement(name = "RltshTp", required = true)
    protected TradeCounterpartyRelationship1Choice rltshTp;
    @XmlElement(name = "Desc")
    protected String desc;

    /**
     * Gets the value of the startRltshPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyType1Code getStartRltshPty() {
        return startRltshPty;
    }

    /**
     * Sets the value of the startRltshPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyRelationshipRecord1 setStartRltshPty(TradeCounterpartyType1Code value) {
        this.startRltshPty = value;
        return this;
    }

    /**
     * Gets the value of the endRltshPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyType1Code getEndRltshPty() {
        return endRltshPty;
    }

    /**
     * Sets the value of the endRltshPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyType1Code }
     *     
     */
    public TradeCounterpartyRelationshipRecord1 setEndRltshPty(TradeCounterpartyType1Code value) {
        this.endRltshPty = value;
        return this;
    }

    /**
     * Gets the value of the rltshTp property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyRelationship1Choice }
     *     
     */
    public TradeCounterpartyRelationship1Choice getRltshTp() {
        return rltshTp;
    }

    /**
     * Sets the value of the rltshTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyRelationship1Choice }
     *     
     */
    public TradeCounterpartyRelationshipRecord1 setRltshTp(TradeCounterpartyRelationship1Choice value) {
        this.rltshTp = value;
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
    public TradeCounterpartyRelationshipRecord1 setDesc(String value) {
        this.desc = value;
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
