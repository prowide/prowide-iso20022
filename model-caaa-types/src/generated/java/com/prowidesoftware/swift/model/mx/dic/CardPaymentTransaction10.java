
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
 * Cancellation response from the acquirer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardPaymentTransaction10", propOrder = {
    "authstnRslt",
    "actn"
})
public class CardPaymentTransaction10 {

    @XmlElement(name = "AuthstnRslt", required = true)
    protected AuthorisationResult1 authstnRslt;
    @XmlElement(name = "Actn")
    protected List<Action1> actn;

    /**
     * Gets the value of the authstnRslt property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorisationResult1 }
     *     
     */
    public AuthorisationResult1 getAuthstnRslt() {
        return authstnRslt;
    }

    /**
     * Sets the value of the authstnRslt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorisationResult1 }
     *     
     */
    public CardPaymentTransaction10 setAuthstnRslt(AuthorisationResult1 value) {
        this.authstnRslt = value;
        return this;
    }

    /**
     * Gets the value of the actn property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the actn property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getActn().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Action1 }
     * 
     * 
     * @return
     *     The value of the actn property.
     */
    public List<Action1> getActn() {
        if (actn == null) {
            actn = new ArrayList<>();
        }
        return this.actn;
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
     * Adds a new item to the actn list.
     * @see #getActn()
     * 
     */
    public CardPaymentTransaction10 addActn(Action1 actn) {
        getActn().add(actn);
        return this;
    }

}
