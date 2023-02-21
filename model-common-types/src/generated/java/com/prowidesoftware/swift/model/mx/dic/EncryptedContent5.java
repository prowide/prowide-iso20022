
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
 * Encrypted data with an encryption key.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptedContent5", propOrder = {
    "cnttTp",
    "cnttNcrptnAlgo",
    "ncrptdDataElmt"
})
public class EncryptedContent5 {

    @XmlElement(name = "CnttTp", required = true)
    @XmlSchemaType(name = "string")
    protected ContentType2Code cnttTp;
    @XmlElement(name = "CnttNcrptnAlgo", required = true)
    protected AlgorithmIdentification25 cnttNcrptnAlgo;
    @XmlElement(name = "NcrptdDataElmt", required = true)
    protected List<EncryptedDataElement1> ncrptdDataElmt;

    /**
     * Gets the value of the cnttTp property.
     * 
     * @return
     *     possible object is
     *     {@link ContentType2Code }
     *     
     */
    public ContentType2Code getCnttTp() {
        return cnttTp;
    }

    /**
     * Sets the value of the cnttTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContentType2Code }
     *     
     */
    public EncryptedContent5 setCnttTp(ContentType2Code value) {
        this.cnttTp = value;
        return this;
    }

    /**
     * Gets the value of the cnttNcrptnAlgo property.
     * 
     * @return
     *     possible object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public AlgorithmIdentification25 getCnttNcrptnAlgo() {
        return cnttNcrptnAlgo;
    }

    /**
     * Sets the value of the cnttNcrptnAlgo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AlgorithmIdentification25 }
     *     
     */
    public EncryptedContent5 setCnttNcrptnAlgo(AlgorithmIdentification25 value) {
        this.cnttNcrptnAlgo = value;
        return this;
    }

    /**
     * Gets the value of the ncrptdDataElmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ncrptdDataElmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptdDataElmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptedDataElement1 }
     * 
     * 
     */
    public List<EncryptedDataElement1> getNcrptdDataElmt() {
        if (ncrptdDataElmt == null) {
            ncrptdDataElmt = new ArrayList<EncryptedDataElement1>();
        }
        return this.ncrptdDataElmt;
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
     * Adds a new item to the ncrptdDataElmt list.
     * @see #getNcrptdDataElmt()
     * 
     */
    public EncryptedContent5 addNcrptdDataElmt(EncryptedDataElement1 ncrptdDataElmt) {
        getNcrptdDataElmt().add(ncrptdDataElmt);
        return this;
    }

}
