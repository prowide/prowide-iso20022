
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
 * Choice between reversal by reference or by reversal details.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Reversal5Choice", propOrder = {
    "refs",
    "trfOutConfDtls"
})
public class Reversal5Choice {

    @XmlElement(name = "Refs")
    protected List<TransferReference6> refs;
    @XmlElement(name = "TrfOutConfDtls")
    protected TransferOut14 trfOutConfDtls;

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
     * {@link TransferReference6 }
     * 
     * 
     */
    public List<TransferReference6> getRefs() {
        if (refs == null) {
            refs = new ArrayList<TransferReference6>();
        }
        return this.refs;
    }

    /**
     * Gets the value of the trfOutConfDtls property.
     * 
     * @return
     *     possible object is
     *     {@link TransferOut14 }
     *     
     */
    public TransferOut14 getTrfOutConfDtls() {
        return trfOutConfDtls;
    }

    /**
     * Sets the value of the trfOutConfDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferOut14 }
     *     
     */
    public Reversal5Choice setTrfOutConfDtls(TransferOut14 value) {
        this.trfOutConfDtls = value;
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
    public Reversal5Choice addRefs(TransferReference6 refs) {
        getRefs().add(refs);
        return this;
    }

}
