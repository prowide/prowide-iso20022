
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
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
 * Specifies an interest payment schedule, that is an amount that must be paid no sooner than the expected payment date and no later than the due date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InterestPaymentSchedule1", propOrder = {
    "intrstSchdlId",
    "amt",
    "xpctdDt",
    "dueDt",
    "addtlInf"
})
public class InterestPaymentSchedule1 {

    @XmlElement(name = "IntrstSchdlId")
    protected String intrstSchdlId;
    @XmlElement(name = "Amt")
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "XpctdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpctdDt;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dueDt;
    @XmlElement(name = "AddtlInf")
    protected String addtlInf;

    /**
     * Gets the value of the intrstSchdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntrstSchdlId() {
        return intrstSchdlId;
    }

    /**
     * Sets the value of the intrstSchdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentSchedule1 setIntrstSchdlId(String value) {
        this.intrstSchdlId = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public InterestPaymentSchedule1 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the xpctdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getXpctdDt() {
        return xpctdDt;
    }

    /**
     * Sets the value of the xpctdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentSchedule1 setXpctdDt(LocalDate value) {
        this.xpctdDt = value;
        return this;
    }

    /**
     * Gets the value of the dueDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getDueDt() {
        return dueDt;
    }

    /**
     * Sets the value of the dueDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentSchedule1 setDueDt(LocalDate value) {
        this.dueDt = value;
        return this;
    }

    /**
     * Gets the value of the addtlInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlInf() {
        return addtlInf;
    }

    /**
     * Sets the value of the addtlInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public InterestPaymentSchedule1 setAddtlInf(String value) {
        this.addtlInf = value;
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
