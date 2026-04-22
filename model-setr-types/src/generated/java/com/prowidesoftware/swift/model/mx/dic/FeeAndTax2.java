
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
 * Amount of money associated with a service.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FeeAndTax2", propOrder = {
    "comrclAgrmtRef",
    "indvFee",
    "indvTax",
    "dgtlNtwkFee"
})
public class FeeAndTax2 {

    @XmlElement(name = "ComrclAgrmtRef")
    protected String comrclAgrmtRef;
    @XmlElement(name = "IndvFee")
    protected List<Fee9> indvFee;
    @XmlElement(name = "IndvTax")
    protected List<Tax42> indvTax;
    @XmlElement(name = "DgtlNtwkFee")
    protected List<DigitalPaymentSettlement3> dgtlNtwkFee;

    /**
     * Gets the value of the comrclAgrmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComrclAgrmtRef() {
        return comrclAgrmtRef;
    }

    /**
     * Sets the value of the comrclAgrmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public FeeAndTax2 setComrclAgrmtRef(String value) {
        this.comrclAgrmtRef = value;
        return this;
    }

    /**
     * Gets the value of the indvFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fee9 }
     * 
     * 
     * @return
     *     The value of the indvFee property.
     */
    public List<Fee9> getIndvFee() {
        if (indvFee == null) {
            indvFee = new ArrayList<>();
        }
        return this.indvFee;
    }

    /**
     * Gets the value of the indvTax property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the indvTax property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndvTax().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax42 }
     * 
     * 
     * @return
     *     The value of the indvTax property.
     */
    public List<Tax42> getIndvTax() {
        if (indvTax == null) {
            indvTax = new ArrayList<>();
        }
        return this.indvTax;
    }

    /**
     * Gets the value of the dgtlNtwkFee property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the dgtlNtwkFee property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDgtlNtwkFee().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DigitalPaymentSettlement3 }
     * 
     * 
     * @return
     *     The value of the dgtlNtwkFee property.
     */
    public List<DigitalPaymentSettlement3> getDgtlNtwkFee() {
        if (dgtlNtwkFee == null) {
            dgtlNtwkFee = new ArrayList<>();
        }
        return this.dgtlNtwkFee;
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
     * Adds a new item to the indvFee list.
     * @see #getIndvFee()
     * 
     */
    public FeeAndTax2 addIndvFee(Fee9 indvFee) {
        getIndvFee().add(indvFee);
        return this;
    }

    /**
     * Adds a new item to the indvTax list.
     * @see #getIndvTax()
     * 
     */
    public FeeAndTax2 addIndvTax(Tax42 indvTax) {
        getIndvTax().add(indvTax);
        return this;
    }

    /**
     * Adds a new item to the dgtlNtwkFee list.
     * @see #getDgtlNtwkFee()
     * 
     */
    public FeeAndTax2 addDgtlNtwkFee(DigitalPaymentSettlement3 dgtlNtwkFee) {
        getDgtlNtwkFee().add(dgtlNtwkFee);
        return this;
    }

}
