
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
 * Specifies the details on the settlement fails per participant.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementFailsParticipant1", propOrder = {
    "lei",
    "rank",
    "aggt"
})
public class SettlementFailsParticipant1 {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "Rank", required = true)
    protected String rank;
    @XmlElement(name = "Aggt", required = true)
    protected SettlementTotalData1 aggt;

    /**
     * Gets the value of the lei property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLEI() {
        return lei;
    }

    /**
     * Sets the value of the lei property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailsParticipant1 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the rank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRank() {
        return rank;
    }

    /**
     * Sets the value of the rank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementFailsParticipant1 setRank(String value) {
        this.rank = value;
        return this;
    }

    /**
     * Gets the value of the aggt property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementTotalData1 getAggt() {
        return aggt;
    }

    /**
     * Sets the value of the aggt property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementTotalData1 }
     *     
     */
    public SettlementFailsParticipant1 setAggt(SettlementTotalData1 value) {
        this.aggt = value;
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
