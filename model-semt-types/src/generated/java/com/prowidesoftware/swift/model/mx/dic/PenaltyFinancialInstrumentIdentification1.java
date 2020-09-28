
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the details of the financial instrument subject to penalties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyFinancialInstrumentIdentification1", propOrder = {
    "id",
    "sbjtToPnlties",
    "clssfctnTp",
    "lqdty",
    "pricData",
    "fxData",
    "sctiesPnltyRateData"
})
public class PenaltyFinancialInstrumentIdentification1 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification19 id;
    @XmlElement(name = "SbjtToPnlties")
    protected Boolean sbjtToPnlties;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType1Choice clssfctnTp;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "PricData")
    protected PriceInformation25 pricData;
    @XmlElement(name = "FXData")
    protected List<ForeignExchangeRate3> fxData;
    @XmlElement(name = "SctiesPnltyRateData")
    protected PenaltyRate1 sctiesPnltyRateData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public SecurityIdentification19 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification19 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setId(SecurityIdentification19 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the sbjtToPnlties property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSbjtToPnlties() {
        return sbjtToPnlties;
    }

    /**
     * Sets the value of the sbjtToPnlties property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setSbjtToPnlties(Boolean value) {
        this.sbjtToPnlties = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public ClassificationType1Choice getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType1Choice }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setClssfctnTp(ClassificationType1Choice value) {
        this.clssfctnTp = value;
        return this;
    }

    /**
     * Gets the value of the lqdty property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isLqdty() {
        return lqdty;
    }

    /**
     * Sets the value of the lqdty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setLqdty(Boolean value) {
        this.lqdty = value;
        return this;
    }

    /**
     * Gets the value of the pricData property.
     * 
     * @return
     *     possible object is
     *     {@link PriceInformation25 }
     *     
     */
    public PriceInformation25 getPricData() {
        return pricData;
    }

    /**
     * Sets the value of the pricData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceInformation25 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setPricData(PriceInformation25 value) {
        this.pricData = value;
        return this;
    }

    /**
     * Gets the value of the fxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fxData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFXData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ForeignExchangeRate3 }
     * 
     * 
     */
    public List<ForeignExchangeRate3> getFXData() {
        if (fxData == null) {
            fxData = new ArrayList<ForeignExchangeRate3>();
        }
        return this.fxData;
    }

    /**
     * Gets the value of the sctiesPnltyRateData property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRate1 }
     *     
     */
    public PenaltyRate1 getSctiesPnltyRateData() {
        return sctiesPnltyRateData;
    }

    /**
     * Sets the value of the sctiesPnltyRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRate1 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification1 setSctiesPnltyRateData(PenaltyRate1 value) {
        this.sctiesPnltyRateData = value;
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
     * Adds a new item to the fXData list.
     * @see #getFXData()
     * 
     */
    public PenaltyFinancialInstrumentIdentification1 addFXData(ForeignExchangeRate3 fXData) {
        getFXData().add(fXData);
        return this;
    }

}
