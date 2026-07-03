
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
 * Specifies the choice of the two leg transaction type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TwoLegTransactionType1Choice", propOrder = {
    "futrOrOptnDtls",
    "sctiesFincgDtls"
})
public class TwoLegTransactionType1Choice {

    @XmlElement(name = "FutrOrOptnDtls")
    protected FutureOrOptionDetails1 futrOrOptnDtls;
    @XmlElement(name = "SctiesFincgDtls")
    protected SecuritiesFinancing10 sctiesFincgDtls;

    /**
     * Gets the value of the futrOrOptnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FutureOrOptionDetails1 }
     *     
     */
    public FutureOrOptionDetails1 getFutrOrOptnDtls() {
        return futrOrOptnDtls;
    }

    /**
     * Sets the value of the futrOrOptnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FutureOrOptionDetails1 }
     *     
     */
    public TwoLegTransactionType1Choice setFutrOrOptnDtls(FutureOrOptionDetails1 value) {
        this.futrOrOptnDtls = value;
        return this;
    }

    /**
     * Gets the value of the sctiesFincgDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesFinancing10 }
     *     
     */
    public SecuritiesFinancing10 getSctiesFincgDtls() {
        return sctiesFincgDtls;
    }

    /**
     * Sets the value of the sctiesFincgDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesFinancing10 }
     *     
     */
    public TwoLegTransactionType1Choice setSctiesFincgDtls(SecuritiesFinancing10 value) {
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
