
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
 * Method and data intended to be verified as well as the related results.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Verification1", propOrder = {
    "tp",
    "othrTp",
    "subTp",
    "vrfctnInf",
    "vrfctnRslt"
})
public class Verification1 {

    @XmlElement(name = "Tp")
    @XmlSchemaType(name = "string")
    protected AuthenticationMethod11Code tp;
    @XmlElement(name = "OthrTp")
    protected String othrTp;
    @XmlElement(name = "SubTp")
    protected String subTp;
    @XmlElement(name = "VrfctnInf")
    protected List<VerificationInformation1> vrfctnInf;
    @XmlElement(name = "VrfctnRslt")
    protected List<VerificationResult1> vrfctnRslt;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationMethod11Code }
     *     
     */
    public AuthenticationMethod11Code getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationMethod11Code }
     *     
     */
    public Verification1 setTp(AuthenticationMethod11Code value) {
        this.tp = value;
        return this;
    }

    /**
     * Gets the value of the othrTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOthrTp() {
        return othrTp;
    }

    /**
     * Sets the value of the othrTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification1 setOthrTp(String value) {
        this.othrTp = value;
        return this;
    }

    /**
     * Gets the value of the subTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubTp() {
        return subTp;
    }

    /**
     * Sets the value of the subTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Verification1 setSubTp(String value) {
        this.subTp = value;
        return this;
    }

    /**
     * Gets the value of the vrfctnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationInformation1 }
     * 
     * 
     * @return
     *     The value of the vrfctnInf property.
     */
    public List<VerificationInformation1> getVrfctnInf() {
        if (vrfctnInf == null) {
            vrfctnInf = new ArrayList<>();
        }
        return this.vrfctnInf;
    }

    /**
     * Gets the value of the vrfctnRslt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the vrfctnRslt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVrfctnRslt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VerificationResult1 }
     * 
     * 
     * @return
     *     The value of the vrfctnRslt property.
     */
    public List<VerificationResult1> getVrfctnRslt() {
        if (vrfctnRslt == null) {
            vrfctnRslt = new ArrayList<>();
        }
        return this.vrfctnRslt;
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
     * Adds a new item to the vrfctnInf list.
     * @see #getVrfctnInf()
     * 
     */
    public Verification1 addVrfctnInf(VerificationInformation1 vrfctnInf) {
        getVrfctnInf().add(vrfctnInf);
        return this;
    }

    /**
     * Adds a new item to the vrfctnRslt list.
     * @see #getVrfctnRslt()
     * 
     */
    public Verification1 addVrfctnRslt(VerificationResult1 vrfctnRslt) {
        getVrfctnRslt().add(vrfctnRslt);
        return this;
    }

}
