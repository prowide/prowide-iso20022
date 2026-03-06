
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "PenaltyFinancialInstrumentIdentification1__1", propOrder = {
    "id",
    "sbjtToPnlties",
    "clssfctnTp",
    "lqdty",
    "fxData",
    "sctiesPnltyRateData"
})
public class PenaltyFinancialInstrumentIdentification11 {

    @XmlElement(name = "Id", required = true)
    protected SecurityIdentification191 id;
    @XmlElement(name = "SbjtToPnlties")
    protected Boolean sbjtToPnlties;
    @XmlElement(name = "ClssfctnTp")
    protected ClassificationType1Choice1 clssfctnTp;
    @XmlElement(name = "Lqdty")
    protected Boolean lqdty;
    @XmlElement(name = "FXData")
    protected List<ForeignExchangeRate31> fxData;
    @XmlElement(name = "SctiesPnltyRateData")
    protected PenaltyRate11 sctiesPnltyRateData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification11 setId(SecurityIdentification191 value) {
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
    public PenaltyFinancialInstrumentIdentification11 setSbjtToPnlties(Boolean value) {
        this.sbjtToPnlties = value;
        return this;
    }

    /**
     * Gets the value of the clssfctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link ClassificationType1Choice1 }
     *     
     */
    public ClassificationType1Choice1 getClssfctnTp() {
        return clssfctnTp;
    }

    /**
     * Sets the value of the clssfctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClassificationType1Choice1 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification11 setClssfctnTp(ClassificationType1Choice1 value) {
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
    public PenaltyFinancialInstrumentIdentification11 setLqdty(Boolean value) {
        this.lqdty = value;
        return this;
    }

    /**
     * Gets the value of the fxData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the fxData property.
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
     * {@link ForeignExchangeRate31 }
     * 
     * 
     * @return
     *     The value of the fxData property.
     */
    public List<ForeignExchangeRate31> getFXData() {
        if (fxData == null) {
            fxData = new ArrayList<>();
        }
        return this.fxData;
    }

    /**
     * Gets the value of the sctiesPnltyRateData property.
     * 
     * @return
     *     possible object is
     *     {@link PenaltyRate11 }
     *     
     */
    public PenaltyRate11 getSctiesPnltyRateData() {
        return sctiesPnltyRateData;
    }

    /**
     * Sets the value of the sctiesPnltyRateData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PenaltyRate11 }
     *     
     */
    public PenaltyFinancialInstrumentIdentification11 setSctiesPnltyRateData(PenaltyRate11 value) {
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
    public PenaltyFinancialInstrumentIdentification11 addFXData(ForeignExchangeRate31 fXData) {
        getFXData().add(fXData);
        return this;
    }

}
