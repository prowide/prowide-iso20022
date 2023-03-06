
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Knowledge and/or experience of an investor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvestorKnowledge1", propOrder = {
    "bsicInvstr",
    "infrmdInvstr",
    "advncdInvstr",
    "exprtInvstrDE",
    "othr"
})
public class InvestorKnowledge1 {

    @XmlElement(name = "BsicInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code bsicInvstr;
    @XmlElement(name = "InfrmdInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code infrmdInvstr;
    @XmlElement(name = "AdvncdInvstr")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code advncdInvstr;
    @XmlElement(name = "ExprtInvstrDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket1Code exprtInvstrDE;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketInvestorKnowledge1> othr;

    /**
     * Gets the value of the bsicInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getBsicInvstr() {
        return bsicInvstr;
    }

    /**
     * Sets the value of the bsicInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorKnowledge1 setBsicInvstr(TargetMarket1Code value) {
        this.bsicInvstr = value;
        return this;
    }

    /**
     * Gets the value of the infrmdInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getInfrmdInvstr() {
        return infrmdInvstr;
    }

    /**
     * Sets the value of the infrmdInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorKnowledge1 setInfrmdInvstr(TargetMarket1Code value) {
        this.infrmdInvstr = value;
        return this;
    }

    /**
     * Gets the value of the advncdInvstr property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getAdvncdInvstr() {
        return advncdInvstr;
    }

    /**
     * Sets the value of the advncdInvstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorKnowledge1 setAdvncdInvstr(TargetMarket1Code value) {
        this.advncdInvstr = value;
        return this;
    }

    /**
     * Gets the value of the exprtInvstrDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket1Code }
     *     
     */
    public TargetMarket1Code getExprtInvstrDE() {
        return exprtInvstrDE;
    }

    /**
     * Sets the value of the exprtInvstrDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket1Code }
     *     
     */
    public InvestorKnowledge1 setExprtInvstrDE(TargetMarket1Code value) {
        this.exprtInvstrDE = value;
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
     * {@link OtherTargetMarketInvestorKnowledge1 }
     * 
     * 
     */
    public List<OtherTargetMarketInvestorKnowledge1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherTargetMarketInvestorKnowledge1>();
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
    public InvestorKnowledge1 addOthr(OtherTargetMarketInvestorKnowledge1 othr) {
        getOthr().add(othr);
        return this;
    }

}
