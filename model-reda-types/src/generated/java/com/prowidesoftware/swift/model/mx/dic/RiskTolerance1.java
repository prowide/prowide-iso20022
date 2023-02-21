
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Risk tolerance of an investor for which a financial instrument is targeted.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RiskTolerance1", propOrder = {
    "rskTlrncePRIIPSMthdlgy",
    "rskTlrnceUCITSMthdlgy",
    "rskTlrnceIntl",
    "rskTlrnceForNonPRIIPSAndNonUCITSES",
    "notForInvstrsWthTheLwstRskTlrnceDE",
    "othr"
})
public class RiskTolerance1 {

    @XmlElement(name = "RskTlrncePRIIPSMthdlgy")
    protected BigDecimal rskTlrncePRIIPSMthdlgy;
    @XmlElement(name = "RskTlrnceUCITSMthdlgy")
    protected BigDecimal rskTlrnceUCITSMthdlgy;
    @XmlElement(name = "RskTlrnceIntl")
    @XmlSchemaType(name = "string")
    protected RiskLevel1Code rskTlrnceIntl;
    @XmlElement(name = "RskTlrnceForNonPRIIPSAndNonUCITSES")
    protected BigDecimal rskTlrnceForNonPRIIPSAndNonUCITSES;
    @XmlElement(name = "NotForInvstrsWthTheLwstRskTlrnceDE")
    @XmlSchemaType(name = "string")
    protected TargetMarket2Code notForInvstrsWthTheLwstRskTlrnceDE;
    @XmlElement(name = "Othr")
    protected List<OtherTargetMarketRiskTolerance1> othr;

    /**
     * Gets the value of the rskTlrncePRIIPSMthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrncePRIIPSMthdlgy() {
        return rskTlrncePRIIPSMthdlgy;
    }

    /**
     * Sets the value of the rskTlrncePRIIPSMthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RiskTolerance1 setRskTlrncePRIIPSMthdlgy(BigDecimal value) {
        this.rskTlrncePRIIPSMthdlgy = value;
        return this;
    }

    /**
     * Gets the value of the rskTlrnceUCITSMthdlgy property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrnceUCITSMthdlgy() {
        return rskTlrnceUCITSMthdlgy;
    }

    /**
     * Sets the value of the rskTlrnceUCITSMthdlgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RiskTolerance1 setRskTlrnceUCITSMthdlgy(BigDecimal value) {
        this.rskTlrnceUCITSMthdlgy = value;
        return this;
    }

    /**
     * Gets the value of the rskTlrnceIntl property.
     * 
     * @return
     *     possible object is
     *     {@link RiskLevel1Code }
     *     
     */
    public RiskLevel1Code getRskTlrnceIntl() {
        return rskTlrnceIntl;
    }

    /**
     * Sets the value of the rskTlrnceIntl property.
     * 
     * @param value
     *     allowed object is
     *     {@link RiskLevel1Code }
     *     
     */
    public RiskTolerance1 setRskTlrnceIntl(RiskLevel1Code value) {
        this.rskTlrnceIntl = value;
        return this;
    }

    /**
     * Gets the value of the rskTlrnceForNonPRIIPSAndNonUCITSES property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getRskTlrnceForNonPRIIPSAndNonUCITSES() {
        return rskTlrnceForNonPRIIPSAndNonUCITSES;
    }

    /**
     * Sets the value of the rskTlrnceForNonPRIIPSAndNonUCITSES property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public RiskTolerance1 setRskTlrnceForNonPRIIPSAndNonUCITSES(BigDecimal value) {
        this.rskTlrnceForNonPRIIPSAndNonUCITSES = value;
        return this;
    }

    /**
     * Gets the value of the notForInvstrsWthTheLwstRskTlrnceDE property.
     * 
     * @return
     *     possible object is
     *     {@link TargetMarket2Code }
     *     
     */
    public TargetMarket2Code getNotForInvstrsWthTheLwstRskTlrnceDE() {
        return notForInvstrsWthTheLwstRskTlrnceDE;
    }

    /**
     * Sets the value of the notForInvstrsWthTheLwstRskTlrnceDE property.
     * 
     * @param value
     *     allowed object is
     *     {@link TargetMarket2Code }
     *     
     */
    public RiskTolerance1 setNotForInvstrsWthTheLwstRskTlrnceDE(TargetMarket2Code value) {
        this.notForInvstrsWthTheLwstRskTlrnceDE = value;
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
     * {@link OtherTargetMarketRiskTolerance1 }
     * 
     * 
     */
    public List<OtherTargetMarketRiskTolerance1> getOthr() {
        if (othr == null) {
            othr = new ArrayList<OtherTargetMarketRiskTolerance1>();
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
    public RiskTolerance1 addOthr(OtherTargetMarketRiskTolerance1 othr) {
        getOthr().add(othr);
        return this;
    }

}
