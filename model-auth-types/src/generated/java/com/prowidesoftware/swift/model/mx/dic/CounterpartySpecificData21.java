
package com.prowidesoftware.swift.model.mx.dic;

import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Data related specifically to counterparties.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CounterpartySpecificData21", propOrder = {
    "ctrPty",
    "valtn",
    "coll",
    "rptgDtTm"
})
public class CounterpartySpecificData21 {

    @XmlElement(name = "CtrPty", required = true)
    protected TradeCounterpartyReport8 ctrPty;
    @XmlElement(name = "Valtn")
    protected ContractValuationData3 valtn;
    @XmlElement(name = "Coll")
    protected TradeCollateralReport2 coll;
    @XmlElement(name = "RptgDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar rptgDtTm;

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport8 }
     *     
     */
    public TradeCounterpartyReport8 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport8 }
     *     
     */
    public CounterpartySpecificData21 setCtrPty(TradeCounterpartyReport8 value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractValuationData3 }
     *     
     */
    public ContractValuationData3 getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractValuationData3 }
     *     
     */
    public CounterpartySpecificData21 setValtn(ContractValuationData3 value) {
        this.valtn = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCollateralReport2 }
     *     
     */
    public TradeCollateralReport2 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCollateralReport2 }
     *     
     */
    public CounterpartySpecificData21 setColl(TradeCollateralReport2 value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CounterpartySpecificData21 setRptgDtTm(Calendar value) {
        this.rptgDtTm = value;
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

}
