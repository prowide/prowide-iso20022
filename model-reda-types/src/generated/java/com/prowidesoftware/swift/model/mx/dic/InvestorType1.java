
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
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
 * Investor for which a financial instrument is targeted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorType1", propOrder = {
    "invstrTpRtl",
    "invstrTpPrfssnl",
    "invstrTpElgblCtrPty",
    "othr"
})
public class InvestorType1 {

    @XmlElement(name = "InvstrTpRtl")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code invstrTpRtl;
    @XmlElement(name = "InvstrTpPrfssnl")
    protected TargetMarket4Choice invstrTpPrfssnl;
    @XmlElement(name = "InvstrTpElgblCtrPty")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code invstrTpElgblCtrPty;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketInvestor1> othr;

    /**
     * Gets the value of the invstrTpRtl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getInvstrTpRtl() {
        return invstrTpRtl;
    }

    /**
     * Sets the value of the invstrTpRtl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorType1 setInvstrTpRtl(TargetMarket1Code value) {
        this.invstrTpRtl = value;
        return this;
    }

    /**
     * Gets the value of the invstrTpPrfssnl property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket4Choice }
     *     
     */
    public TargetMarket4Choice getInvstrTpPrfssnl() {
        return invstrTpPrfssnl;
    }

    /**
     * Sets the value of the invstrTpPrfssnl property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket4Choice }
     *     
     */
    public InvestorType1 setInvstrTpPrfssnl(TargetMarket4Choice value) {
        this.invstrTpPrfssnl = value;
        return this;
    }

    /**
     * Gets the value of the invstrTpElgblCtrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getInvstrTpElgblCtrPty() {
        return invstrTpElgblCtrPty;
    }

    /**
     * Sets the value of the invstrTpElgblCtrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorType1 setInvstrTpElgblCtrPty(TargetMarket1Code value) {
        this.invstrTpElgblCtrPty = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OtherTargetMarketInvestor1 }
     * 
     * 
     */
    public List<OtherTargetMarketInvestor1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherTargetMarketInvestor1>();
        }
        return this.othr;
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

    /**
     * Adds a new item to the othr list.
     * @see #getOthr()
     * 
     */
    public InvestorType1 addOthr(OtherTargetMarketInvestor1 othr) {
        getOthr().add(othr);
        return this;
    }

}
