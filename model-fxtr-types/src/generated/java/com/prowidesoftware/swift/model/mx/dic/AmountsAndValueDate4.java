
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
 * Specifies the value date and the amounts traded in a foreign exchange option trade.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AmountsAndValueDate4", propOrder = {
    "callAmt",
    "putAmt",
    "optnSttlmCcy",
    "fnlSttlmDt"
})
public class AmountsAndValueDate4 {

    @XmlElement(name = "CallAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount callAmt;
    @XmlElement(name = "PutAmt", required = true)
    protected ActiveOrHistoricCurrencyAndAmount putAmt;
    @XmlElement(name = "OptnSttlmCcy")
    protected String optnSttlmCcy;
    @XmlElement(name = "FnlSttlmDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate fnlSttlmDt;

    /**
     * Gets the value of the callAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getCallAmt() {
        return callAmt;
    }

    /**
     * Sets the value of the callAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountsAndValueDate4 setCallAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.callAmt = value;
        return this;
    }

    /**
     * Gets the value of the putAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getPutAmt() {
        return putAmt;
    }

    /**
     * Sets the value of the putAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public AmountsAndValueDate4 setPutAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.putAmt = value;
        return this;
    }

    /**
     * Gets the value of the optnSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptnSttlmCcy() {
        return optnSttlmCcy;
    }

    /**
     * Sets the value of the optnSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmountsAndValueDate4 setOptnSttlmCcy(String value) {
        this.optnSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the fnlSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getFnlSttlmDt() {
        return fnlSttlmDt;
    }

    /**
     * Sets the value of the fnlSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public AmountsAndValueDate4 setFnlSttlmDt(LocalDate value) {
        this.fnlSttlmDt = value;
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
