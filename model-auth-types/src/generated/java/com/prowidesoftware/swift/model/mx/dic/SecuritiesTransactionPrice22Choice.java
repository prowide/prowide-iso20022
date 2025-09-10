
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
 * Choice element capturing strike price related descriptive information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionPrice22Choice", propOrder = {
    "pric",
    "dgtlTknPric",
    "noPric"
})
public class SecuritiesTransactionPrice22Choice {

    @XmlElement(name = "Pric")
    protected SecuritiesTransactionPrice2Choice pric;
    @XmlElement(name = "DgtlTknPric")
    protected SecuritiesTransactionPrice7 dgtlTknPric;
    @XmlElement(name = "NoPric")
    protected SecuritiesTransactionPrice6 noPric;

    /**
     * Gets the value of the pric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice2Choice getPric() {
        return pric;
    }

    /**
     * Sets the value of the pric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice2Choice }
     *     
     */
    public SecuritiesTransactionPrice22Choice setPric(SecuritiesTransactionPrice2Choice value) {
        this.pric = value;
        return this;
    }

    /**
     * Gets the value of the dgtlTknPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice7 }
     *     
     */
    public SecuritiesTransactionPrice7 getDgtlTknPric() {
        return dgtlTknPric;
    }

    /**
     * Sets the value of the dgtlTknPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice7 }
     *     
     */
    public SecuritiesTransactionPrice22Choice setDgtlTknPric(SecuritiesTransactionPrice7 value) {
        this.dgtlTknPric = value;
        return this;
    }

    /**
     * Gets the value of the noPric property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionPrice6 }
     *     
     */
    public SecuritiesTransactionPrice6 getNoPric() {
        return noPric;
    }

    /**
     * Sets the value of the noPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionPrice6 }
     *     
     */
    public SecuritiesTransactionPrice22Choice setNoPric(SecuritiesTransactionPrice6 value) {
        this.noPric = value;
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
