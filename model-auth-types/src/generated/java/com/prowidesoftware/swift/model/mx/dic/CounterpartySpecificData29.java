
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
@XmlType(name = "CounterpartySpecificData29", propOrder = {
    "ctrPty",
    "valtn",
    "coll",
    "rptgTmStmp"
})
public class CounterpartySpecificData29 {

    @XmlElement(name = "CtrPty", required = true)
    protected TradeCounterpartyReport14 ctrPty;
    @XmlElement(name = "Valtn")
    protected ContractValuationData6 valtn;
    @XmlElement(name = "Coll")
    protected TradeCollateralReport5 coll;
    @XmlElement(name = "RptgTmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected Calendar rptgTmStmp;

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport14 }
     *     
     */
    public TradeCounterpartyReport14 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport14 }
     *     
     */
    public CounterpartySpecificData29 setCtrPty(TradeCounterpartyReport14 value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the valtn property.
     * 
     * @return
     *     possible object is
     *     {@link ContractValuationData6 }
     *     
     */
    public ContractValuationData6 getValtn() {
        return valtn;
    }

    /**
     * Sets the value of the valtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractValuationData6 }
     *     
     */
    public CounterpartySpecificData29 setValtn(ContractValuationData6 value) {
        this.valtn = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCollateralReport5 }
     *     
     */
    public TradeCollateralReport5 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCollateralReport5 }
     *     
     */
    public CounterpartySpecificData29 setColl(TradeCollateralReport5 value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CounterpartySpecificData29 setRptgTmStmp(Calendar value) {
        this.rptgTmStmp = value;
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
