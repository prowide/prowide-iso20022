
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
 * Specifies the details relative to the submission of the certificate data set.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequiredSubmission6", propOrder = {
    "submitr",
    "certTp",
    "certTpDesc"
})
public class RequiredSubmission6 {

    @XmlElement(name = "Submitr", required = true)
    protected List<BICIdentification1> submitr;
    @XmlElement(name = "CertTp", required = true)
    protected String certTp;
    @XmlElement(name = "CertTpDesc", required = true)
    protected String certTpDesc;

    /**
     * Gets the value of the submitr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the submitr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubmitr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BICIdentification1 }
     * 
     * 
     * @return
     *     The value of the submitr property.
     */
    public List<BICIdentification1> getSubmitr() {
        if (submitr == null) {
            submitr = new ArrayList<>();
        }
        return this.submitr;
    }

    /**
     * Gets the value of the certTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertTp() {
        return certTp;
    }

    /**
     * Sets the value of the certTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequiredSubmission6 setCertTp(String value) {
        this.certTp = value;
        return this;
    }

    /**
     * Gets the value of the certTpDesc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCertTpDesc() {
        return certTpDesc;
    }

    /**
     * Sets the value of the certTpDesc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RequiredSubmission6 setCertTpDesc(String value) {
        this.certTpDesc = value;
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
     * Adds a new item to the submitr list.
     * @see #getSubmitr()
     * 
     */
    public RequiredSubmission6 addSubmitr(BICIdentification1 submitr) {
        getSubmitr().add(submitr);
        return this;
    }

}
