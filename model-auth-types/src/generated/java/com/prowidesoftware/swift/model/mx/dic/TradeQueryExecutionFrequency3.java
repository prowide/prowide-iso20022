
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the frequency of the trade query execution.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeQueryExecutionFrequency3", propOrder = {
    "frqcyTp",
    "dlvryDay",
    "dayOfMnth"
})
public class TradeQueryExecutionFrequency3 {

    @XmlElement(name = "FrqcyTp", required = true)
    @XmlSchemaType(name = "string")
    protected Frequency14Code frqcyTp;
    @XmlElement(name = "DlvryDay")
    @XmlSchemaType(name = "string")
    protected List<WeekDay3Code> dlvryDay;
    @XmlElement(name = "DayOfMnth")
    protected List<BigDecimal> dayOfMnth;

    /**
     * Gets the value of the frqcyTp property.
     * 
     * @return
     *     possible object is
     *     {@link Frequency14Code }
     *     
     */
    public Frequency14Code getFrqcyTp() {
        return frqcyTp;
    }

    /**
     * Sets the value of the frqcyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frequency14Code }
     *     
     */
    public TradeQueryExecutionFrequency3 setFrqcyTp(Frequency14Code value) {
        this.frqcyTp = value;
        return this;
    }

    /**
     * Gets the value of the dlvryDay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dlvryDay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDlvryDay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeekDay3Code }
     * 
     * 
     */
    public List<WeekDay3Code> getDlvryDay() {
        if (dlvryDay == null) {
            dlvryDay = new ArrayList<WeekDay3Code>();
        }
        return this.dlvryDay;
    }

    /**
     * Gets the value of the dayOfMnth property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dayOfMnth property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDayOfMnth().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigDecimal }
     * 
     * 
     */
    public List<BigDecimal> getDayOfMnth() {
        if (dayOfMnth == null) {
            dayOfMnth = new ArrayList<BigDecimal>();
        }
        return this.dayOfMnth;
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
     * Adds a new item to the dlvryDay list.
     * @see #getDlvryDay()
     * 
     */
    public TradeQueryExecutionFrequency3 addDlvryDay(WeekDay3Code dlvryDay) {
        getDlvryDay().add(dlvryDay);
        return this;
    }

    /**
     * Adds a new item to the dayOfMnth list.
     * @see #getDayOfMnth()
     * 
     */
    public TradeQueryExecutionFrequency3 addDayOfMnth(BigDecimal dayOfMnth) {
        getDayOfMnth().add(dayOfMnth);
        return this;
    }

}
