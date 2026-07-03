
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
 * Identification of a financial instrument or of a non-equity sub-class
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstrumentOrSubClassIdentification2Choice", propOrder = {
    "isinAndSubClss",
    "asstClssAndSubClss"
})
public class InstrumentOrSubClassIdentification2Choice {

    @XmlElement(name = "ISINAndSubClss")
    protected InstrumentAndSubClassIdentification2 isinAndSubClss;
    @XmlElement(name = "AsstClssAndSubClss")
    protected AssetClassAndSubClassIdentification2 asstClssAndSubClss;

    /**
     * Gets the value of the isinAndSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentAndSubClassIdentification2 }
     *     
     */
    public InstrumentAndSubClassIdentification2 getISINAndSubClss() {
        return isinAndSubClss;
    }

    /**
     * Sets the value of the isinAndSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentAndSubClassIdentification2 }
     *     
     */
    public InstrumentOrSubClassIdentification2Choice setISINAndSubClss(InstrumentAndSubClassIdentification2 value) {
        this.isinAndSubClss = value;
        return this;
    }

    /**
     * Gets the value of the asstClssAndSubClss property.
     * 
     * @return
     *     possible object is
     *     {@link AssetClassAndSubClassIdentification2 }
     *     
     */
    public AssetClassAndSubClassIdentification2 getAsstClssAndSubClss() {
        return asstClssAndSubClss;
    }

    /**
     * Sets the value of the asstClssAndSubClss property.
     * 
     * @param value
     *     allowed object is
     *     {@link AssetClassAndSubClassIdentification2 }
     *     
     */
    public InstrumentOrSubClassIdentification2Choice setAsstClssAndSubClss(AssetClassAndSubClassIdentification2 value) {
        this.asstClssAndSubClss = value;
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
