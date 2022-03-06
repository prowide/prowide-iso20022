
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
    protected XMLGregorianCalendar trfTm;
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
    public XMLGregorianCalendar getTrfTm() {
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
    public DailyFundTransfer1Choice setTrfTm(XMLGregorianCalendar value) {
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
