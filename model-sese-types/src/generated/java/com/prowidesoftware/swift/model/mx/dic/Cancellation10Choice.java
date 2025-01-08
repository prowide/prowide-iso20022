
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
 * Choice between cancellation by reference or by transfer details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cancellation10Choice", propOrder = {
    "refs",
    "trfInDtls"
})
public class Cancellation10Choice {

    @XmlElement(name = "Refs")
    protected List<TransferReference9> refs;
    @XmlElement(name = "TrfInDtls")
    protected TransferIn15 trfInDtls;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the refs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRefs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferReference9 }
     * 
     * 
     * @return
     *     The value of the refs property.
     */
    public List<TransferReference9> getRefs() {
        if (refs == null) {
            refs = new ArrayList<>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the trfInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn15 }
     *     
     */
    public TransferIn15 getTrfInDtls() {
        return trfInDtls;
    }

    /**
     * Sets the value of the trfInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn15 }
     *     
     */
    public Cancellation10Choice setTrfInDtls(TransferIn15 value) {
        this.trfInDtls = value;
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

    /**
     * Adds a new item to the refs list.
     * @see #getRefs()
     * 
     */
    public Cancellation10Choice addRefs(TransferReference9 refs) {
        getRefs().add(refs);
        return this;
    }

}
