
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
 * Details of the demand withdrawal notification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UndertakingDemandWithdrawal1", propOrder = {
    "udrtkgId",
    "advsgPtyRefNb",
    "dmndDtls",
    "cnfrmrRefNb"
})
public class UndertakingDemandWithdrawal1 {

    @XmlElement(name = "UdrtkgId", required = true)
    protected Undertaking6 udrtkgId;
    @XmlElement(name = "AdvsgPtyRefNb")
    protected String advsgPtyRefNb;
    @XmlElement(name = "DmndDtls", required = true)
    protected Demand3 dmndDtls;
    @XmlElement(name = "CnfrmrRefNb")
    protected String cnfrmrRefNb;

    /**
     * Gets the value of the udrtkgId property.
     * 
     * @return
     *     possible object is
     *     {@link Undertaking6 }
     *     
     */
    public Undertaking6 getUdrtkgId() {
        return udrtkgId;
    }

    /**
     * Sets the value of the udrtkgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Undertaking6 }
     *     
     */
    public UndertakingDemandWithdrawal1 setUdrtkgId(Undertaking6 value) {
        this.udrtkgId = value;
        return this;
    }

    /**
     * Gets the value of the advsgPtyRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvsgPtyRefNb() {
        return advsgPtyRefNb;
    }

    /**
     * Sets the value of the advsgPtyRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingDemandWithdrawal1 setAdvsgPtyRefNb(String value) {
        this.advsgPtyRefNb = value;
        return this;
    }

    /**
     * Gets the value of the dmndDtls property.
     * 
     * @return
     *     possible object is
     *     {@link Demand3 }
     *     
     */
    public Demand3 getDmndDtls() {
        return dmndDtls;
    }

    /**
     * Sets the value of the dmndDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link Demand3 }
     *     
     */
    public UndertakingDemandWithdrawal1 setDmndDtls(Demand3 value) {
        this.dmndDtls = value;
        return this;
    }

    /**
     * Gets the value of the cnfrmrRefNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnfrmrRefNb() {
        return cnfrmrRefNb;
    }

    /**
     * Sets the value of the cnfrmrRefNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public UndertakingDemandWithdrawal1 setCnfrmrRefNb(String value) {
        this.cnfrmrRefNb = value;
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
