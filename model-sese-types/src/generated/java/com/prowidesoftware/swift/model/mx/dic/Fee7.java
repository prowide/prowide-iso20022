
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Fee7", propOrder = {
    "tp",
    "bsis",
    "amt",
    "dscntDtls",
    "chrgBr",
    "rcptId"
})
public class Fee7 {

    @XmlElement(name = "Tp", required = true)
    protected ChargeType6Choice tp;
    @XmlElement(name = "Bsis")
    protected ChargeBasis2Choice bsis;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "DscntDtls")
    protected ChargeOrCommissionDiscount2 dscntDtls;
    @XmlElement(name = "ChrgBr")
    @XmlSchemaType(name = "string")
    protected ChargeBearer1Code chrgBr;
    @XmlElement(name = "RcptId")
    protected PartyIdentification139 rcptId;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeType6Choice }
     *     
     */
    public ChargeType6Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeType6Choice }
     *     
     */
    public Fee7 setTp(ChargeType6Choice value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the bsis property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public ChargeBasis2Choice getBsis() {
        return bsis;
    }

    /**
     * Sets the value of the bsis property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBasis2Choice }
     *     
     */
    public Fee7 setBsis(ChargeBasis2Choice value) {
        this.bsis = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Fee7 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the dscntDtls property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeOrCommissionDiscount2 }
     *     
     */
    public ChargeOrCommissionDiscount2 getDscntDtls() {
        return dscntDtls;
    }

    /**
     * Sets the value of the dscntDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeOrCommissionDiscount2 }
     *     
     */
    public Fee7 setDscntDtls(ChargeOrCommissionDiscount2 value) {
        this.dscntDtls = value;
        return this;
    }

    /**
     * Gets the value of the chrgBr property.
     * 
     * @return
     *     possible object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public ChargeBearer1Code getChrgBr() {
        return chrgBr;
    }

    /**
     * Sets the value of the chrgBr property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargeBearer1Code }
     *     
     */
    public Fee7 setChrgBr(ChargeBearer1Code value) {
        this.chrgBr = value;
        return this;
    }

    /**
     * Gets the value of the rcptId property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification139 }
     *     
     */
    public PartyIdentification139 getRcptId() {
        return rcptId;
    }

    /**
     * Sets the value of the rcptId property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification139 }
     *     
     */
    public Fee7 setRcptId(PartyIdentification139 value) {
        this.rcptId = value;
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
