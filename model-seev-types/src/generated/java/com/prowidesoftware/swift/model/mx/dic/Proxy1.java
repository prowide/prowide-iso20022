
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Specifies the elements that identify a proxy appointed to represent a party authorised to vote at a shareholders meeting.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Proxy1", propOrder = {
    "prxyTp",
    "prssgndPrxy"
})
public class Proxy1 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected List<ProxyType2Code> prxyTp;
    @XmlElement(name = "PrssgndPrxy")
    protected IndividualPerson14 prssgndPrxy;

    /**
     * Gets the value of the prxyTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prxyTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrxyTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProxyType2Code }
     * 
     * 
     */
    public List<ProxyType2Code> getPrxyTp() {
        if (prxyTp == null) {
            prxyTp = new ArrayList<ProxyType2Code>();
        }
        return this.prxyTp;
    }

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson14 }
     *     
     */
    public IndividualPerson14 getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson14 }
     *     
     */
    public Proxy1 setPrssgndPrxy(IndividualPerson14 value) {
        this.prssgndPrxy = value;
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
     * Adds a new item to the prxyTp list.
     * @see #getPrxyTp()
     * 
     */
    public Proxy1 addPrxyTp(ProxyType2Code prxyTp) {
        getPrxyTp().add(prxyTp);
        return this;
    }

}
