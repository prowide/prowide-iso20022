
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
 * Set of parameters used to calculate the fixing rate to be applied to a non-deliverable agreement.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonDeliverableForwardValuationConditions2", propOrder = {
    "sttlmCcy",
    "valtnDt",
    "addtlValtnInf",
    "sttlmPty"
})
public class NonDeliverableForwardValuationConditions2 {

    @XmlElement(name = "SttlmCcy", required = true)
    protected String sttlmCcy;
    @XmlElement(name = "ValtnDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate valtnDt;
    @XmlElement(name = "AddtlValtnInf")
    protected String addtlValtnInf;
    @XmlElement(name = "SttlmPty")
    protected PartyIdentification8Choice sttlmPty;

    /**
     * Gets the value of the sttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSttlmCcy() {
        return sttlmCcy;
    }

    /**
     * Sets the value of the sttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDeliverableForwardValuationConditions2 setSttlmCcy(String value) {
        this.sttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the valtnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getValtnDt() {
        return valtnDt;
    }

    /**
     * Sets the value of the valtnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDeliverableForwardValuationConditions2 setValtnDt(LocalDate value) {
        this.valtnDt = value;
        return this;
    }

    /**
     * Gets the value of the addtlValtnInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddtlValtnInf() {
        return addtlValtnInf;
    }

    /**
     * Sets the value of the addtlValtnInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public NonDeliverableForwardValuationConditions2 setAddtlValtnInf(String value) {
        this.addtlValtnInf = value;
        return this;
    }

    /**
     * Gets the value of the sttlmPty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public PartyIdentification8Choice getSttlmPty() {
        return sttlmPty;
    }

    /**
     * Sets the value of the sttlmPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification8Choice }
     *     
     */
    public NonDeliverableForwardValuationConditions2 setSttlmPty(PartyIdentification8Choice value) {
        this.sttlmPty = value;
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
