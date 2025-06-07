
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "ContractValuationData2", propOrder = {
    "ctrctVal",
    "tmStmp",
    "tp"
})
public class ContractValuationData2 {

    @XmlElement(name = "CtrctVal", required = true)
    protected AmountAndDirection54 ctrctVal;
    @XmlElement(name = "TmStmp", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tmStmp;
    @XmlElement(name = "Tp", required = true)
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
    public ContractValuationData2 setCtrctVal(AmountAndDirection54 value) {
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
    public XMLGregorianCalendar getTmStmp() {
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
    public ContractValuationData2 setTmStmp(XMLGregorianCalendar value) {
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
    public ContractValuationData2 setTp(ValuationType1Code value) {
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
