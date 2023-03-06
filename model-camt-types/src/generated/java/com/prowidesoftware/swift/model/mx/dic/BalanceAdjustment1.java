
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the balance adjustments for a specific service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BalanceAdjustment1", propOrder = {
    "tp",
    "desc",
    "balAmt",
    "avrgAmt",
    "errDt",
    "pstngDt",
    "days",
    "earngsAdjstmntAmt"
})
public class BalanceAdjustment1 {

    @XmlElement(name = "Tp", required = true)
    @XmlSchemaType(name = "string")
    protected BalanceAdjustmentType1Code tp;
    @XmlElement(name = "Desc", required = true)
    protected String desc;
    @XmlElement(name = "BalAmt", required = true)
    protected AmountAndDirection34 balAmt;
    @XmlElement(name = "AvrgAmt")
    protected AmountAndDirection34 avrgAmt;
    @XmlElement(name = "ErrDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar errDt;
    @XmlElement(name = "PstngDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar pstngDt;
    @XmlElement(name = "Days")
    protected BigDecimal days;
    @XmlElement(name = "EarngsAdjstmntAmt")
    protected AmountAndDirection34 earngsAdjstmntAmt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link BalanceAdjustmentType1Code }
     *     
     */
    public BalanceAdjustmentType1Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BalanceAdjustmentType1Code }
     *     
     */
    public BalanceAdjustment1 setTp(BalanceAdjustmentType1Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the desc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesc() {
        return desc;
    }

    /**
     * Sets the value of the desc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BalanceAdjustment1 setDesc(String value) {
        this.desc = value;
        return this;
    }

    /**
     * Gets the value of the balAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getBalAmt() {
        return balAmt;
    }

    /**
     * Sets the value of the balAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BalanceAdjustment1 setBalAmt(AmountAndDirection34 value) {
        this.balAmt = value;
        return this;
    }

    /**
     * Gets the value of the avrgAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getAvrgAmt() {
        return avrgAmt;
    }

    /**
     * Sets the value of the avrgAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BalanceAdjustment1 setAvrgAmt(AmountAndDirection34 value) {
        this.avrgAmt = value;
        return this;
    }

    /**
     * Gets the value of the errDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getErrDt() {
        return errDt;
    }

    /**
     * Sets the value of the errDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BalanceAdjustment1 setErrDt(XMLGregorianCalendar value) {
        this.errDt = value;
        return this;
    }

    /**
     * Gets the value of the pstngDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getPstngDt() {
        return pstngDt;
    }

    /**
     * Sets the value of the pstngDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public BalanceAdjustment1 setPstngDt(XMLGregorianCalendar value) {
        this.pstngDt = value;
        return this;
    }

    /**
     * Gets the value of the days property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDays() {
        return days;
    }

    /**
     * Sets the value of the days property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public BalanceAdjustment1 setDays(BigDecimal value) {
        this.days = value;
        return this;
    }

    /**
     * Gets the value of the earngsAdjstmntAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public AmountAndDirection34 getEarngsAdjstmntAmt() {
        return earngsAdjstmntAmt;
    }

    /**
     * Sets the value of the earngsAdjstmntAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountAndDirection34 }
     *     
     */
    public BalanceAdjustment1 setEarngsAdjstmntAmt(AmountAndDirection34 value) {
        this.earngsAdjstmntAmt = value;
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
