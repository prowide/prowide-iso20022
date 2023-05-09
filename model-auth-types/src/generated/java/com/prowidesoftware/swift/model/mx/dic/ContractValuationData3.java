
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
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
 * Information related to contract valuation.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ContractValuationData3", propOrder = {
    "ctrctVal",
    "tmStmp",
    "tp"
})
public class ContractValuationData3 {

    @XmlElement(name = "CtrctVal")
    protected AmountAndDirection54 ctrctVal;
    @XmlElement(name = "TmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime tmStmp;
    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected ValuationType1Code tp;

    /**
     * Gets the value of the ctrctVal property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection54 }
     *     
     */
    public AmountAndDirection54 getCtrctVal() {
        return ctrctVal;
    }

    /**
     * Sets the value of the ctrctVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection54 }
     *     
     */
    public ContractValuationData3 setCtrctVal(AmountAndDirection54 value) {
        this.ctrctVal = value;
        return this;
    }

    /**
     * Gets the value of the tmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getTmStmp() {
        return tmStmp;
    }

    /**
     * Sets the value of the tmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ContractValuationData3 setTmStmp(OffsetDateTime value) {
        this.tmStmp = value;
        return this;
    }

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationType1Code }
     *     
     */
    public ValuationType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationType1Code }
     *     
     */
    public ContractValuationData3 setTp(ValuationType1Code value) {
        this.tp = value;
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
