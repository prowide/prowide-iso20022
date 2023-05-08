
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
 * Completion of a securities settlement instruction, wherein securities are delivered/debited from a securities account and received/credited to the designated securities account.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliverInformation7", propOrder = {
    "fctvSttlmDt",
    "sttlmAmt",
    "stmpDty",
    "netAmt",
    "chrgDtls",
    "comssnDtls",
    "taxDtls",
    "sttlmPtiesDtls",
    "physTrf",
    "physTrfDtls"
})
public class DeliverInformation7 {

    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTimeChoice fctvSttlmDt;
    @XmlElement(name = "SttlmAmt")
    protected ActiveCurrencyAndAmount sttlmAmt;
    @XmlElement(name = "StmpDty")
    @XmlSchemaType(name = "string")
    protected StampDutyType2Code stmpDty;
    @XmlElement(name = "NetAmt")
    protected ActiveCurrencyAndAmount netAmt;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge20> chrgDtls;
    @XmlElement(name = "ComssnDtls")
    protected List<Commission12> comssnDtls;
    @XmlElement(name = "TaxDtls")
    protected List<Tax15> taxDtls;
    @XmlElement(name = "SttlmPtiesDtls", required = true)
    protected DeliveringPartiesAndAccount8 sttlmPtiesDtls;
    @XmlElement(name = "PhysTrf")
    @XmlSchemaType(name = "string")
    protected PhysicalTransferType1Code physTrf;
    @XmlElement(name = "PhysTrfDtls")
    protected DeliveryParameters4 physTrfDtls;

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DeliverInformation7 setFctvSttlmDt(DateAndDateTimeChoice value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the sttlmAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getSttlmAmt() {
        return sttlmAmt;
    }

    /**
     * Sets the value of the sttlmAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public DeliverInformation7 setSttlmAmt(ActiveCurrencyAndAmount value) {
        this.sttlmAmt = value;
        return this;
    }

    /**
     * Gets the value of the stmpDty property.
     * 
     * @return
     *     possible object is
     *     {@link StampDutyType2Code }
     *     
     */
    public StampDutyType2Code getStmpDty() {
        return stmpDty;
    }

    /**
     * Sets the value of the stmpDty property.
     * 
     * @param value
     *     allowed object is
     *     {@link StampDutyType2Code }
     *     
     */
    public DeliverInformation7 setStmpDty(StampDutyType2Code value) {
        this.stmpDty = value;
        return this;
    }

    /**
     * Gets the value of the netAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getNetAmt() {
        return netAmt;
    }

    /**
     * Sets the value of the netAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public DeliverInformation7 setNetAmt(ActiveCurrencyAndAmount value) {
        this.netAmt = value;
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
     * {@link Charge20 }
     * 
     * 
     * @return
     *     The value of the chrgDtls property.
     */
    public List<Charge20> getChrgDtls() {
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
     * {@link Commission12 }
     * 
     * 
     * @return
     *     The value of the comssnDtls property.
     */
    public List<Commission12> getComssnDtls() {
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
     * {@link Tax15 }
     * 
     * 
     * @return
     *     The value of the taxDtls property.
     */
    public List<Tax15> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<>();
        }
        return this.taxDtls;
    }

    /**
     * Gets the value of the sttlmPtiesDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveringPartiesAndAccount8 }
     *     
     */
    public DeliveringPartiesAndAccount8 getSttlmPtiesDtls() {
        return sttlmPtiesDtls;
    }

    /**
     * Sets the value of the sttlmPtiesDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveringPartiesAndAccount8 }
     *     
     */
    public DeliverInformation7 setSttlmPtiesDtls(DeliveringPartiesAndAccount8 value) {
        this.sttlmPtiesDtls = value;
        return this;
    }

    /**
     * Gets the value of the physTrf property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public PhysicalTransferType1Code getPhysTrf() {
        return physTrf;
    }

    /**
     * Sets the value of the physTrf property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalTransferType1Code }
     *     
     */
    public DeliverInformation7 setPhysTrf(PhysicalTransferType1Code value) {
        this.physTrf = value;
        return this;
    }

    /**
     * Gets the value of the physTrfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public DeliveryParameters4 getPhysTrfDtls() {
        return physTrfDtls;
    }

    /**
     * Sets the value of the physTrfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link DeliveryParameters4 }
     *     
     */
    public DeliverInformation7 setPhysTrfDtls(DeliveryParameters4 value) {
        this.physTrfDtls = value;
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
    public DeliverInformation7 addChrgDtls(Charge20 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the comssnDtls list.
     * @see #getComssnDtls()
     * 
     */
    public DeliverInformation7 addComssnDtls(Commission12 comssnDtls) {
        getComssnDtls().add(comssnDtls);
        return this;
    }

    /**
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public DeliverInformation7 addTaxDtls(Tax15 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

}
