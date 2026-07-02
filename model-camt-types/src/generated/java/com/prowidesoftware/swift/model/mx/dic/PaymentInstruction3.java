
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
 * Instruction to pay an amount of money to an ultimate beneficiary, on behalf of an originator. This instruction may have to be forwarded several times to complete the settlement chain.
 * .
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentInstruction3", propOrder = {
    "reqdExctnDtTm",
    "pmtTp"
})
public class PaymentInstruction3 {

    @XmlElement(name = "ReqdExctnDtTm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar reqdExctnDtTm;
    @XmlElement(name = "PmtTp")
    protected PaymentType3Choice pmtTp;

    /**
     * Gets the value of the reqdExctnDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdExctnDtTm() {
        return reqdExctnDtTm;
    }

    /**
     * Sets the value of the reqdExctnDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public PaymentInstruction3 setReqdExctnDtTm(XMLGregorianCalendar value) {
        this.reqdExctnDtTm = value;
        return this;
    }

    /**
     * Gets the value of the pmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentType3Choice }
     *     
     */
    public PaymentType3Choice getPmtTp() {
        return pmtTp;
    }

    /**
     * Sets the value of the pmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentType3Choice }
     *     
     */
    public PaymentInstruction3 setPmtTp(PaymentType3Choice value) {
        this.pmtTp = value;
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
