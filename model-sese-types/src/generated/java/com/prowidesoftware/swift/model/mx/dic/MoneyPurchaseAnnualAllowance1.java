
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Information about a Money Purchase Annual Allowance (MPAA).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MoneyPurchaseAnnualAllowance1", propOrder = {
    "trggrd",
    "trggrdDt"
})
public class MoneyPurchaseAnnualAllowance1 {

    @XmlElement(name = "Trggrd")
    protected boolean trggrd;
    @XmlElement(name = "TrggrdDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar trggrdDt;

    /**
     * Gets the value of the trggrd property.
     * 
     */
    public boolean isTrggrd() {
        return trggrd;
    }

    /**
     * Sets the value of the trggrd property.
     * 
     */
    public MoneyPurchaseAnnualAllowance1 setTrggrd(boolean value) {
        this.trggrd = value;
        return this;
    }

    /**
     * Gets the value of the trggrdDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getTrggrdDt() {
        return trggrdDt;
    }

    /**
     * Sets the value of the trggrdDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MoneyPurchaseAnnualAllowance1 setTrggrdDt(XMLGregorianCalendar value) {
        this.trggrdDt = value;
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
