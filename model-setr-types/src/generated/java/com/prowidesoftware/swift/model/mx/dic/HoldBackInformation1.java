
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about hold back.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HoldBackInformation1", propOrder = {
    "hldBckAmt",
    "hldBckRlsDt"
})
public class HoldBackInformation1 {

    @XmlElement(name = "HldBckAmt")
    protected ActiveCurrencyAndAmount hldBckAmt;
    @XmlElement(name = "HldBckRlsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar hldBckRlsDt;

    /**
     * Gets the value of the hldBckAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getHldBckAmt() {
        return hldBckAmt;
    }

    /**
     * Sets the value of the hldBckAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public HoldBackInformation1 setHldBckAmt(ActiveCurrencyAndAmount value) {
        this.hldBckAmt = value;
        return this;
    }

    /**
     * Gets the value of the hldBckRlsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getHldBckRlsDt() {
        return hldBckRlsDt;
    }

    /**
     * Sets the value of the hldBckRlsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public HoldBackInformation1 setHldBckRlsDt(XMLGregorianCalendar value) {
        this.hldBckRlsDt = value;
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
