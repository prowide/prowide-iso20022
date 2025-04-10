
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "Proxy5", propOrder = {
    "prxyTp",
    "prssgndPrxy"
})
public class Proxy5 {

    @XmlElement(name = "PrxyTp", required = true)
    @XmlSchemaType(name = "string")
    protected List<ProxyType2Code> prxyTp;
    @XmlElement(name = "PrssgndPrxy")
    protected IndividualPerson25 prssgndPrxy;

    /**
     * Gets the value of the prxyTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the prxyTp property.
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
     * @return
     *     The value of the prxyTp property.
     */
    public List<ProxyType2Code> getPrxyTp() {
        if (prxyTp == null) {
            prxyTp = new ArrayList<>();
        }
        return this.prxyTp;
    }

    /**
     * Gets the value of the prssgndPrxy property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson25 }
     *     
     */
    public IndividualPerson25 getPrssgndPrxy() {
        return prssgndPrxy;
    }

    /**
     * Sets the value of the prssgndPrxy property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson25 }
     *     
     */
    public Proxy5 setPrssgndPrxy(IndividualPerson25 value) {
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
    public Proxy5 addPrxyTp(ProxyType2Code prxyTp) {
        getPrxyTp().add(prxyTp);
        return this;
    }

}
