
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
 * Configuration of the encryption or digital envelope, if the security module is able to perform encryption.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMSecurityConfiguration3", propOrder = {
    "asmmtrcNcrptn",
    "asmmtrcKeyStdId",
    "asmmtrcNcrptnAlgo",
    "smmtrcTrnsprtKey",
    "smmtrcTrnsprtKeyAlgo",
    "smmtrcNcrptnAlgo",
    "ncrptnFrmt"
})
public class ATMSecurityConfiguration3 {

    @XmlElement(name = "AsmmtrcNcrptn")
    protected Boolean asmmtrcNcrptn;
    @XmlElement(name = "AsmmtrcKeyStdId")
    protected Boolean asmmtrcKeyStdId;
    @XmlElement(name = "AsmmtrcNcrptnAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm7Code> asmmtrcNcrptnAlgo;
    @XmlElement(name = "SmmtrcTrnsprtKey")
    protected Boolean smmtrcTrnsprtKey;
    @XmlElement(name = "SmmtrcTrnsprtKeyAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm13Code> smmtrcTrnsprtKeyAlgo;
    @XmlElement(name = "SmmtrcNcrptnAlgo")
    @XmlSchemaType(name = "string")
    protected List<Algorithm15Code> smmtrcNcrptnAlgo;
    @XmlElement(name = "NcrptnFrmt")
    @XmlSchemaType(name = "string")
    protected List<EncryptionFormat1Code> ncrptnFrmt;

    /**
     * Gets the value of the asmmtrcNcrptn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsmmtrcNcrptn() {
        return asmmtrcNcrptn;
    }

    /**
     * Sets the value of the asmmtrcNcrptn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMSecurityConfiguration3 setAsmmtrcNcrptn(Boolean value) {
        this.asmmtrcNcrptn = value;
        return this;
    }

    /**
     * Gets the value of the asmmtrcKeyStdId property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAsmmtrcKeyStdId() {
        return asmmtrcKeyStdId;
    }

    /**
     * Sets the value of the asmmtrcKeyStdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMSecurityConfiguration3 setAsmmtrcKeyStdId(Boolean value) {
        this.asmmtrcKeyStdId = value;
        return this;
    }

    /**
     * Gets the value of the asmmtrcNcrptnAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the asmmtrcNcrptnAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAsmmtrcNcrptnAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm7Code }
     * 
     * 
     * @return
     *     The value of the asmmtrcNcrptnAlgo property.
     */
    public List<Algorithm7Code> getAsmmtrcNcrptnAlgo() {
        if (asmmtrcNcrptnAlgo == null) {
            asmmtrcNcrptnAlgo = new ArrayList<>();
        }
        return this.asmmtrcNcrptnAlgo;
    }

    /**
     * Gets the value of the smmtrcTrnsprtKey property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSmmtrcTrnsprtKey() {
        return smmtrcTrnsprtKey;
    }

    /**
     * Sets the value of the smmtrcTrnsprtKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public ATMSecurityConfiguration3 setSmmtrcTrnsprtKey(Boolean value) {
        this.smmtrcTrnsprtKey = value;
        return this;
    }

    /**
     * Gets the value of the smmtrcTrnsprtKeyAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the smmtrcTrnsprtKeyAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcTrnsprtKeyAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm13Code }
     * 
     * 
     * @return
     *     The value of the smmtrcTrnsprtKeyAlgo property.
     */
    public List<Algorithm13Code> getSmmtrcTrnsprtKeyAlgo() {
        if (smmtrcTrnsprtKeyAlgo == null) {
            smmtrcTrnsprtKeyAlgo = new ArrayList<>();
        }
        return this.smmtrcTrnsprtKeyAlgo;
    }

    /**
     * Gets the value of the smmtrcNcrptnAlgo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the smmtrcNcrptnAlgo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSmmtrcNcrptnAlgo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Algorithm15Code }
     * 
     * 
     * @return
     *     The value of the smmtrcNcrptnAlgo property.
     */
    public List<Algorithm15Code> getSmmtrcNcrptnAlgo() {
        if (smmtrcNcrptnAlgo == null) {
            smmtrcNcrptnAlgo = new ArrayList<>();
        }
        return this.smmtrcNcrptnAlgo;
    }

    /**
     * Gets the value of the ncrptnFrmt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the ncrptnFrmt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNcrptnFrmt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EncryptionFormat1Code }
     * 
     * 
     * @return
     *     The value of the ncrptnFrmt property.
     */
    public List<EncryptionFormat1Code> getNcrptnFrmt() {
        if (ncrptnFrmt == null) {
            ncrptnFrmt = new ArrayList<>();
        }
        return this.ncrptnFrmt;
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
     * Adds a new item to the asmmtrcNcrptnAlgo list.
     * @see #getAsmmtrcNcrptnAlgo()
     * 
     */
    public ATMSecurityConfiguration3 addAsmmtrcNcrptnAlgo(Algorithm7Code asmmtrcNcrptnAlgo) {
        getAsmmtrcNcrptnAlgo().add(asmmtrcNcrptnAlgo);
        return this;
    }

    /**
     * Adds a new item to the smmtrcTrnsprtKeyAlgo list.
     * @see #getSmmtrcTrnsprtKeyAlgo()
     * 
     */
    public ATMSecurityConfiguration3 addSmmtrcTrnsprtKeyAlgo(Algorithm13Code smmtrcTrnsprtKeyAlgo) {
        getSmmtrcTrnsprtKeyAlgo().add(smmtrcTrnsprtKeyAlgo);
        return this;
    }

    /**
     * Adds a new item to the smmtrcNcrptnAlgo list.
     * @see #getSmmtrcNcrptnAlgo()
     * 
     */
    public ATMSecurityConfiguration3 addSmmtrcNcrptnAlgo(Algorithm15Code smmtrcNcrptnAlgo) {
        getSmmtrcNcrptnAlgo().add(smmtrcNcrptnAlgo);
        return this;
    }

    /**
     * Adds a new item to the ncrptnFrmt list.
     * @see #getNcrptnFrmt()
     * 
     */
    public ATMSecurityConfiguration3 addNcrptnFrmt(EncryptionFormat1Code ncrptnFrmt) {
        getNcrptnFrmt().add(ncrptnFrmt);
        return this;
    }

}
