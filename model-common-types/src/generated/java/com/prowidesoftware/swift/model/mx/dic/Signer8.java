
package com.prowidesoftware.swift.model.mx.dic;

import java.math.BigDecimal;
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
 * Entity who has signed the data and its digital signature.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Signer8", propOrder = {
    "vrsn",
    "sgnrId",
    "dgstAlgo",
    "sgndAttrbts",
    "sgntrAlgo",
    "sgntr"
})
public class Signer8 {

    @XmlElement(name = "Vrsn")
    protected BigDecimal vrsn;
    @XmlElement(name = "SgnrId")
    protected Recipient13Choice sgnrId;
    @XmlElement(name = "DgstAlgo", required = true)
    protected AlgorithmIdentification36 dgstAlgo;
    @XmlElement(name = "SgndAttrbts")
    protected List<GenericInformation1> sgndAttrbts;
    @XmlElement(name = "SgntrAlgo", required = true)
    protected AlgorithmIdentification33 sgntrAlgo;
    @XmlElement(name = "Sgntr", required = true)
    protected byte[] sgntr;

    /**
     * Gets the value of the vrsn property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVrsn() {
        return vrsn;
    }

    /**
     * Sets the value of the vrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public Signer8 setVrsn(BigDecimal value) {
        this.vrsn = value;
        return this;
    }

    /**
     * Gets the value of the sgnrId property.
     * 
     * @return
     *     possible object is
     *     {@link Recipient13Choice }
     *     
     */
    public Recipient13Choice getSgnrId() {
        return sgnrId;
    }

    /**
     * Sets the value of the sgnrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Recipient13Choice }
     *     
     */
    public Signer8 setSgnrId(Recipient13Choice value) {
        this.sgnrId = value;
        return this;
    }

    /**
     * Gets the value of the dgstAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public AlgorithmIdentification36 getDgstAlgo() {
        return dgstAlgo;
    }

    /**
     * Sets the value of the dgstAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification36 }
     *     
     */
    public Signer8 setDgstAlgo(AlgorithmIdentification36 value) {
        this.dgstAlgo = value;
        return this;
    }

    /**
     * Gets the value of the sgndAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the sgndAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSgndAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GenericInformation1 }
     * 
     * 
     * @return
     *     The value of the sgndAttrbts property.
     */
    public List<GenericInformation1> getSgndAttrbts() {
        if (sgndAttrbts == null) {
            sgndAttrbts = new ArrayList<>();
        }
        return this.sgndAttrbts;
    }

    /**
     * Gets the value of the sgntrAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification33 }
     *     
     */
    public AlgorithmIdentification33 getSgntrAlgo() {
        return sgntrAlgo;
    }

    /**
     * Sets the value of the sgntrAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification33 }
     *     
     */
    public Signer8 setSgntrAlgo(AlgorithmIdentification33 value) {
        this.sgntrAlgo = value;
        return this;
    }

    /**
     * Gets the value of the sgntr property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getSgntr() {
        return sgntr;
    }

    /**
     * Sets the value of the sgntr property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public Signer8 setSgntr(byte[] value) {
        this.sgntr = value;
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
     * Adds a new item to the sgndAttrbts list.
     * @see #getSgndAttrbts()
     * 
     */
    public Signer8 addSgndAttrbts(GenericInformation1 sgndAttrbts) {
        getSgndAttrbts().add(sgndAttrbts);
        return this;
    }

}
