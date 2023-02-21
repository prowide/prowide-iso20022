
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Settlement of the securities in a securities transaction, that is, the instruction to deliver or receive securities, involving the payment of an amount of money or not.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SettlementInformation17", propOrder = {
    "sctiesQtyTp",
    "ctrctSttlmMnth",
    "minDnmtn",
    "minMltplQty",
    "devtgSttlmUnit"
})
public class SettlementInformation17 {

    @XmlElement(name = "SctiesQtyTp")
    protected SettlementUnitType3Choice sctiesQtyTp;
    @XmlElement(name = "CtrctSttlmMnth")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar ctrctSttlmMnth;
    @XmlElement(name = "MinDnmtn")
    protected FinancialInstrumentQuantity1Choice minDnmtn;
    @XmlElement(name = "MinMltplQty")
    protected FinancialInstrumentQuantity1Choice minMltplQty;
    @XmlElement(name = "DevtgSttlmUnit")
    protected List<FinancialInstrumentQuantity1Choice> devtgSttlmUnit;

    /**
     * Gets the value of the sctiesQtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementUnitType3Choice }
     *     
     */
    public SettlementUnitType3Choice getSctiesQtyTp() {
        return sctiesQtyTp;
    }

    /**
     * Sets the value of the sctiesQtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementUnitType3Choice }
     *     
     */
    public SettlementInformation17 setSctiesQtyTp(SettlementUnitType3Choice value) {
        this.sctiesQtyTp = value;
        return this;
    }

    /**
     * Gets the value of the ctrctSttlmMnth property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCtrctSttlmMnth() {
        return ctrctSttlmMnth;
    }

    /**
     * Sets the value of the ctrctSttlmMnth property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public SettlementInformation17 setCtrctSttlmMnth(XMLGregorianCalendar value) {
        this.ctrctSttlmMnth = value;
        return this;
    }

    /**
     * Gets the value of the minDnmtn property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinDnmtn() {
        return minDnmtn;
    }

    /**
     * Sets the value of the minDnmtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SettlementInformation17 setMinDnmtn(FinancialInstrumentQuantity1Choice value) {
        this.minDnmtn = value;
        return this;
    }

    /**
     * Gets the value of the minMltplQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public FinancialInstrumentQuantity1Choice getMinMltplQty() {
        return minMltplQty;
    }

    /**
     * Sets the value of the minMltplQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice }
     *     
     */
    public SettlementInformation17 setMinMltplQty(FinancialInstrumentQuantity1Choice value) {
        this.minMltplQty = value;
        return this;
    }

    /**
     * Gets the value of the devtgSttlmUnit property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the devtgSttlmUnit property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDevtgSttlmUnit().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentQuantity1Choice }
     * 
     * 
     */
    public List<FinancialInstrumentQuantity1Choice> getDevtgSttlmUnit() {
        if (devtgSttlmUnit == null) {
            devtgSttlmUnit = new ArrayList<FinancialInstrumentQuantity1Choice>();
        }
        return this.devtgSttlmUnit;
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
     * Adds a new item to the devtgSttlmUnit list.
     * @see #getDevtgSttlmUnit()
     * 
     */
    public SettlementInformation17 addDevtgSttlmUnit(FinancialInstrumentQuantity1Choice devtgSttlmUnit) {
        getDevtgSttlmUnit().add(devtgSttlmUnit);
        return this;
    }

}
