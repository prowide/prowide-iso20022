
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
 * Subscription leg, or switch-in, of a switch order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchSubscriptionLegOrder2", propOrder = {
    "legId",
    "finInstrmDtls",
    "finInstrmQtyChc",
    "incmPref",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "chrgDtls",
    "comssnDtls",
    "taxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls"
})
public class SwitchSubscriptionLegOrder2 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument6 finInstrmDtls;
    @XmlElement(name = "FinInstrmQtyChc")
    protected FinancialInstrumentQuantity4Choice finInstrmQtyChc;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "ReqdNAVCcy")
    protected String reqdNAVCcy;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge8> chrgDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission6> comssnDtls;
    @XmlElement(name = "TaxDtls")
    protected List<Tax6> taxDtls;
    @XmlElement(name = "SttlmAndCtdyDtls")
    protected FundSettlementParameters4 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected NameAndAddress4 physDlvryDtls;

    /**
     * Gets the value of the legId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegId() {
        return legId;
    }

    /**
     * Sets the value of the legId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegOrder2 setLegId(String value) {
        this.legId = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public FinancialInstrument6 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument6 }
     *     
     */
    public SwitchSubscriptionLegOrder2 setFinInstrmDtls(FinancialInstrument6 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity4Choice }
     *     
     */
    public FinancialInstrumentQuantity4Choice getFinInstrmQtyChc() {
        return finInstrmQtyChc;
    }

    /**
     * Sets the value of the finInstrmQtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity4Choice }
     *     
     */
    public SwitchSubscriptionLegOrder2 setFinInstrmQtyChc(FinancialInstrumentQuantity4Choice value) {
        this.finInstrmQtyChc = value;
        return this;
    }

    /**
     * Gets the value of the incmPref property.
     * 
     * @return
     *     possible object is
     *     {@link IncomePreference1Code }
     *     
     */
    public IncomePreference1Code getIncmPref() {
        return incmPref;
    }

    /**
     * Sets the value of the incmPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link IncomePreference1Code }
     *     
     */
    public SwitchSubscriptionLegOrder2 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegOrder2 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the reqdNAVCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdNAVCcy() {
        return reqdNAVCcy;
    }

    /**
     * Sets the value of the reqdNAVCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwitchSubscriptionLegOrder2 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge8 }
     * 
     * 
     */
    public List<Charge8> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<Charge8>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comssnDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComssnDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Commission6 }
     * 
     * 
     */
    public List<Commission6> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<Commission6>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax6 }
     * 
     * 
     */
    public List<Tax6> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<Tax6>();
        }
        return this.taxDtls;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters4 }
     *     
     */
    public FundSettlementParameters4 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters4 }
     *     
     */
    public SwitchSubscriptionLegOrder2 setSttlmAndCtdyDtls(FundSettlementParameters4 value) {
        this.sttlmAndCtdyDtls = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryInd property.
     * 
     */
    public boolean isPhysDlvryInd() {
        return physDlvryInd;
    }

    /**
     * Sets the value of the physDlvryInd property.
     * 
     */
    public SwitchSubscriptionLegOrder2 setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link NameAndAddress4 }
     *     
     */
    public NameAndAddress4 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameAndAddress4 }
     *     
     */
    public SwitchSubscriptionLegOrder2 setPhysDlvryDtls(NameAndAddress4 value) {
        this.physDlvryDtls = value;
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
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public SwitchSubscriptionLegOrder2 addChrgDtls(Charge8 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public SwitchSubscriptionLegOrder2 addComssnDtls(Commission6 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public SwitchSubscriptionLegOrder2 addTaxDtls(Tax6 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
