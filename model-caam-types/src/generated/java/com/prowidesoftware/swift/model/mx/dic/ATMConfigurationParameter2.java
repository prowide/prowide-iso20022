
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
 * Parameters to be used by the various cryptographic key commands.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ATMConfigurationParameter2", propOrder = {
    "keyCtgy",
    "hstChllng",
    "cert",
    "keyProps"
})
public class ATMConfigurationParameter2 {

    @XmlElement(name = "KeyCtgy")
    @XmlSchemaType(name = "string")
    protected CryptographicKeyType4Code keyCtgy;
    @XmlElement(name = "HstChllng")
    protected byte[] hstChllng;
    @XmlElement(name = "Cert")
    protected List<byte[]> cert;
    @XmlElement(name = "KeyProps")
    protected List<KEKIdentifier4> keyProps;

    /**
     * Gets the value of the keyCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link CryptographicKeyType4Code }
     *     
     */
    public CryptographicKeyType4Code getKeyCtgy() {
        return keyCtgy;
    }

    /**
     * Sets the value of the keyCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link CryptographicKeyType4Code }
     *     
     */
    public ATMConfigurationParameter2 setKeyCtgy(CryptographicKeyType4Code value) {
        this.keyCtgy = value;
        return this;
    }

    /**
     * Gets the value of the hstChllng property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHstChllng() {
        return hstChllng;
    }

    /**
     * Sets the value of the hstChllng property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public ATMConfigurationParameter2 setHstChllng(byte[] value) {
        this.hstChllng = value;
        return this;
    }

    /**
     * Gets the value of the cert property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cert property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCert().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * byte[]
     * 
     */
    public List<byte[]> getCert() {
        if (cert == null) {
            cert = new ArrayList<byte[]>();
        }
        return this.cert;
    }

    /**
     * Gets the value of the keyProps property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyProps property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyProps().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KEKIdentifier4 }
     * 
     * 
     */
    public List<KEKIdentifier4> getKeyProps() {
        if (keyProps == null) {
            keyProps = new ArrayList<KEKIdentifier4>();
        }
        return this.keyProps;
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
     * Adds a new item to the cert list.
     * @see #getCert()
     * 
     */
    public ATMConfigurationParameter2 addCert(byte[] cert) {
        getCert().add(cert);
        return this;
    }

    /**
     * Adds a new item to the keyProps list.
     * @see #getKeyProps()
     * 
     */
    public ATMConfigurationParameter2 addKeyProps(KEKIdentifier4 keyProps) {
        getKeyProps().add(keyProps);
        return this;
    }

}
