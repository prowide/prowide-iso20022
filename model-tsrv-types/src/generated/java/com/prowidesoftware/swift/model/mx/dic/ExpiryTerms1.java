
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
 * Expiry conditions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExpiryTerms1", propOrder = {
    "dtTm",
    "autoXtnsn",
    "cond",
    "opnEnddInd"
})
public class ExpiryTerms1 {

    @XmlElement(name = "DtTm")
    protected DateAndDateTimeChoice dtTm;
    @XmlElement(name = "AutoXtnsn")
    protected AutoExtension1 autoXtnsn;
    @XmlElement(name = "Cond")
    protected String cond;
    @XmlElement(name = "OpnEnddInd")
    protected Boolean opnEnddInd;

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public DateAndDateTimeChoice getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTimeChoice }
     *     
     */
    public ExpiryTerms1 setDtTm(DateAndDateTimeChoice value) {
        this.dtTm = value;
        return this;
    }

    /**
     * Gets the value of the autoXtnsn property.
     * 
     * @return
     *     possible object is
     *     {@link AutoExtension1 }
     *     
     */
    public AutoExtension1 getAutoXtnsn() {
        return autoXtnsn;
    }

    /**
     * Sets the value of the autoXtnsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link AutoExtension1 }
     *     
     */
    public ExpiryTerms1 setAutoXtnsn(AutoExtension1 value) {
        this.autoXtnsn = value;
        return this;
    }

    /**
     * Gets the value of the cond property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCond() {
        return cond;
    }

    /**
     * Sets the value of the cond property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ExpiryTerms1 setCond(String value) {
        this.cond = value;
        return this;
    }

    /**
     * Gets the value of the opnEnddInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOpnEnddInd() {
        return opnEnddInd;
    }

    /**
     * Sets the value of the opnEnddInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ExpiryTerms1 setOpnEnddInd(Boolean value) {
        this.opnEnddInd = value;
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
