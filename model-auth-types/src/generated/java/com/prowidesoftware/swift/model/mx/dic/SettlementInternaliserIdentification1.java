
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
 * Specifies the identification of the settlement internaliser.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInternaliserIdentification1", propOrder = {
    "lei",
    "rspnsblPrsn",
    "ctry",
    "brnchId"
})
public class SettlementInternaliserIdentification1 {

    @XmlElement(name = "LEI", required = true)
    protected String lei;
    @XmlElement(name = "RspnsblPrsn", required = true)
    protected ContactDetails4 rspnsblPrsn;
    @XmlElement(name = "Ctry", required = true)
    protected String ctry;
    @XmlElement(name = "BrnchId")
    protected String brnchId;

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
    public SettlementInternaliserIdentification1 setLEI(String value) {
        this.lei = value;
        return this;
    }

    /**
     * Gets the value of the rspnsblPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ContactDetails4 }
     *     
     */
    public ContactDetails4 getRspnsblPrsn() {
        return rspnsblPrsn;
    }

    /**
     * Sets the value of the rspnsblPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactDetails4 }
     *     
     */
    public SettlementInternaliserIdentification1 setRspnsblPrsn(ContactDetails4 value) {
        this.rspnsblPrsn = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementInternaliserIdentification1 setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the brnchId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrnchId() {
        return brnchId;
    }

    /**
     * Sets the value of the brnchId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SettlementInternaliserIdentification1 setBrnchId(String value) {
        this.brnchId = value;
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
