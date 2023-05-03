
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetTime;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Choice between time and event fund transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DailyFundTransfer1Choice", propOrder = {
    "trfTm",
    "trfEvt"
})
public class DailyFundTransfer1Choice {

    @XmlElement(name = "TrfTm", type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected OffsetTime trfTm;
    @XmlElement(name = "TrfEvt")
    protected TransferEvent1 trfEvt;

    /**
     * Gets the value of the trfTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetTime getTrfTm() {
        return trfTm;
    }

    /**
     * Sets the value of the trfTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DailyFundTransfer1Choice setTrfTm(OffsetTime value) {
        this.trfTm = value;
        return this;
    }

    /**
     * Gets the value of the trfEvt property.
     * 
     * @return
     *     possible object is
     *     {@link TransferEvent1 }
     *     
     */
    public TransferEvent1 getTrfEvt() {
        return trfEvt;
    }

    /**
     * Sets the value of the trfEvt property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferEvent1 }
     *     
     */
    public DailyFundTransfer1Choice setTrfEvt(TransferEvent1 value) {
        this.trfEvt = value;
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
