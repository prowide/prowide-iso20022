
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the choice of the two leg transaction type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoLegTransactionType4Choice", propOrder = {
    "futrOrOptnDtls",
    "sctiesFincgDtls"
})
public class TwoLegTransactionType4Choice {

    @XmlElement(name = "FutrOrOptnDtls")
    protected FutureOrOptionDetails3 futrOrOptnDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancing12 sctiesFincgDtls;

    /**
     * Gets the value of the futrOrOptnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FutureOrOptionDetails3 }
     *     
     */
    public FutureOrOptionDetails3 getFutrOrOptnDtls() {
        return futrOrOptnDtls;
    }

    /**
     * Sets the value of the futrOrOptnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureOrOptionDetails3 }
     *     
     */
    public TwoLegTransactionType4Choice setFutrOrOptnDtls(FutureOrOptionDetails3 value) {
        this.futrOrOptnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing12 }
     *     
     */
    public SecuritiesFinancing12 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing12 }
     *     
     */
    public TwoLegTransactionType4Choice setSctiesFincgDtls(SecuritiesFinancing12 value) {
        this.sctiesFincgDtls = value;
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
