
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Identifies the underlying (group of) transaction(s) to which the investigation applies.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnderlyingTransaction20", propOrder = {
    "orgnlGrpInfAndCxl",
    "txInf"
})
public class UnderlyingTransaction20 {

    @XmlElement(name = "OrgnlGrpInfAndCxl")
    protected OriginalGroupHeader10 orgnlGrpInfAndCxl;
    @XmlElement(name = "TxInf")
    protected List<PaymentTransaction89> txInf;

    /**
     * Gets the value of the orgnlGrpInfAndCxl property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalGroupHeader10 }
     *     
     */
    public OriginalGroupHeader10 getOrgnlGrpInfAndCxl() {
        return orgnlGrpInfAndCxl;
    }

    /**
     * Sets the value of the orgnlGrpInfAndCxl property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalGroupHeader10 }
     *     
     */
    public UnderlyingTransaction20 setOrgnlGrpInfAndCxl(OriginalGroupHeader10 value) {
        this.orgnlGrpInfAndCxl = value;
        return this;
    }

    /**
     * Gets the value of the txInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the txInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTxInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentTransaction89 }
     * 
     * 
     * @return
     *     The value of the txInf property.
     */
    public List<PaymentTransaction89> getTxInf() {
        if (txInf == null) {
            txInf = new ArrayList<>();
        }
        return this.txInf;
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

    /**
     * Adds a new item to the txInf list.
     * @see #getTxInf()
     * 
     */
    public UnderlyingTransaction20 addTxInf(PaymentTransaction89 txInf) {
        getTxInf().add(txInf);
        return this;
    }

}
