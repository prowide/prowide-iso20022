
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
 * Information related to the liabilities of the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiabilityDetails2", propOrder = {
    "hghstBnfclOwnrRate",
    "invstrCncntrtn",
    "invstrGrpBrkdwn",
    "brkdwnByCtry",
    "redDealgFrqcy",
    "ntceDays",
    "brkdwnByArrgmnt",
    "othrArrgmntAddtlInf",
    "mnthlyNetAsstValPerUnitInf",
    "mnthlySbcptInf",
    "mnthlyRedInf",
    "mnthlyPmtToInvstrInf",
    "mnthlyXchgRateInf"
})
public class LiabilityDetails2 {

    @XmlElement(name = "HghstBnfclOwnrRate", required = true)
    protected BigDecimal hghstBnfclOwnrRate;
    @XmlElement(name = "InvstrCncntrtn", required = true)
    protected InvestorConcentration1 invstrCncntrtn;
    @XmlElement(name = "InvstrGrpBrkdwn", required = true)
    protected List<InvestorGroupBreakdownType1> invstrGrpBrkdwn;
    @XmlElement(name = "BrkdwnByCtry", required = true)
    protected List<BreakdownByCountry3> brkdwnByCtry;
    @XmlElement(name = "RedDealgFrqcy", required = true)
    @XmlSchemaType(name = "string")
    protected EventFrequency9Code redDealgFrqcy;
    @XmlElement(name = "NtceDays", required = true)
    protected BigDecimal ntceDays;
    @XmlElement(name = "BrkdwnByArrgmnt", required = true)
    protected List<BreakdownByArrangement1> brkdwnByArrgmnt;
    @XmlElement(name = "OthrArrgmntAddtlInf")
    protected String othrArrgmntAddtlInf;
    @XmlElement(name = "MnthlyNetAsstValPerUnitInf", required = true)
    protected Month2Choice mnthlyNetAsstValPerUnitInf;
    @XmlElement(name = "MnthlySbcptInf", required = true)
    protected Month2Choice mnthlySbcptInf;
    @XmlElement(name = "MnthlyRedInf", required = true)
    protected Month2Choice mnthlyRedInf;
    @XmlElement(name = "MnthlyPmtToInvstrInf", required = true)
    protected Month2Choice mnthlyPmtToInvstrInf;
    @XmlElement(name = "MnthlyXchgRateInf", required = true)
    protected Month2Choice mnthlyXchgRateInf;

    /**
     * Gets the value of the hghstBnfclOwnrRate property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getHghstBnfclOwnrRate() {
        return hghstBnfclOwnrRate;
    }

    /**
     * Sets the value of the hghstBnfclOwnrRate property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LiabilityDetails2 setHghstBnfclOwnrRate(BigDecimal value) {
        this.hghstBnfclOwnrRate = value;
        return this;
    }

    /**
     * Gets the value of the invstrCncntrtn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestorConcentration1 }
     *     
     */
    public InvestorConcentration1 getInvstrCncntrtn() {
        return invstrCncntrtn;
    }

    /**
     * Sets the value of the invstrCncntrtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestorConcentration1 }
     *     
     */
    public LiabilityDetails2 setInvstrCncntrtn(InvestorConcentration1 value) {
        this.invstrCncntrtn = value;
        return this;
    }

    /**
     * Gets the value of the invstrGrpBrkdwn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invstrGrpBrkdwn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvstrGrpBrkdwn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestorGroupBreakdownType1 }
     * 
     * 
     */
    public List<InvestorGroupBreakdownType1> getInvstrGrpBrkdwn() {
        if (invstrGrpBrkdwn == null) {
            invstrGrpBrkdwn = new ArrayList<InvestorGroupBreakdownType1>();
        }
        return this.invstrGrpBrkdwn;
    }

    /**
     * Gets the value of the brkdwnByCtry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByCtry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByCtry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByCountry3 }
     * 
     * 
     */
    public List<BreakdownByCountry3> getBrkdwnByCtry() {
        if (brkdwnByCtry == null) {
            brkdwnByCtry = new ArrayList<BreakdownByCountry3>();
        }
        return this.brkdwnByCtry;
    }

    /**
     * Gets the value of the redDealgFrqcy property.
     * 
     * @return
     *     possible object is
     *     {@link EventFrequency9Code }
     *     
     */
    public EventFrequency9Code getRedDealgFrqcy() {
        return redDealgFrqcy;
    }

    /**
     * Sets the value of the redDealgFrqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventFrequency9Code }
     *     
     */
    public LiabilityDetails2 setRedDealgFrqcy(EventFrequency9Code value) {
        this.redDealgFrqcy = value;
        return this;
    }

    /**
     * Gets the value of the ntceDays property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNtceDays() {
        return ntceDays;
    }

    /**
     * Sets the value of the ntceDays property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public LiabilityDetails2 setNtceDays(BigDecimal value) {
        this.ntceDays = value;
        return this;
    }

    /**
     * Gets the value of the brkdwnByArrgmnt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the brkdwnByArrgmnt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBrkdwnByArrgmnt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BreakdownByArrangement1 }
     * 
     * 
     */
    public List<BreakdownByArrangement1> getBrkdwnByArrgmnt() {
        if (brkdwnByArrgmnt == null) {
            brkdwnByArrgmnt = new ArrayList<BreakdownByArrangement1>();
        }
        return this.brkdwnByArrgmnt;
    }

    /**
     * Gets the value of the othrArrgmntAddtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrArrgmntAddtlInf() {
        return othrArrgmntAddtlInf;
    }

    /**
     * Sets the value of the othrArrgmntAddtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LiabilityDetails2 setOthrArrgmntAddtlInf(String value) {
        this.othrArrgmntAddtlInf = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyNetAsstValPerUnitInf property.
     * 
     * @return
     *     possible object is
     *     {@link Month2Choice }
     *     
     */
    public Month2Choice getMnthlyNetAsstValPerUnitInf() {
        return mnthlyNetAsstValPerUnitInf;
    }

    /**
     * Sets the value of the mnthlyNetAsstValPerUnitInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month2Choice }
     *     
     */
    public LiabilityDetails2 setMnthlyNetAsstValPerUnitInf(Month2Choice value) {
        this.mnthlyNetAsstValPerUnitInf = value;
        return this;
    }

    /**
     * Gets the value of the mnthlySbcptInf property.
     * 
     * @return
     *     possible object is
     *     {@link Month2Choice }
     *     
     */
    public Month2Choice getMnthlySbcptInf() {
        return mnthlySbcptInf;
    }

    /**
     * Sets the value of the mnthlySbcptInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month2Choice }
     *     
     */
    public LiabilityDetails2 setMnthlySbcptInf(Month2Choice value) {
        this.mnthlySbcptInf = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyRedInf property.
     * 
     * @return
     *     possible object is
     *     {@link Month2Choice }
     *     
     */
    public Month2Choice getMnthlyRedInf() {
        return mnthlyRedInf;
    }

    /**
     * Sets the value of the mnthlyRedInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month2Choice }
     *     
     */
    public LiabilityDetails2 setMnthlyRedInf(Month2Choice value) {
        this.mnthlyRedInf = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyPmtToInvstrInf property.
     * 
     * @return
     *     possible object is
     *     {@link Month2Choice }
     *     
     */
    public Month2Choice getMnthlyPmtToInvstrInf() {
        return mnthlyPmtToInvstrInf;
    }

    /**
     * Sets the value of the mnthlyPmtToInvstrInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month2Choice }
     *     
     */
    public LiabilityDetails2 setMnthlyPmtToInvstrInf(Month2Choice value) {
        this.mnthlyPmtToInvstrInf = value;
        return this;
    }

    /**
     * Gets the value of the mnthlyXchgRateInf property.
     * 
     * @return
     *     possible object is
     *     {@link Month2Choice }
     *     
     */
    public Month2Choice getMnthlyXchgRateInf() {
        return mnthlyXchgRateInf;
    }

    /**
     * Sets the value of the mnthlyXchgRateInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Month2Choice }
     *     
     */
    public LiabilityDetails2 setMnthlyXchgRateInf(Month2Choice value) {
        this.mnthlyXchgRateInf = value;
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

    /**
     * Adds a new item to the invstrGrpBrkdwn list.
     * @see #getInvstrGrpBrkdwn()
     * 
     */
    public LiabilityDetails2 addInvstrGrpBrkdwn(InvestorGroupBreakdownType1 invstrGrpBrkdwn) {
        getInvstrGrpBrkdwn().add(invstrGrpBrkdwn);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByCtry list.
     * @see #getBrkdwnByCtry()
     * 
     */
    public LiabilityDetails2 addBrkdwnByCtry(BreakdownByCountry3 brkdwnByCtry) {
        getBrkdwnByCtry().add(brkdwnByCtry);
        return this;
    }

    /**
     * Adds a new item to the brkdwnByArrgmnt list.
     * @see #getBrkdwnByArrgmnt()
     * 
     */
    public LiabilityDetails2 addBrkdwnByArrgmnt(BreakdownByArrangement1 brkdwnByArrgmnt) {
        getBrkdwnByArrgmnt().add(brkdwnByArrgmnt);
        return this;
    }

}
