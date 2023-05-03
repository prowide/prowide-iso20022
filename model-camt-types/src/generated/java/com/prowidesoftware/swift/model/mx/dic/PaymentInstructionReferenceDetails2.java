
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
 * Identifies a payment instruction by a simple set of characteristics which provides an unambiguous indentification of the instruction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstructionReferenceDetails2", propOrder = {
    "pmtInstrRef",
    "intrBkValDt",
    "instgAgtId"
})
public class PaymentInstructionReferenceDetails2 {

    @XmlElement(name = "PmtInstrRef", required = true)
    protected String pmtInstrRef;
    @XmlElement(name = "IntrBkValDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate intrBkValDt;
    @XmlElement(name = "InstgAgtId", required = true)
    protected String instgAgtId;

    /**
     * Gets the value of the pmtInstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtInstrRef() {
        return pmtInstrRef;
    }

    /**
     * Sets the value of the pmtInstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails2 setPmtInstrRef(String value) {
        this.pmtInstrRef = value;
        return this;
    }

    /**
     * Gets the value of the intrBkValDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getIntrBkValDt() {
        return intrBkValDt;
    }

    /**
     * Sets the value of the intrBkValDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails2 setIntrBkValDt(LocalDate value) {
        this.intrBkValDt = value;
        return this;
    }

    /**
     * Gets the value of the instgAgtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstgAgtId() {
        return instgAgtId;
    }

    /**
     * Sets the value of the instgAgtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstructionReferenceDetails2 setInstgAgtId(String value) {
        this.instgAgtId = value;
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
