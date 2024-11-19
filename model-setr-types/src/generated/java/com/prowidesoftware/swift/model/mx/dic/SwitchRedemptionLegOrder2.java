
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
 * Redemption leg, or switch-out, of a switch transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SwitchRedemptionLegOrder2", propOrder = {
    "legId",
    "finInstrmDtls",
    "finInstrmQtyChc",
    "incmPref",
    "grp1Or2Units",
    "reqdSttlmCcy",
    "reqdNAVCcy",
    "chrgDtls",
    "comssnDtls",
    "taxDtls",
    "sttlmAndCtdyDtls",
    "physDlvryInd",
    "physDlvryDtls"
})
public class SwitchRedemptionLegOrder2 {

    @XmlElement(name = "LegId")
    protected String legId;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument6 finInstrmDtls;
    @XmlElement(name = "FinInstrmQtyChc")
    protected FinancialInstrumentQuantity3Choice finInstrmQtyChc;
    @XmlElement(name = "IncmPref")
    @XmlSchemaType(name = "string")
    protected IncomePreference1Code incmPref;
    @XmlElement(name = "Grp1Or2Units")
    @XmlSchemaType(name = "string")
    protected UKTaxGroupUnitCode grp1Or2Units;
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
    protected FundSettlementParameters3 sttlmAndCtdyDtls;
    @XmlElement(name = "PhysDlvryInd")
    protected boolean physDlvryInd;
    @XmlElement(name = "PhysDlvryDtls")
    protected DeliveryParameters3 physDlvryDtls;

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
    public SwitchRedemptionLegOrder2 setLegId(String value) {
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
    public SwitchRedemptionLegOrder2 setFinInstrmDtls(FinancialInstrument6 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQtyChc property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity3Choice }
     *     
     */
    public FinancialInstrumentQuantity3Choice getFinInstrmQtyChc() {
        return finInstrmQtyChc;
    }

    /**
     * Sets the value of the finInstrmQtyChc property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity3Choice }
     *     
     */
    public SwitchRedemptionLegOrder2 setFinInstrmQtyChc(FinancialInstrumentQuantity3Choice value) {
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
    public SwitchRedemptionLegOrder2 setIncmPref(IncomePreference1Code value) {
        this.incmPref = value;
        return this;
    }

    /**
     * Gets the value of the grp1Or2Units property.
     * 
     * @return
     *     possible object is
     *     {@link UKTaxGroupUnitCode }
     *     
     */
    public UKTaxGroupUnitCode getGrp1Or2Units() {
        return grp1Or2Units;
    }

    /**
     * Sets the value of the grp1Or2Units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UKTaxGroupUnitCode }
     *     
     */
    public SwitchRedemptionLegOrder2 setGrp1Or2Units(UKTaxGroupUnitCode value) {
        this.grp1Or2Units = value;
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
    public SwitchRedemptionLegOrder2 setReqdSttlmCcy(String value) {
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
    public SwitchRedemptionLegOrder2 setReqdNAVCcy(String value) {
        this.reqdNAVCcy = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the chrgDtls property.
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
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge8> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the comssnDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the comssnDtls property.
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
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission6> getComssnDtls() {
        if (comssnDtls == null) {
            comssnDtls = new ArrayList<>();
        }
        return this.comssnDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the taxDtls property.
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
     * @return
     *     The value of the taxDtls property.
     */
    public List<Tax6> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<>();
        }
        return this.taxDtls;
    }

    /**
     * Gets the value of the sttlmAndCtdyDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FundSettlementParameters3 }
     *     
     */
    public FundSettlementParameters3 getSttlmAndCtdyDtls() {
        return sttlmAndCtdyDtls;
    }

    /**
     * Sets the value of the sttlmAndCtdyDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FundSettlementParameters3 }
     *     
     */
    public SwitchRedemptionLegOrder2 setSttlmAndCtdyDtls(FundSettlementParameters3 value) {
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
    public SwitchRedemptionLegOrder2 setPhysDlvryInd(boolean value) {
        this.physDlvryInd = value;
        return this;
    }

    /**
     * Gets the value of the physDlvryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public DeliveryParameters3 getPhysDlvryDtls() {
        return physDlvryDtls;
    }

    /**
     * Sets the value of the physDlvryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters3 }
     *     
     */
    public SwitchRedemptionLegOrder2 setPhysDlvryDtls(DeliveryParameters3 value) {
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
    public SwitchRedemptionLegOrder2 addChrgDtls(Charge8 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public SwitchRedemptionLegOrder2 addComssnDtls(Commission6 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public SwitchRedemptionLegOrder2 addTaxDtls(Tax6 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
