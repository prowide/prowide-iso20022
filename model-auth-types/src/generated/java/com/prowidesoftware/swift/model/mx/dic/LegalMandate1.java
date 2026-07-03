
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Provides details on the legal basis of the request.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegalMandate1", propOrder = {
    "prgrph",
    "dsclmr"
})
public class LegalMandate1 {

    @XmlElement(name = "Prgrph", required = true)
    protected String prgrph;
    @XmlElement(name = "Dsclmr")
    protected String dsclmr;

    /**
     * Gets the value of the prgrph property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrgrph() {
        return prgrph;
    }

    /**
     * Sets the value of the prgrph property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegalMandate1 setPrgrph(String value) {
        this.prgrph = value;
        return this;
    }

    /**
     * Gets the value of the dsclmr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDsclmr() {
        return dsclmr;
    }

    /**
     * Sets the value of the dsclmr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LegalMandate1 setDsclmr(String value) {
        this.dsclmr = value;
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
