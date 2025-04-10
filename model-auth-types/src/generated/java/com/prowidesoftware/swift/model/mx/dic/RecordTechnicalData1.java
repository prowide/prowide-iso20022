
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
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
 * Instrument specific technical data to support identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecordTechnicalData1", propOrder = {
    "rctDtTm",
    "xchgRsn"
})
public class RecordTechnicalData1 {

    @XmlElement(name = "RctDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime rctDtTm;
    @XmlElement(name = "XchgRsn", required = true)
    @XmlSchemaType(name = "string")
    protected List<AuthorityExchangeReason1Code> xchgRsn;

    /**
     * Gets the value of the rctDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getRctDtTm() {
        return rctDtTm;
    }

    /**
     * Sets the value of the rctDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RecordTechnicalData1 setRctDtTm(OffsetDateTime value) {
        this.rctDtTm = value;
        return this;
    }

    /**
     * Gets the value of the xchgRsn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the xchgRsn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXchgRsn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AuthorityExchangeReason1Code }
     * 
     * 
     * @return
     *     The value of the xchgRsn property.
     */
    public List<AuthorityExchangeReason1Code> getXchgRsn() {
        if (xchgRsn == null) {
            xchgRsn = new ArrayList<>();
        }
        return this.xchgRsn;
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
     * Adds a new item to the xchgRsn list.
     * @see #getXchgRsn()
     * 
     */
    public RecordTechnicalData1 addXchgRsn(AuthorityExchangeReason1Code xchgRsn) {
        getXchgRsn().add(xchgRsn);
        return this;
    }

}
