
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
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
@XmlType(name = "Cancellation5Choice", propOrder = {
    "refs",
    "trfInDtls"
})
public class Cancellation5Choice {

    @XmlElement(name = "Refs")
    protected List<TransferReference5> refs;
    @XmlElement(name = "TrfInDtls")
    protected TransferIn10 trfInDtls;

    /**
     * Gets the value of the refs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the refs property.
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
     * {@link TransferReference5 }
     * 
     * 
     */
    public List<TransferReference5> getRefs() {
        if (refs == null) {
            refs = new ArrayList<TransferReference5>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the trfInDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferIn10 }
     *     
     */
    public TransferIn10 getTrfInDtls() {
        return trfInDtls;
    }

    /**
     * Sets the value of the trfInDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferIn10 }
     *     
     */
    public Cancellation5Choice setTrfInDtls(TransferIn10 value) {
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
    public Cancellation5Choice addRefs(TransferReference5 refs) {
        getRefs().add(refs);
        return this;
    }

}
