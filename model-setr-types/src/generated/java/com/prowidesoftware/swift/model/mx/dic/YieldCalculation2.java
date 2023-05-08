
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.Calendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Return provided by a financial instrument.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YieldCalculation2", propOrder = {
    "val",
    "clctnTp",
    "redPric",
    "valDt",
    "valPrd",
    "clctnDt"
})
public class YieldCalculation2 {

    @XmlElement(name = "Val", required = true)
    protected BigDecimal val;
    @XmlElement(name = "ClctnTp", required = true)
    @XmlSchemaType(name = "string")
    protected CalculationType1Code clctnTp;
    @XmlElement(name = "RedPric")
    protected Price4 redPric;
    @XmlElement(name = "ValDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar valDt;
    @XmlElement(name = "ValPrd")
    protected DateTimePeriodChoice valPrd;
    @XmlElement(name = "ClctnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar clctnDt;

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public YieldCalculation2 setVal(BigDecimal value) {
        this.val = value;
        return this;
    }

    /**
     * Gets the value of the clctnTp property.
     * 
     * @return
     *     possible object is
     *     {@link CalculationType1Code }
     *     
     */
    public CalculationType1Code getClctnTp() {
        return clctnTp;
    }

    /**
     * Sets the value of the clctnTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalculationType1Code }
     *     
     */
    public YieldCalculation2 setClctnTp(CalculationType1Code value) {
        this.clctnTp = value;
        return this;
    }

    /**
     * Gets the value of the redPric property.
     * 
     * @return
     *     possible object is
     *     {@link Price4 }
     *     
     */
    public Price4 getRedPric() {
        return redPric;
    }

    /**
     * Sets the value of the redPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link Price4 }
     *     
     */
    public YieldCalculation2 setRedPric(Price4 value) {
        this.redPric = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public YieldCalculation2 setValDt(Calendar value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the valPrd property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public DateTimePeriodChoice getValPrd() {
        return valPrd;
    }

    /**
     * Sets the value of the valPrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriodChoice }
     *     
     */
    public YieldCalculation2 setValPrd(DateTimePeriodChoice value) {
        this.valPrd = value;
        return this;
    }

    /**
     * Gets the value of the clctnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClctnDt() {
        return clctnDt;
    }

    /**
     * Sets the value of the clctnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public YieldCalculation2 setClctnDt(Calendar value) {
        this.clctnDt = value;
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
