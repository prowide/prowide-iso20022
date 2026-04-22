
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
 * Information to identify funds order(s).
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageAndBusinessReference15", propOrder = {
    "ref",
    "rltdRef",
    "ordrRef"
})
public class MessageAndBusinessReference15 {

    @XmlElement(name = "Ref")
    protected References87Choice ref;
    @XmlElement(name = "RltdRef")
    protected AdditionalReference10 rltdRef;
    @XmlElement(name = "OrdrRef")
    protected List<InvestmentFundOrder12> ordrRef;

    /**
     * Gets the value of the ref property.
     * 
     * @return
     *     possible object is
     *     {@link References87Choice }
     *     
     */
    public References87Choice getRef() {
        return ref;
    }

    /**
     * Sets the value of the ref property.
     * 
     * @param value
     *     allowed object is
     *     {@link References87Choice }
     *     
     */
    public MessageAndBusinessReference15 setRef(References87Choice value) {
        this.ref = value;
        return this;
    }

    /**
     * Gets the value of the rltdRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference10 }
     *     
     */
    public AdditionalReference10 getRltdRef() {
        return rltdRef;
    }

    /**
     * Sets the value of the rltdRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference10 }
     *     
     */
    public MessageAndBusinessReference15 setRltdRef(AdditionalReference10 value) {
        this.rltdRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ordrRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOrdrRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvestmentFundOrder12 }
     * 
     * 
     * @return
     *     The value of the ordrRef property.
     */
    public List<InvestmentFundOrder12> getOrdrRef() {
        if (ordrRef == null) {
            ordrRef = new ArrayList<>();
        }
        return this.ordrRef;
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
     * Adds a new item to the ordrRef list.
     * @see #getOrdrRef()
     * 
     */
    public MessageAndBusinessReference15 addOrdrRef(InvestmentFundOrder12 ordrRef) {
        getOrdrRef().add(ordrRef);
        return this;
    }

}
