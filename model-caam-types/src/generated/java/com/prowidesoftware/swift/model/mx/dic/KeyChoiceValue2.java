
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
 * Element containing the key information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KeyChoiceValue2", propOrder = {
    "ncrptdKeyVal",
    "trRltdData"
})
public class KeyChoiceValue2 {

    @XmlElement(name = "NcrptdKeyVal")
    protected ContentInformationType10 ncrptdKeyVal;
    @XmlElement(name = "TRRltdData")
    protected TRRelatedData2 trRltdData;

    /**
     * Gets the value of the ncrptdKeyVal property.
     * 
     * @return
     *     possible object is
     *     {@link ContentInformationType10 }
     *     
     */
    public ContentInformationType10 getNcrptdKeyVal() {
        return ncrptdKeyVal;
    }

    /**
     * Sets the value of the ncrptdKeyVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentInformationType10 }
     *     
     */
    public KeyChoiceValue2 setNcrptdKeyVal(ContentInformationType10 value) {
        this.ncrptdKeyVal = value;
        return this;
    }

    /**
     * Gets the value of the trRltdData property.
     * 
     * @return
     *     possible object is
     *     {@link TRRelatedData2 }
     *     
     */
    public TRRelatedData2 getTRRltdData() {
        return trRltdData;
    }

    /**
     * Sets the value of the trRltdData property.
     * 
     * @param value
     *     allowed object is
     *     {@link TRRelatedData2 }
     *     
     */
    public KeyChoiceValue2 setTRRltdData(TRRelatedData2 value) {
        this.trRltdData = value;
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
