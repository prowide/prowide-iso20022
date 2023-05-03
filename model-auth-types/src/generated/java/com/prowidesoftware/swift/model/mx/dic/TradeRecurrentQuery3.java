
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
 * Recurrent query criteria.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TradeRecurrentQuery3", propOrder = {
    "qryTp",
    "frqcy",
    "vldUntil"
})
public class TradeRecurrentQuery3 {

    @XmlElement(name = "QryTp", required = true)
    protected String qryTp;
    @XmlElement(name = "Frqcy", required = true)
    protected TradeQueryExecutionFrequency1Choice frqcy;
    @XmlElement(name = "VldUntil", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate vldUntil;

    /**
     * Gets the value of the qryTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQryTp() {
        return qryTp;
    }

    /**
     * Sets the value of the qryTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRecurrentQuery3 setQryTp(String value) {
        this.qryTp = value;
        return this;
    }

    /**
     * Gets the value of the frqcy property.
     * 
     * @return
     *     possible object is
     *     {@link TradeQueryExecutionFrequency1Choice }
     *     
     */
    public TradeQueryExecutionFrequency1Choice getFrqcy() {
        return frqcy;
    }

    /**
     * Sets the value of the frqcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeQueryExecutionFrequency1Choice }
     *     
     */
    public TradeRecurrentQuery3 setFrqcy(TradeQueryExecutionFrequency1Choice value) {
        this.frqcy = value;
        return this;
    }

    /**
     * Gets the value of the vldUntil property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getVldUntil() {
        return vldUntil;
    }

    /**
     * Sets the value of the vldUntil property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TradeRecurrentQuery3 setVldUntil(LocalDate value) {
        this.vldUntil = value;
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
