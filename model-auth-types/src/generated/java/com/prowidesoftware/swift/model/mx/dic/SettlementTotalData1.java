
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
 * Specifies the aggregated data of settlement instructions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementTotalData1", propOrder = {
    "sttld",
    "faild",
    "ttl",
    "faildRate"
})
public class SettlementTotalData1 {

    @XmlElement(name = "Sttld", required = true)
    protected SettlementDataVolume2 sttld;
    @XmlElement(name = "Faild", required = true)
    protected SettlementDataVolume2 faild;
    @XmlElement(name = "Ttl", required = true)
    protected SettlementDataVolume2 ttl;
    @XmlElement(name = "FaildRate", required = true)
    protected SettlementDataRate2 faildRate;

    /**
     * Gets the value of the sttld property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementDataVolume2 getSttld() {
        return sttld;
    }

    /**
     * Sets the value of the sttld property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementTotalData1 setSttld(SettlementDataVolume2 value) {
        this.sttld = value;
        return this;
    }

    /**
     * Gets the value of the faild property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementDataVolume2 getFaild() {
        return faild;
    }

    /**
     * Sets the value of the faild property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementTotalData1 setFaild(SettlementDataVolume2 value) {
        this.faild = value;
        return this;
    }

    /**
     * Gets the value of the ttl property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementDataVolume2 getTtl() {
        return ttl;
    }

    /**
     * Sets the value of the ttl property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataVolume2 }
     *     
     */
    public SettlementTotalData1 setTtl(SettlementDataVolume2 value) {
        this.ttl = value;
        return this;
    }

    /**
     * Gets the value of the faildRate property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDataRate2 }
     *     
     */
    public SettlementDataRate2 getFaildRate() {
        return faildRate;
    }

    /**
     * Sets the value of the faildRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDataRate2 }
     *     
     */
    public SettlementTotalData1 setFaildRate(SettlementDataRate2 value) {
        this.faildRate = value;
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
