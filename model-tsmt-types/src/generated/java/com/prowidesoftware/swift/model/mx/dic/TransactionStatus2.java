
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Identifies the future status of the transaction by means of a code and a period.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TransactionStatus2", propOrder = {
    "sts",
    "chngDtTm"
})
public class TransactionStatus2 {

    @XmlElement(name = "Sts", required = true)
    @XmlSchemaType(name = "string")
    protected BaselineStatus1Code sts;
    @XmlElement(name = "ChngDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime chngDtTm;

    /**
     * Gets the value of the sts property.
     * 
     * @return
     *     possible object is
     *     {@link BaselineStatus1Code }
     *     
     */
    public BaselineStatus1Code getSts() {
        return sts;
    }

    /**
     * Sets the value of the sts property.
     * 
     * @param value
     *     allowed object is
     *     {@link BaselineStatus1Code }
     *     
     */
    public TransactionStatus2 setSts(BaselineStatus1Code value) {
        this.sts = value;
        return this;
    }

    /**
     * Gets the value of the chngDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getChngDtTm() {
        return chngDtTm;
    }

    /**
     * Sets the value of the chngDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public TransactionStatus2 setChngDtTm(OffsetDateTime value) {
        this.chngDtTm = value;
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
