
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
 * Specifies expected and due payment date.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentDateRange1", propOrder = {
    "pmtSchdlId",
    "xpctdDt",
    "dueDt"
})
public class PaymentDateRange1 {

    @XmlElement(name = "PmtSchdlId")
    protected String pmtSchdlId;
    @XmlElement(name = "XpctdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate xpctdDt;
    @XmlElement(name = "DueDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate dueDt;

    /**
     * Gets the value of the pmtSchdlId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtSchdlId() {
        return pmtSchdlId;
    }

    /**
     * Sets the value of the pmtSchdlId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentDateRange1 setPmtSchdlId(String value) {
        this.pmtSchdlId = value;
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
    public PaymentDateRange1 setXpctdDt(LocalDate value) {
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
    public PaymentDateRange1 setDueDt(LocalDate value) {
        this.dueDt = value;
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
